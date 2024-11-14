public class TimeCalc {
    public static void main(String[] args) {
        

        String time = args[0];
        int addition = Integer.parseInt(args[1]);
        
        int hours = Integer.parseInt(""+time.charAt(0) +time.charAt(1) );
        int minuts = Integer.parseInt(""+time.charAt(3) +time.charAt(4) );

        if (addition >60 ){
            double addHour = (double) addition /60;
            double addMinute  =   (double) addition % 60;
            hour += addHour;
            minuts += addMinute;
            if (minuts>60){
                minuts = minuts -60;
                hours +=1;
            }
        }
        else{
            hour += addHour;
            minuts += addMinute;
            if (minuts>60){
                minuts = minuts -60;
                hours +=1;
            }
        }
            if (minuts <60){
                System.out.println(hours + ":0" + minuts);
            }
            else {
                System.out.println(hours + ":" + minuts);
            }
        
    }
}
