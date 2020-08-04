package com.company;

public class Main {

    public static void main(String[] args) {
        int x =0,y=1,ans=0;
        int n=10;
        System.out.println(x);
        System.out.println(y);
        fibonacci(n-2,x,y,ans);
    }

    public static void fibonacci(int n,int x,int y,int ans)
    {
        if(n>0) {
            ans = x + y;
            x = y;
            y = ans;
            System.out.println(ans);
            fibonacci(n - 1, x, y, ans);
        }
    }
}
