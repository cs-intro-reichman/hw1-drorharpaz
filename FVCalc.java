// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int current = Integer.parseInt(args[0]);
	double rat = Double.parseDouble(args[1])/100.0;
	int years = Integer.parseInt(args[2]);
	double future = current * Math.pow(1.0 + rat, 1.0 * years);
	System.out.println("After " + years + " years, a $" + current + " saved at " + rat * 100 +
	 "% will yield $" + (int) future);
	}
}