package cote;

import java.util.Arrays;

public class Decimal {

	public static void main(String[] args) {
		
		int[] d = {1,3,2,5,4};
		
		int budget =9; 
		int sum = 0;
		int result = 0;
		
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			sum += d[i];
			
			if( sum <= budget) {
				result ++;
			} else break;
		}
	
		System.out.println("reuslt : " + result);
	}//main
	
}//end class
