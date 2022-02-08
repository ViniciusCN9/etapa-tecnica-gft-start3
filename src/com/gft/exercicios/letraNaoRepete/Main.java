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

        char[] letras = palavra.toCharArray();
        List<Character> duplicadas = new ArrayList<>();

        char anterior = '_';


        for (int i = 0; i < letras.length; i++) {

            if (letras[i] == anterior) {
                duplicadas.add(letras[i]);
            }
            anterior = letras[i];
        }

        System.out.println(duplicadas);

        // Faltou a implementação para comparar o array de chars e subtrair da list das letras duplicadas


    }
}
