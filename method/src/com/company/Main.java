package com.company;

public class Main {



            public static void main(String[] args) {
                boolean gameOver = true
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;
                int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
                System.out.println("the final high score is " + highscore);

                score = 10000;
                levelCompleted = 8;
                bonus = 200;

                highscore = calculateScore(gameOver, score, levelCompleted, bonus);
                System.out.println("the final high score is " + highscore);




            }

            public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

                if(gameOver) {
                    int finalScore = score + (levelCompleted * bonus);
                    finalScore += 2000;
                    return finalScore;
                }

                return -1;

            }

        }


