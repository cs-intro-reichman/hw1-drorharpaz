// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int i = Integer.parseInt(args [3]); // Converts arg3 in2 int.
		double j = Math.ceil(i /3.0); // Do the math.
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + 
		": pay " + j + " Shekels each.");
	}
}