// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];

for ( int seed =1; seed<= highestSeed ; seed++){
	int finalRun = 0;
	int runCount = 0;
	int changedSeed = seed;
	while (finalRun<1){
		runCount +=1;
		if (mode.equals("v")){
			System.out.print(changedSeed +" ");
		}
		if (changedSeed %2 ==0){
			changedSeed /=2;
		}
		else{
			changedSeed = changedSeed *3 +1;
		}
		if (changedSeed ==1){
			finalRun =1;
			if (mode.equals("v")){
				System.out.print(1 + " " + "(" + (runCount+1)+ ")");
				System.out.println("");
			}
		}
	}
}
System.out.print("Every one of the first "+highestSeed+" hailstone sequences reached 1.");
	}
	}