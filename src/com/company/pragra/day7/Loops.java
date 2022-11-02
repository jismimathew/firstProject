package com.company.pragra.day7;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thoughtNo = (int)(Math.random()*10);
        int i=0;
        System.out.println("I have thought a number..Guess the number : ");
        while(i<=10){
            int guessedNum=sc.nextInt();
            if(guessedNum==thoughtNo){
                System.out.println("You guessed right!! you win!");
                break;
            }else {
                System.out.println("Wrong guess.. TRY AGAIN");
            }
            i++;
        }
        System.out.println("YOU ARE FAILED");
    }
}
