package com.company;

public class Main {

    public static void main(String[] args) {
	int redblood = 50000000;
	int whiteblood = 8000;
	int factor = getfactor(whiteblood,redblood);
	int whitef= whiteblood/factor;
	int redf = redblood/factor;
        System.out.println("aspect ratio"+whitef+":"+redf);
        System.out.println(5000000 % 8000);

    }
//                                8000,5000000
    //                           5000000,8000
                                    //8000,0
    public static int getfactor(int white,int  red){
               if(red==0){//check if red=0 or not first it is not so go to else
            return white;
        }
        else{   //          5000000,8000%5000000=8000
           return getfactor(red,white % red);
        }
        //8000,5000000
        //5000000,8000
        //8000,0

   }
}
