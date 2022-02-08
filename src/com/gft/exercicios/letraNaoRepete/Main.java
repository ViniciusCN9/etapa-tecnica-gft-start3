package com.gft.exercicios.letraNaoRepete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT: ");
        String palavra = input.next();

        System.out.println(letraRepetida(palavra));


    }

    public static char letraRepetida(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) //Retorna a letra, mas só vai capturar
                {                    //a correta se a string dada for toda minúscula
                    return c;
                }
            }
        }
        return '_';
    }
}