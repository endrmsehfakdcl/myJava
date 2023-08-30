package exam01;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee mycoffee = new Coffee();
		mycoffee.ahffn = "yeahhhhhh";
		mycoffee.number = 20;
		mycoffee.alkjsdf = 19;
		mycoffee.rank = 'A';
		mycoffee.brand = "BBRRANNDDDDddddd";
		mycoffee.country = "Coffee land";
		mycoffee.ddmlaskd = 1295;
		
		System.out.println(mycoffee.ahffn);
		System.out.println("1회 사용량 : " + mycoffee.number);
		System.out.println(mycoffee.alkjsdf);
		System.out.println(mycoffee.ddmlaskd);
		System.out.println("등급 : " + mycoffee.rank);
		
		System.out.println("브랜드 : " + mycoffee.brand);
		System.out.println("원산지 : " + mycoffee.country);
		System.out.println("유통기간 : " + mycoffee.period);
		
		System.out.println("--------------------------------------------------------");
		mycoffee.period = "2111/11/11";
		System.out.println("유통기간 : " + mycoffee.period);
		
	}

}
