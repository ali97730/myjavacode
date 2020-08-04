public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hoursOfDay){

        if(barking == true) {
            if (hoursOfDay <= 0 || hoursOfDay >= 23) {
                return false;
            } else if (hoursOfDay >= 8 || hoursOfDay <= 22) {
                return true;
            } else {
                return false;
            }
        }else{
           return false;
        }
    }

}
