package com.example.demo;

public class Calculator {
    public int add(int a, int b){
        System.out.println("inside add method");
        return a + b;
    }

    public int sub(int a, int b){
        System.out.println("inside substract method");

        return a - b;
    }

    public int multiply(int a, int b){
        System.out.println("inside multiply method");

        return a * b;
    }

    public int divide(int a, int b){
        System.out.println("inside divide method");

        return a /= b;
    }
}
