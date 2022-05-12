package A;

//함수 15596번 정수N개의 합 
//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오 
//long sum(int[] a); (클래스이름:Test)
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 
// 리턴값 : a에 포함되어 있는 정수 n개의 합 

public class test36 {

	long sum(int[] a) {
		
		long sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}//end class
