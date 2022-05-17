package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문자 1152 단어의 개수

public class t_1152 {

	public static void main(String[] args) throws IOException {
		
		//Scanner sc = new Scanner(System.in)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer tk = new StringTokenizer(str," ");

		System.out.println(tk.countTokens());
		
	}//mian
}//end class
