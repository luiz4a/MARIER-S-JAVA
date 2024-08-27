package org.example;

public class Diretor extends CargoDeConfianca {
    private static final double PREMIO = 0.5;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, Bonificacao.DIRETOR);
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal() + (salario * PREMIO);
    }

    @Override
    public String toString() {
        return "Diretor - " + super.toString();
    }
}
