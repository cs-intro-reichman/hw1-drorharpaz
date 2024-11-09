// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num1 = Integer.parseInt(args[0]);
		int ans1 = num1 % 10;
		int num2 = num1 / 10;
		int ans2 = num2 % 10;
		int num3 = num2 / 10;
		int ans3 = num3;
		System.out.println(ans3 + " hundreds, " + ans2 + " tens, and " + ans1 + " ones.");
	}
}
