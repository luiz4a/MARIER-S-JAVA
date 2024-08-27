package org.example;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }


    @Override
    public double getSalarioFinal() {
        return salario + (salario * bonificacao.getValor());
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonificação: " + bonificacao.getValor();
    }
}
