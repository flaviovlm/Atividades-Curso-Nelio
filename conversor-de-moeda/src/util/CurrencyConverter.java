package util;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	public static double buyDollar (double priceDollar, double dollarBought){

		double total = (priceDollar * dollarBought);
		total *= IOF;
		return total;
	}

}
