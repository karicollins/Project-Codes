package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		
		int[] arr1 = inputArray(8);
		int[] arr2 = inputArray(8);
		
		System.out.println("The average of the first array provided is " + average(arr1) + ".");
		
		int[] resultingArray = add(arr1, arr2);
		
		displayArray(resultingArray);
		
	}
	
	public static int[] inputArray(int size) {
		
		int[] inputArr = new int[size];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + size + " integer values to add to the array.");
		
			for (int i =0; i<size; i++){
				
				inputArr[i] = sc.nextInt();
			}
			
		return inputArr;
	}
	
	public static double average (int[] list) {
		int sum = 0;
		for (int i=0;i<list.length;i++) {
			sum = sum+list[i];
		}
		return (float)sum/(list.length);
	}
	
	public static int [] add(int[] list1, int[] list2) {
		int[] result = new int [list1.length];
		
		for (int i =0; i<list1.length; i++) {
			result [i] = list1[i] + list2[i];
		}
		return result;
	}
	public static void displayArray (int[] list) {
		System.out.println("The sum resulting array is " + Arrays.toString(list));
	}

}
