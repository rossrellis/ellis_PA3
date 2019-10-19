package com.company;
import java.util.Scanner;
import java.security.SecureRandom;


public class Main {
    static double answer;
    //static int difficulty;
    //static int type;

    public static void correctResponses() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(4) + 1;
        switch (num) {
            case 1:
                System.out.print("Very good! ");
                break;
            case 2:
                System.out.print("Excellent! ");
                break;
            case 3:
                System.out.print("Nice work! ");
                break;
            case 4:
                System.out.print("Keep up the good work! ");
                break;
        }
    }
    public static void incorrectResponses() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(4) + 1;
        switch (num) {
            case 1:
                System.out.print("No. Please try again on the next one. ");
                break;
            case 2:
                System.out.print("Wrong. Try Again. ");
                break;
            case 3:
                System.out.print("Don't give up! ");
                break;
            case 4:
                System.out.print("No. Keep trying. ");
                break;
        }
    }


    public static void results(double countCorr, double countInc) {
        double percentageCorr = (countCorr / 10.0) * 100;
        System.out.println();
        System.out.println("Number of correct responses: " + countCorr);
        System.out.println("Number of incorrect responses: " + countInc);
        System.out.println("Percentage correct: " + percentageCorr + "%");
        if (percentageCorr < 75.0) {
            System.out.println("Please ask your teacher for extra help");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
    public static void problemGen(int difficulty, int problemType){
        SecureRandom random = new SecureRandom();
        if(difficulty == 1) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            switch (problemType) {
                case 1:
                    answer = num1 + num2;
                    System.out.print("How much is " + num1 + " plus " + num2 + "?");
                    break;
                case 2:
                    answer = num1 * num2;
                    System.out.print("How much is " + num1 + " times " + num2 + "?");
                    break;
                case 3:
                    answer = num1 - num2;
                    System.out.print("How much is " + num1 + " minus " + num2 + "?");
                    break;
                case 4:
                    answer = num1 / num2;
                    System.out.print("How much is " + num1 + " divided by " + num2 + "?");
                    break;

            }
        }
        else if(difficulty == 2){
            int num3 = random.nextInt(99)+1;
            int num4 = random.nextInt(99)+1;
            switch (problemType) {
                case 1:
                    answer = num3 + num4;
                    System.out.print("How much is " + num3 + " plus " + num4 + "?");
                    break;
                case 2:
                    answer = num3 * num4;
                    System.out.print("How much is " + num3 + " times " + num4 + "?");
                    break;
                case 3:
                    answer = num3 - num4;
                    System.out.print("How much is " + num3 + " minus " + num4 + "?");
                    break;
                case 4:
                    answer = num3 / num4;
                    System.out.print("How much is " + num3 + " divided by " + num4 + "?");
                    break;
            }
        }
        else if(difficulty == 3){
            int num5 = random.nextInt(999)+1;
            int num6 = random.nextInt(999)+1;
            switch (problemType) {
                case 1:
                    answer = num5 + num6;
                    System.out.print("How much is " + num5 + " plus " + num6 + "?");
                    break;
                case 2:
                    answer = num5 * num6;
                    System.out.print("How much is " + num5 + " times " + num6 + "?");
                    break;
                case 3:
                    answer = num5 - num6;
                    System.out.print("How much is " + num5 + " minus " + num6 + "?");
                    break;
                case 4:
                    answer = num5 / num6;
                    System.out.print("How much is " + num5 + " divided by " + num6 + "?");
                    break;
            }
        }
        else if(difficulty == 4){
            int num7 = random.nextInt(9999)+1;
            int num8 = random.nextInt(9999)+1;
            switch (problemType) {
                case 1:
                    answer = num7 + num8;
                    System.out.print("How much is " + num7 + " plus " + num8 + "?");
                    break;
                case 2:
                    answer = num7 * num8;
                    System.out.print("How much is " + num7 + " times " + num8 + "?");
                    break;
                case 3:
                    answer = num7 - num8;
                    System.out.print("How much is " + num7 + " minus " + num8 + "?");
                    break;
                case 4:
                    answer = num7 / num8;
                    System.out.print("How much is " + num7 + " divided by " + num8 + "?");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        double userAnswer;
        int choice = 1;
        //difficultyLevel();
        System.out.print("Difficulty 1,2,3 or 4");
        int difficulty = scnr.nextInt();
        System.out.print("Choose problem type: 1 for Addition, 2 for multiplication, 3 for subtraction, 4 for division or " +
                "5 for a mixture.");
        int type = scnr.nextInt();

        while (choice == 1) {
            double countCorr = 0.0, countInc = 0.0;
            for (int i = 0; i < 10; i++) {
                problemGen(difficulty,type);
                userAnswer = scnr.nextInt();
                if (userAnswer != answer) {
                    countInc++;
                    incorrectResponses();
                } else {
                    countCorr++;
                    correctResponses();
                }
            }
            results(countCorr, countInc);
            System.out.print("Do you wish to begin a new session? 1 for yes, 0 for no.");
            choice = scnr.nextInt();

        }
    }

}

