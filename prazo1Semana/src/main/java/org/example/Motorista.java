package org.example;

public class Motorista extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carteira de Habilitação: " + carteiraDeHabilitacao;
    }
}
