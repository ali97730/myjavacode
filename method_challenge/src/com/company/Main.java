package com.company;

public class Main {

    public static void main(String[] args) {
	//String name;

	int pos = dpp(1500);
    dhp (pos,"mohsin");



    }

    public static int dpp(int score)
    {
        if(score > 1000) {
            return 1;
        }
        else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        }
        else
        {
            return 4;
        }


    }

    public static void dhp(int pos, String name)
    {
        System.out.println(name + "has got position of " + pos +"on high score table");
    }
}
