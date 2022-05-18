package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//정렬 1427 소트인사이드(내림차순)
public class t_1427 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String num = sc.nextLine();
		String num = br.readLine();

		Integer[] arr = new Integer[num.length()];
		
		for(int i=0; i<arr.length; i++) {

			arr[i] = num.charAt(i)-'0';
		}
		
		Arrays.sort(arr, Collections.reverseOrder());

		for(Integer a : arr) {
			System.out.print(a);
		}
		
	}//main
}//end class
