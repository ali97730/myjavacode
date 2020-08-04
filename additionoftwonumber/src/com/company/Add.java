package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Add {

        int x,y,z;
    public static void main(String[] args) {
        Add m = new Add();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number:  ");
         m.x = s.nextInt();
        System.out.println("enter the first number:  ");
        m.y = s.nextInt();

         m.z= m.x+m.y;
        System.out.println("the answer is "+ m.z);
        s.close();

    }
}
