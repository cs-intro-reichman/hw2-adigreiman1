// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int num = Integer.parseInt(args[0]);
		double PI = Math.PI;

		double demonstrator = 3; 
		double finalSum = 1; 
        
		for (int i =0; i< num -1; i++){
			if( i%2 == 0){
				finalSum = finalSum - (1/demonstrator);
			}
			else{
				finalSum = finalSum + (1/demonstrator);
			}
			demonstrator +=2;
		}
		
		System.out.println("pi according to Java:" + PI);
		
		System.out.println("pi, approximated:" + finalSum*4);


	}
}
