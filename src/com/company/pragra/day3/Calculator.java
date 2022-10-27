package com.company.pragra.day3;


public class Calculator {

    public static void main(String[] args) {
        int sum = addition(10,10);
        int difference = subtraction(10,10);
        int multiply = multiplication(10,10);
        int divide = division(10,10);
        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Multiplication: " +multiply);
        System.out.println("Division: " +divide);
    }
    public static int addition(int num1, int num2){
        return num1+num2;
    }
    public static int subtraction (int num1, int num2){
        return num1-num2;
    }
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    public static int division(int num1, int num2){
        return num1/num2;
    }
}



