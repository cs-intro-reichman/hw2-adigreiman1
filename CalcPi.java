// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int num = Integer.parseInt(args[0]);
		double PI = Math.PI;

		double output = 0.0; 
        int i = 1;
		while (i<num){
			double sum = 1.0 / (3 + 2 * i) + 1.0 / (5 + 2 * i);
			output -=  sum;

			i++;
		}
		System.out.println("pi according to Java:" + PI);
		
		System.out.println("pi, approximated:" + output*4);


	}
}
