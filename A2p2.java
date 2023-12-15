import java.util.Scanner;

public class A2p2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a positive integer as a command line argument.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a positive integer as a command line argument.");
            return;
        }

        if (n <= 0) {
            System.out.println("Please provide a positive integer as a command line argument.");
            return;
        }

        int[] numbers = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The original integers are:");
        printArray(numbers);

        reverseTriplets(numbers);

        System.out.println("The triplets reversed integers are:");
        printArray(numbers);
    }

    public static void reverseTriplets(int[] numbers) {
        int start = 0;

        while (start <= numbers.length - 3) {
            reverse(numbers, start, start + 2);
            start += 3;
        }
    }

    public static void reverse(int[] numbers, int left, int right) {
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
