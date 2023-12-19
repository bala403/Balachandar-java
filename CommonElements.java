import java.util.Scanner;
class CommonElements 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = s.nextInt();
        int array1[] = new int[n1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n1; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = s.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = s.nextInt();
        int array2[] = new int[n2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n2; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = s.nextInt();
        }
        System.out.println("Array 1: ");
        printArray(array1);
        System.out.println("Array 2: ");
        printArray(array2);
        int[] commonElements = findCommonElements(array1, array2);
        if (commonElements.length > 0) 
        {
            System.out.print("Common Elements: ");
            printArray(commonElements);
        } 
        else 
        {
            System.out.println("No common elements found.");
        }
        s.close();
    }
    private static void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i]);
            if (i < array.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    private static int[] findCommonElements(int[] array1, int[] array2) 
    {
        int[] smallerArray = (array1.length <= array2.length) ? array1 : array2;
        int[] largerArray = (array1.length <= array2.length) ? array2 : array1;
        int commonCount = 0;
        for (int element : smallerArray) 
        {
            if (containsElement(largerArray, element)) 
            {
                commonCount++;
            }
        }
        int[] commonElements = new int[commonCount];
        int index = 0;
        for (int element : smallerArray) 
        {
            if (containsElement(largerArray, element)) 
            {
                commonElements[index++] = element;
            }
        }
        return commonElements;
    }
    private static boolean containsElement(int[] array, int element) 
    {
        for (int value : array) 
        {
            if (value == element) 
            {
                return true;
            }
        }
        return false;
    }
}