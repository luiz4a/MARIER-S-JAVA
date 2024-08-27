package org.example;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, Bonificacao.GERENTE);
    }

    @Override
    public String toString() {
        return "Gerente - " + super.toString();
    }
}

