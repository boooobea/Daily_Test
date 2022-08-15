package cote;

public class CountNumber {

	public static void main(String[] args) {
		
		int price = 3;
		int count = 4;
		int money = 20;
		
		int changePrice = 0;
		for(int i=1; i<=count; i++) {
			changePrice += price * i;
		}
		System.out.println(changePrice);
		
		if(money < changePrice) {
			int empty = changePrice-money;
			System.out.println("부족한 금액:"+empty);
		} else {
			System.out.println(0);
		}
		
	}//main
}//end class
