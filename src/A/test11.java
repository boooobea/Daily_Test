package A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//반복문 15552 빠른 A+B
/* 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다. 
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 * 5
1 1
12 34
5 500
40 60
1000 1000*/

public class test11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			
			String str = br.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			bw.write(a+b+"\n");
		}//for
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}//main
}//end class
