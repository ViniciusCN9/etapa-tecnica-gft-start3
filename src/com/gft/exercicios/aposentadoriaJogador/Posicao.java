package com.gft.exercicios.aposentadoriaJogador;

public enum Posicao {

    DEFESA(40),
    MEIOCAMPO(38),
    ATACANTE(35);

    private final int tempoAposentadoria;


    Posicao(int tempoAposentadoria) {
        this.tempoAposentadoria = tempoAposentadoria;
    }

    public int getTempoAposentadoria() {
        return tempoAposentadoria;
    }
}
