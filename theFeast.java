package Algorithms;

public class theFeast {

	public static void main(String[] args) {
		int money = 15;
		int price = 3;
		int rate = 2;
		System.out.println("Number of chocolate bars: "+theFeast(money, price, rate));

	}

	public static int theFeast(int money, int price, int rate) {
		int result = money/price;
		int wrapper = result;
		result = result + wrapper/rate;
		
		while(wrapper >= rate) {
			wrapper = wrapper % rate + wrapper/rate;
			result += wrapper/rate;
		}
		return result;
	}

}
