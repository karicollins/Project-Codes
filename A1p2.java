import java.util.Scanner;

public class A1p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int n = Integer.parseInt(args [0]);

        if (n < 2) {
            System.out.println("Invalid input. Please provide a positive integer n greater than or equal to 2.");
            return;
        }

        int[] numbers = new int[n];

       

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largestOdd = findLargestOdd(numbers);
        int smallestEven = findSmallestEven(numbers);

        System.out.println("The largest odd input integer is " + largestOdd + ".");
        System.out.println("The smallest even input integer is " + smallestEven + ".");
    }

    private static int findLargestOdd(int[] array) {
        int largestOdd = Integer.MIN_VALUE;

        for (int number : array) {
            if (number % 2 != 0 && number > largestOdd) {
                largestOdd = number;
            }
        }

        return largestOdd;
    }

    private static int findSmallestEven(int[] array) {
        int smallestEven = Integer.MAX_VALUE;

        for (int number : array) {
            if (number % 2 == 0 && number < smallestEven) {
                smallestEven = number;
            }
        }

        return smallestEven;
    }
}