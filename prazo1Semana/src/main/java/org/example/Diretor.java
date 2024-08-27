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
    public double getSalarioFinal(double a, double b) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\nDados do Diretor: " +
                "\nBonificacao:" + bonificacao +
                "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nRg: " + rg +
                "\nEndereco: " + endereco +
                "\nSetor: " + setor +
                "\nSexo: " + sexo +
                "\nSalario: " + salario +
                "\nData de Nascimento: " + dataNascimento +
                '}';
    }
}
