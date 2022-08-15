package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t_1259 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner 보다 buffer 사용하기
		
		while (true) {

			String N = br.readLine();

			if (N.equals("0")) break;		//0을만나면 break;탈출 

			
			boolean result = true;

			for (int i = 0; i < N.length(); i++) {

				if (N.charAt(i) != N.charAt(N.length() - i - 1)) { //index Reverse
					result = false;
					break;
				}
			} // for
			
			if (result) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			} // if-else

		} // while

		br.close();
	}// main
}
// end class
