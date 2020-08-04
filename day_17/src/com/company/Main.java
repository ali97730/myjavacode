package com.company;

public class Main {

    public static void main(String[] args) {

        String str = ("mohsin ali ali");

        char[] mychar = str.toCharArray();
        char[] check = new char[100];
        String[] s = new String[10];
        int j=0;
        for(int i=0;i<10;i++){
            check[i]=mychar[i];
            if(check[i] == ' '){
                s[j] = check.toString();
                j=j+1;
                check[0] = 0;
            }

            System.out.println(s[0]);
            System.out.println(s[1]);
        }
    }
}
