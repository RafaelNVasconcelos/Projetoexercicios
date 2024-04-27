package gerenciadordeexercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private double carga;
    private int vezesExecutado;

    public Exercicio(String nome, int series, int repeticoes, double carga) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.vezesExecutado = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public double getCarga() {
        return carga;
    }

    public int getVezesExecutado() {
        return vezesExecutado;
    }

    public void executar() {
        vezesExecutado++;
        exibirMensagemMotivacional();
    }

    private void exibirMensagemMotivacional() {
        // Aqui você pode adicionar uma mensagem motivacional personalizada
        System.out.println("Parabéns! Continue se esforçando!");
    }

    @Override
    public String toString() {
        return nome + " - Séries: " + series + ", Repetições: " + repeticoes + ", Carga: " + carga + ", Executado: " + vezesExecutado + " vezes";
    }
}