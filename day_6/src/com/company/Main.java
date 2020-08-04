package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double freespace;
	 double usedspace = 0.0;
	 double deletedfilesize;
	 double newfilesize;
        Scanner get = new Scanner(System.in);
        System.out.println("::enter the size of the disk you want in Bytes:: \n");
        freespace = get.nextDouble();
        get.nextLine();
        System.out.println("used space is ::" + usedspace + "Bytes");
        System.out.println("enter the size of the file U want to create \n");
        newfilesize = get.nextDouble();
        usedspace+=newfilesize;
        freespace-=usedspace;
        System.out.println("the free space is " +freespace +"Bytes and "+"the used space is " +usedspace+ "Bytes");


    }
}
