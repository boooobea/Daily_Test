package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배열 8958 OX퀴즈 

/*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오. */
public class test35 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			
			int count = 0;
			int sum = 0;

			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;	
				
			}
			System.out.println(sum);
		}
	}//main
}//end class
