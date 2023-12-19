import java.util.*;
class NthLargestNumber_in_an_array_assignment_day2_q3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the value of N: ");
        int N = s.nextInt();
        if (N > 0 && N <= size) 
        {
            Arrays.sort(array);
            int nthLargest = array[size - N];
            System.out.println("The " + N + "th largest number in the array is: " + nthLargest);
        } 
        else 
        {
            System.out.println("Invalid input for N. N should be between 1 and " + size);
        }
    }
}