import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private double prevMonthReading;
    private double currMonthReading;

    public ElectricityBill(int consumerNo, String consumerName, double prevMonthReading, double currMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
    }

    public double calculateBill() {
        double unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1 + 100 * 2.5 + (unitsConsumed - 200) * 4;
        } else {
            billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
        }

        return billAmount;
    }

    public void displayBill() {
        double billAmount = calculateBill();
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No.: ");
        int consumerNo = scanner.nextInt();

        System.out.print("Enter Consumer Name: ");
        scanner.nextLine(); // Consume the newline character
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double prevMonthReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currMonthReading = scanner.nextDouble();

        ElectricityBill electricityBill = new ElectricityBill(consumerNo, consumerName, prevMonthReading, currMonthReading);
        electricityBill.displayBill();

        scanner.close();
    }
}