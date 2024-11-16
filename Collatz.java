// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		//String mode = args[2];

	//	if (mode.equals("v")){

		
		
		while (seed>=1){
			if ( seed == 7){
				seed/=2;
				System.out.print(seed);
				seed++;
			}
			else  {
			seed= seed * 3 + 1;
			}
			
				System.out.print(seed);
				seed++;
		}

		} }