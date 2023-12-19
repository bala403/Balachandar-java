import java.util.Scanner;

class Medication {
    private String name;
    private int quantity;

    public Medication(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class Patient {
    private String name;
    private String phoneNumber;

    public Patient(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

public class PharmacyManagementSystem {
    private static final int MAX_MEDICATIONS = 100;
    private static final int MAX_PATIENTS = 100;
    private Medication[] medications = new Medication[MAX_MEDICATIONS];
    private Patient[] patients = new Patient[MAX_PATIENTS];
    private int medicationCount = 0;
    private int patientCount = 0;

    public void addMedication(String name, int quantity) {
        if (medicationCount < MAX_MEDICATIONS) {
            medications[medicationCount++] = new Medication(name, quantity);
            System.out.println("Medication added successfully.");
        } else {
            System.out.println("Medication limit reached. Cannot add more medications.");
        }
    }

    public void displayMedications() {
        for (int i = 0; i < medicationCount; i++) {
            System.out.println(medications[i].toString());
        }
    }

    public void sellMedication(String name, int quantity, String patientName, String phoneNumber) {
        boolean found = false;
        for (int i = 0; i < medicationCount; i++) {
            if (medications[i].getName().equalsIgnoreCase(name)) {
                found = true;
                if (medications[i].getQuantity() >= quantity) {
                    medications[i].setQuantity(medications[i].getQuantity() - quantity);
                    patients[patientCount++] = new Patient(patientName, phoneNumber);
                    System.out.println(quantity + " units of " + name + " sold successfully to " + patientName + " (Phone: " + phoneNumber + ").");
                    return;
                } else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                    return;
                }
            }
        }
        if (!found) {
            System.out.println(name + " not found in the inventory.");
        }
    }

    public void displayPatients() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i].toString());
        }
    }

    public static void main(String[] args) {
        PharmacyManagementSystem pharmacy = new PharmacyManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPharmacy Management System Menu:");
            System.out.println("1. Add Medication");
            System.out.println("2. Display Medications");
            System.out.println("3. Sell Medication");
            System.out.println("4. Display Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter medication name: ");
                    String name = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    pharmacy.addMedication(name, quantity);
                    break;
                case 2:
                    pharmacy.displayMedications();
                    break;
                case 3:
                    System.out.print("Enter medication name to sell: ");
                    String sellName = scanner.next();
                    System.out.print("Enter quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.next();
		    
                    System.out.print("Enter patient phone number: ");
                    String phoneNumber = scanner.next();
                    pharmacy.sellMedication(sellName, sellQuantity, patientName, phoneNumber);
                    break;
                case 4:
                    pharmacy.displayPatients();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
