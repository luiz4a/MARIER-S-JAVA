package org.example;

public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }}
