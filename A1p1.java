import java.util.Scanner;

public class A1p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(args [0]);

        if (n <= 0) {
            System.out.println("Invalid input. Please provide a positive integer.");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The original integers are:");
        printArray(numbers);

        updateArray(numbers);

        System.out.println("The triples in reverse order are:");
        printArray(numbers);
    }

    private static void updateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }

        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
