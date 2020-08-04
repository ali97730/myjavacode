package com.company;

public class Main {

    public static void main(String[] args) {
	int myvalue=10000;
	int myminintvalue=Integer.MIN_VALUE;
	int mymaxintvalue=Integer.MAX_VALUE;
        System.out.println("the minimum number is=" + myminintvalue);
        System.out.println("the maximum is ="+ mymaxintvalue);
        System.out.println("the minimum number is=" + (myminintvalue-1));
        System.out.println("the maximum number is=" + (mymaxintvalue-2));


        long myminlongvalue = Long.MIN_VALUE;
        long mymaxlongvalue = Long.MAX_VALUE;
        System.out.println("the minimum long number is :" + myminlongvalue );
        System.out.println("the maximum long number is : " + mymaxlongvalue);
        long biglongliteralvalue=2_147_483_647_234L;
        System.out.println(biglongliteralvalue);
        short bigshortliteralvalue = 32767;


        int mytotal=(myminintvalue/2);

        byte bytenumber = 10;
        short shortnumber = 10;
        int intnumber = 1000;
        long longnumber = 50000L+10L*(intnumber + bytenumber + shortnumber);
        System.out.println(longnumber);


    }
}
