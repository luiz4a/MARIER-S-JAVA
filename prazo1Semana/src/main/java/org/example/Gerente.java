package org.example;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, Bonificacao.GERENTE);
    }

    @Override
    public double getSalarioFinal(double a, double b) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\nDados do Gerente: " +
                "\nBonificacao: " + bonificacao +
                "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nRg: " + rg +
                "\nEndereco: " + endereco +
                "\nSetor: " + setor +
                "\nSexo: " + sexo +
                "\nSalario: " + salario +
                "\nDataNascimento:" + dataNascimento +
                '}';
    }
}

