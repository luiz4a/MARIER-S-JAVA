package org.example;

public  class Advogado extends Funcionario {
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() + ", OAB: " + oab;
    }

    @Override
    public double getSalarioFinal(double a, double b) {
        return 0;
    }
}

