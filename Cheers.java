// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int times = Integer.parseInt(args[1]);
                String vouels = "AEFHILMNORSXaefhilnmorsx";
                
                for (int i =0; i<word.length(); i++){
                        
                        if (vouels.indexOf(word.charAt(i))>=0){
                                System.out.println("Give me an " + word.charAt(i)+": " + word.charAt(i) + "!");
                        }
                        else {
                        System.out.println("Give me a " + word.charAt(i)+": " + word.charAt(i) + "!"); 
                        }
                         
                }
                System.out.println("What does that spell?");

                for (int i =0; i< times; i++){
                        System.out.println(word + "!!!");
                }

        }
}
