// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                String upperWord = word.toUpperCase();
                int times = Integer.parseInt(args[1]);
                String selectedlLetters  = "AEFHILMNORSX";
                
                for (int i =0; i<upperWord.length(); i++){
                        
                        if (selectedlLetters.indexOf(upperWord.charAt(i))>=0){
                                System.out.println("Give me an " + upperWord.charAt(i)+": " + upperWord.charAt(i) + "!");
                        }
                        else {
                        System.out.println("Give me a  " + upperWord.charAt(i)+": " + upperWord.charAt(i) + "!"); 
                        }
                         
                }
                System.out.println("What does that spell?");

                for (int i =0; i< times; i++){
                        System.out.println(upperWord + "!!!");
                }

        }
}
