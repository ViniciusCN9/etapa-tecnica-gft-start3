package com.gft.exercicios.letraNaoRepete;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra = input.next();
        char[] charArray = palavra.toCharArray();
        List<Character> charList = new ArrayList<>();

        for (char letra : charArray){
            charList.add(letra);
        }

        Set<Character> set = new HashSet<>();
        List<Character> duplicados = new ArrayList<>();

        for (char letra : charArray) {
            if (!set.add(letra)) duplicados.add(letra);

        }
        charList.removeAll(duplicados);

        System.out.println(charList.get(0));
    }

}
