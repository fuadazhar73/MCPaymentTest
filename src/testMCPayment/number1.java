package testMCPayment;

import java.util.Arrays;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if you want search number always will be doesn't <0 if substracted by other number in array you can use search maximum value from the array
		// so in this problem in number 1 i will be use find the max number
		int arr[] = {10, 324, 45, 90, 89,91}; 
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Largest in given array is " +max);

	}

}
