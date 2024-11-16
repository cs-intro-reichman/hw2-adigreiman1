public class TimeCalc {
    public static void main(String[] args) {
        

        String time = args[0];
        int addition = Integer.parseInt(args[1]);
        
        int hours = Integer.parseInt(""+time.charAt(0) +time.charAt(1) );
        int minuts = Integer.parseInt(""+time.charAt(3) +time.charAt(4) );

        minuts += addition;

        if (minuts >=60){
            hours = minuts / 60 + hours;
             minuts = minuts % 60;
            hours = hours % 24;
       
        
            if (minuts <10){
                if (hours<10){
                    System.out.println("0" +hours + ":0" + minuts);
                }
                else{
                    System.out.println(hours + ":0" + minuts);
                }
            }
            else {
                if (hours<10){
                    System.out.println("0" +hours + ":" + minuts);
                }
                else{
                System.out.println(hours + ":" + minuts);
            }
        }
        }}}