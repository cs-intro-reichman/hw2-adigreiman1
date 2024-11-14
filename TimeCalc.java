public class TimeCalc {
    public static void main(String[] args) {
        

        String time = args[0];
        int addition = Integer.parseInt(args[1]);
        
        int hours = Integer.parseInt(""+time.charAt(0) +time.charAt(1) );
        int minuts = Integer.parseInt(""+time.charAt(3) +time.charAt(4) );

        if (addition >60 ){
            int addHour = addition /60;
            int addMinute  =  addition % 60;
            hours += addHour;
            minuts += addMinute;
            if (minuts>60){
                minuts = minuts -60;
                hours +=1;
            }
            }
            else if (addition % 60 ==0){
                 hours =  addition / 60 + hours;
            }
        else{
            minuts += addition;
            if (minuts>60){
                minuts = minuts -60;
                hours +=1;
            }
        }
            if (hours >= 24){hours = hours-24;}
        
            if (minuts <10){
                System.out.println(hours + ":0" + minuts);
            }
            else {
                System.out.println(hours + ":" + minuts);
            }
        
    
        }
        }

