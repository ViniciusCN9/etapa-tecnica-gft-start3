package com.gft.exercicios.inverterInteiro;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero1 = 123;
        int numero2 = 15485448;
        int numero3 = 2195498;
        int numero4 = 12;
        int numero5 = 98716549;
        //int numero6 = 9999998999;
        int numero7 = 1654891;

        imprimeInverso(numero1);
        imprimeInverso(numero2);
        imprimeInverso(numero3);
        imprimeInverso(numero4);
        imprimeInverso(numero5);
        //imprimeInverso(numero6);
        imprimeInverso(numero7);

    }
    public static void imprimeInverso(int inteiro){
        String numeroString = Integer.toString(inteiro);
        System.out.println(new StringBuilder(numeroString).reverse());
    }
}
