package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String combinedName1 = "mohsin ali Chaudhary ali mohsin";
        String sArray[] = combinedName1.split(" ");
        //System.out.println(sArray[3]);
        int n= sArray.length;
        //System.out.println(n);
        boolean visited[] = new boolean[n];
        boolean isthere =false;
        for (int i=0;i<n;i++)
        {
            String temp = sArray[i];
            //System.out.println(temp);
            for(int j=i+1;j<n;j++)
            {
                if(temp.equals(sArray[j]) && visited[j]==false)
                {
                    System.out.println(temp);
                    visited[j]=true;
                }
            }
        }

    }
}
