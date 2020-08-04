public class bmi {

    public static void calculator(float height, float weight){

        float rate;

        rate =weight / (height * height);
        if (rate > 25 ){
            System.out.println("Overweight");
        }else if(rate >= 18.5 || rate <= 25){
            System.out.println("Underweight");

        }else{
            System.out.println("Lowerweight");

        }


    }
}
