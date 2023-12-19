import java.util.*;
class RemoveDuplicatesFromArray 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arrayWithDuplicates = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            arrayWithDuplicates[i] = s.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arrayWithDuplicates);
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);
        System.out.println("\nArray After Removing Duplicates: ");
        printArray(arrayWithoutDuplicates);
        s.close();
    }
    private static int[] removeDuplicates(int[] array) 
    {
        int n = array.length;
        for (int i = 0; i < n; i++) 
        {
            if (array[i] != Integer.MIN_VALUE) 
            {
                int currentElement = array[i];
                for (int j = i + 1; j < n; j++) 
                {
                    if (array[j] == currentElement) 
                    {
                        array[j] = Integer.MIN_VALUE;
                    }
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) 
        {
            if (array[i] != Integer.MIN_VALUE) 
            {
                uniqueCount++;
            }
        }
        int[] resultArray = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < n; i++) 
        {
            if (array[i] != Integer.MIN_VALUE) 
            {
                resultArray[index++] = array[i];
            }
        }
        return resultArray;
    }
    private static void printArray(int[] array) 
    {
        for (int value : array) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}