package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);  // inicializa o scanner
        int num1, i, p = 0, t = 0;

        System.out.println ("=========== Vamos fazer uma média ===========");
        System.out.println ("Insira o numero");

        num1 = nota.nextInt();  // guarda a entrada do usuário

        for(i = 0;i < num1; i++) {
            p = nota.nextInt();  // confrome o for roda ele vai guardando a entrada do usuário
            t += p;
        }

        t = t / num1;

        System.out.println(t);

    }
}