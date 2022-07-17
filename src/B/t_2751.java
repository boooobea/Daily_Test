package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//정렬 2751 수 정렬하기2
public class t_2751 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}//for
		
		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}//main
}//end class
