package testMCPayment;

import java.util.ArrayList;
import java.util.List;

public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "souvenir loud four lost";
		int x = 4;
		List<String> list = Solution(example,x);
		System.out.println(list);
	}

	private static List<String> Solution(String example, int x) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<String>();
		String[] split = example.split(" ");
		for(int a=0; a<split.length; a++) {
			String stringnew = split[a];
			if(stringnew.length()==x) {
				stringList.add(stringnew);
			}
		}
		
		return stringList;
	}

}
