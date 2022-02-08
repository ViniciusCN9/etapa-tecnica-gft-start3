package com.gft.exercicios.aposentadoriaJogador;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("João", Posicao.DEFESA, LocalDate.of(2000, 6, 10));
        Jogador jogador2 = new Jogador("Pedro", Posicao.MEIOCAMPO, LocalDate.of(1995, 8, 30));
        Jogador jogador3 = new Jogador("Carlos", Posicao.ATACANTE, LocalDate.of(1990, 3, 5));

        jogador1.imprimeDados();
        jogador2.imprimeDados();
        jogador3.imprimeDados();

    }


}
