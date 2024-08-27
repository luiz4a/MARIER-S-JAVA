package org.example;

public class Advogado extends Funcionario {
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    @Override
    public double getSalarioFinal(double a, double b) {
        return 0;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\nDados do Advogado:" +
                "\nOab: " + oab +
                "\nNome:" + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nEndereco: " + endereco +
                "\nSetor: " + setor +
                "\nSexo: " + sexo +
                "\nSalario: " + salario +
                "\nData de Nascimento: " + dataNascimento +
                '}';
    }
}

