package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> set= new HashSet<>();

    public static void main(String[] args) {
      permutation("aac",0,2);
    }
    public static void permutation(String s,int l,int r){
        if(l==r){
            //for unique
            if(set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s= interchange(s,l,i);
            permutation(s,l+1,r);
            s= interchange(s,l,i);
        }

    }
    public static String interchange(String s,int a,int b){
        char[] array =  s.toCharArray();
        char temp = array[a];
        array[a]= array[b];
        array[b]= temp;
        return String.valueOf(array);
    }
}
