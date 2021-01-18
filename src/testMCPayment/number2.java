package testMCPayment;

import java.util.ArrayList;
import java.util.List;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4}; 
		int x=4;
		List<Integer> list = solution(arr,x);
		System.out.println("list after remove" + list);
		
	}

	private static List<Integer> solution(int[] arr, int x) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		List<Integer> solution = new ArrayList<Integer>();
		for(int k=0; k<arr.length; k++) {
			solution.add(arr[k]);
		}
		int elementForSearch = 0;
		for(int a=0; a<arr.length; a++) {
			int f= arr[a];
			for(int b=arr.length; b>=1; b--) {
				int g= arr[b-1];
				int h = f/g;
				//System.out.println(h);
				if(h==x) {
					Numbers.add(f);
				}
			}
		}
		for(int e=0; e<Numbers.size(); e++) {
			elementForSearch = Numbers.get(e);
		}
		int removeIndex = remove(arr,elementForSearch);
		System.out.println("Initial List: " + solution); 
		solution.remove(removeIndex);
		return solution;
	}

	private static int remove(int[] arr, int elementForSearch) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++)
			if (elementForSearch== arr[i])
				return i;
		return -1;
	}

}
