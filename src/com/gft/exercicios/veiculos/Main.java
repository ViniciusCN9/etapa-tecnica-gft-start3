package com.gft.exercicios.veiculos;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("FIAT", "BASICO", "DSS545", "Azul", "15011", false, 0,0,10000d);
        Veiculo veiculo2 = new Veiculo("RENAULT", "ESPORTIVO", "DSS545", "Rosa", "5252", true, 60,100,10000d);
        Veiculo veiculo3 = new Veiculo("PEUGEOT", "PASSEI", "DSS545", "Amarelo", "0", false, 0,0,10000d);

        System.out.println(veiculo1);
        veiculo1.ligar();
        veiculo1.desligar();
        veiculo1.ligar();
        veiculo1.abastecer(10);
        veiculo1.acelerar();
        veiculo1.acelerar();
        veiculo1.acelerar();
        veiculo1.frear();
        veiculo1.pintar("Amarelo");
        System.out.println(veiculo1);

        System.out.println();

        System.out.println(veiculo2);
        veiculo2.ligar();
        veiculo2.desligar();
        veiculo2.ligar();
        veiculo2.abastecer(10);
        veiculo2.acelerar();
        veiculo2.acelerar();
        veiculo2.acelerar();
        veiculo2.frear();
        veiculo2.pintar("Amarelo");
        System.out.println(veiculo1);

        System.out.println();

        System.out.println(veiculo3);
        veiculo3.ligar();
        veiculo3.desligar();
        veiculo3.ligar();
        veiculo3.abastecer(10);
        veiculo3.acelerar();
        veiculo3.acelerar();
        veiculo3.acelerar();
        veiculo3.frear();
        veiculo3.pintar("Amarelo");
        System.out.println(veiculo1);

    }
}
