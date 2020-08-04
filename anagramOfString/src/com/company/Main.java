package com.company;

public class Main {

    public static void main(String[] args) {
        String a ="AAAAAAAAAAAA";
        String b ="AAAAAAAAAAAA";
        int al[]=new int[256];
        int bl[]=new int[256];

        for(char c : a.toCharArray()){

            int index=(int) c;
            al[index]++;
        }
        for(char c : b.toCharArray()){

         int index=(int) c;
            bl[index]++;
        }
        boolean isAnagram = true;
        for(int i=0;i<al.length;i++)
        {
            if(al[i]!=bl[i] ){
                isAnagram=false;
                 break;
            }
            System.out.print(al[i]+",");

            System.out.print(bl[i]+",");
            System.out.println();
        }
        System.out.println(isAnagram);
        if(isAnagram==true) {
            System.out.println("isAnagram");
        }
        else{
            System.out.println("is Not Anagram");
        }

    }
}
