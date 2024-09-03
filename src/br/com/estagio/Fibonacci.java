package br.com.estagio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero para o calculo da fibonacci: ");

        List<Integer> fibonacci = new ArrayList<Integer>();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            fibonacci.add(fibo(i));
            System.out.print(fibo(i) + " ");
        }

        System.out.println();
        System.out.println( (fibonacci.contains(num)) ? "Número informado pertence a sequência" : "Número informado não pertence a sequência" );
    }
}
