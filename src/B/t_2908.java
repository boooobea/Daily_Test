package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문자 2908 상수

public class t_2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer tk = new StringTokenizer(str," ");
	

		String aa = new StringBuilder(tk.nextToken()).reverse().toString();
		
		String bb = new StringBuilder(tk.nextToken()).reverse().toString();
		
		int a = Integer.parseInt(aa);
		int b = Integer.parseInt(bb);
		
		System.out.println(a>b ? a:b);
		
		
	}//main
}//end class
