package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando o endereço
        Endereco endereco = new Endereco("Rua Exemplo", "123", "Apto 45", "12345-678", "Cidade Exemplo", UnidadeFederativa.BAHIA);

        // Criando funcionários
        Funcionario advogado = new Advogado("Ana Silva", "12345678900", "1234567", endereco, Setor.JURIDICO, Sexo.FEMININO, 10000, "01/01/1980", "12345");
        Funcionario motorista = new Motorista("Carlos Oliveira", "98765432100", "7654321", endereco, Setor.OPERACOES, Sexo.MASCULINO, 8000, "02/02/1975", "XYZ-1234");

        CargoDeConfianca gerente = new Gerente("Maria Souza", "11122233344", "9876543", endereco, Setor.ENGENHARIA, Sexo.FEMININO, 12000, "03/03/1985");
        CargoDeConfianca diretor = new Diretor("João Santos", "44455566677", "7654321", endereco, Setor.MARKETING, Sexo.MASCULINO, 15000, "04/04/1970");

        // Exibindo informações
        System.out.println(advogado);
        System.out.println(motorista);
        System.out.println(gerente);
        System.out.println(diretor);

        // Calculando salários finais
        System.out.println("Salário Final do Gerente: " + gerente.getSalarioFinal());
        System.out.println("Salário Final do Diretor: " + diretor.getSalarioFinal());
    }
}
