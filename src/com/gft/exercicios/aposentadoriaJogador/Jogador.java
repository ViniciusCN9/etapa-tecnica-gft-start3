package com.gft.exercicios.aposentadoriaJogador;

import java.time.LocalDate;
import java.time.Period;

public class Jogador {

    private final String nome;
    private final Posicao posicao;
    private final LocalDate dataNascimento;

    public Jogador(String nome, Posicao posicao, LocalDate dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Idade: " + calcularIdade() + " Anos");
        System.out.println("Tempo para aposentar: " + calcularTempoParaAposentar() + " Anos");
        System.out.println();
    }

    public int calcularIdade() {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(this.dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public int calcularTempoParaAposentar() {
        int idade = this.calcularIdade();
        int tempoAposentadoria = posicao.getTempoAposentadoria();
        return tempoAposentadoria - idade;

    }
}

