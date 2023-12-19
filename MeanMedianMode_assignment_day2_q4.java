import java.util.*;
class MeanMedianMode_assignment_day2_q4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        double mean = 0;
        for (int num : array) 
        {
            mean += num;
        }
        mean /= size;
        Arrays.sort(array);
        int median;
        if (size % 2 == 1) 
        {
            median = array[size / 2];
        }
        else 
        {
            median = (array[size / 2] + array[size / 2 - 1]) / 2;
        }
        int mode = array[0];
        int maxFrequency = 1;
        for (int i = 0; i < size; i++) 
        {
            int frequency = 1;
            for (int j = i + 1; j < size; j++) 
            {
                if (array[i] == array[j]) 
                {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) 
            {
                maxFrequency = frequency;
                mode = array[i];
            }
        }
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}