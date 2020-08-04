package com.company;

public class Main {

    public static void main(String[] args) {
    String name = "hii i am mohsin       ali chaudhary";
    char[] order = name.toCharArray();
    char[] reverse = new char[name.length()];
        System.out.println(name.length());
        int j=name.length()-1;
        char space=' ';

    for(int i=0;i<name.length();i++)
        {


                reverse[j]=order[i];
//            System.out.print(order[i]);
//                System.out.print(reverse[j]);
//            System.out.println();
//            //System.out.println(j);
                j--;


        }
      for(int l=0; l<name.length();l++){
         if(l==0){
             System.out.print(reverse[l]);
         }
         else{
             if(reverse[l]==space)
             {
                 if(reverse[l-1]!=space){
                     System.out.print(reverse[l]);
                 }
             }
             else{
                 System.out.print(reverse[l]);
             }

         }

      }

    }
}
