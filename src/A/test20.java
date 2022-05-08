package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//반복문 10951 A+B 
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오 

public class test20 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str=br.readLine()) != null) {
			
			StringTokenizer tk = new StringTokenizer(str);
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			
			System.out.println(a+b);
		}
		
	}//main
}
