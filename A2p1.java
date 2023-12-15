import java.util.Scanner;

public class A2p1 {
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
        Scanner input = new Scanner (System.in);
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = input.nextLine();
        }

        findLongestAndShortestStrings(strings);
    }

    public static void findLongestAndShortestStrings(String[] strings) {
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for (String str : strings) {
            int length = str.length();

            if (length > maxLength) {
                maxLength = length;
            }

            if (length < minLength) {
                minLength = length;
            }
        }

        System.out.println("The longest input strings are:");
        for (String str : strings) {
            if (str.length() == maxLength) {
                System.out.println(str);
            }
        }

        System.out.println("The shortest input strings are:");
        for (String str : strings) {
            if (str.length() == minLength) {
                System.out.println(str);
            }
        }
    }
}
