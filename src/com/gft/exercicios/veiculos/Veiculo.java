package com.gft.exercicios.veiculos;

public class Veiculo {

    private final String marca;
    private final String modelo;
    private final String placa;
    private String cor;
    private final String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade = 0;
    private final double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, String km, boolean isLigado, int litrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getKm() {
        return km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void acelerar(){
        this.velocidade = this.velocidade + 20;
    }
    public void abastecer(int combustivel){
        int adicionando = this.litrosCombustivel;
        if (adicionando < 60){
            this.litrosCombustivel = this.litrosCombustivel + combustivel;
            if (this.litrosCombustivel > 60)this.litrosCombustivel = 60;
        }
    }
    public void frear(){
        if (this.velocidade == 0) return;
        if (this.velocidade < 20) this.velocidade = 0;
        else{
            this.velocidade = this.velocidade - 20;
        }


    }
    public void pintar(String cor){
        this.cor = cor;
    }
    public void ligar(){
        if (!isLigado) {
            this.isLigado = true;
        }

    }
    public void desligar(){
        if (isLigado) {
            this.isLigado = false;
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", km='" + km + '\'' +
                ", isLigado=" + isLigado +
                ", litrosCombustivel=" + litrosCombustivel +
                ", velocidade=" + velocidade +
                ", preco=" + preco +
                '}';
    }
}
