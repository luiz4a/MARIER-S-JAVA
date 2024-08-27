package org.example;

public class Motorista extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public double getSalarioFinal(double a, double b) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\nDados do Motorista: " +
                "\nCarteira De Habilitacao: " + carteiraDeHabilitacao +
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
