// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[2];

		
		while (seed !=1) {
		if (seed ==7){
			seed = seed/2;
		}
		else {
			seed = seed*3 +1;
		}
		seed++;
	}
}
}
