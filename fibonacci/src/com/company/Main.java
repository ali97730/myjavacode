package com.company;

public class Main {

    public static void main(String[] args) {

        int x=0,y=1,ans=0;
        System.out.println(x);
        System.out.println(y);

        for(int i=0;i<10
                ;i++){
            ans=x+y;
            x=y;
            y=ans;
            System.out.println(ans+",");
        }
    }
}
