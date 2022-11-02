package com.company.pragra.day5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FactorialAndFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial: ");
        int num1 =s.nextInt();
        System.out.println("Factorial of "+num1+" is "+factorial(num1));
        System.out.println("Enter the number to get the fibonacci series: ");
        int num2 =s.nextInt();
        System.out.println("Fibonacci series of this number :");
        fibonacci(num2);
    }
    public static int factorial(int a){
        int j=1;
        for(int i=a; i>=1;i--){
            j*=i;
        }
        return j;
    }

    public static void fibonacci(int a){
        int n1=0;
        int n2=1;
        int n3=0;
        for (int i=0;i<a;i++){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }





}








