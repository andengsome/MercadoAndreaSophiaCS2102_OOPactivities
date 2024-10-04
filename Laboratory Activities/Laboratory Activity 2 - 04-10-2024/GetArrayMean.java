import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean (int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.err.print("Enter element " + (i + 1) + ": ");

            arr[i] = input.nextInt();
        }

        double mean = getArrayMean(arr);
        System.out.println("The mean of the array is: " + String.format("%.2f", mean));

        input.close();
    }
}