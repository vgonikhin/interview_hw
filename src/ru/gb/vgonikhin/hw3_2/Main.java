package ru.gb.vgonikhin.hw3_2;

public class Main {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(n + "ое число Фибоначчи - " + getNthFibonacciNumber(n));
    }

    private static int getNthFibonacciNumber(int n)
    {
        // сложность O(n)
        int x = 1;
        int y = 0;
        for (int i = 0; i < n; i++){
            x += y;
            y = x - y;
        }
        return y;
    }
}
