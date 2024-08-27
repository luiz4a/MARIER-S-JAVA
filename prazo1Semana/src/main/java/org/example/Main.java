package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando o endereço
        Endereco endereco1 = new Endereco("Rua Pajussara", "123", "Apto 45", "Cep: 12345-678", "Salvador", UnidadeFederativa.BAHIA);
        Endereco endereco2 = new Endereco("Rua Rio sena", "123", "Em frente a padaria", "Cep: 12345-678", "Salvador", UnidadeFederativa.BAHIA);
        Endereco endereco3 = new Endereco("Rua Dendezeiro", "123", "Ao lado do mercado", "Cep: 12345-678", "Salvador", UnidadeFederativa.BAHIA);
        Endereco endereco4 = new Endereco("Rua Souto Dalva", "123", "No prédio Maria Eliza", "Cep: 12345-678", "Salvador", UnidadeFederativa.BAHIA);

        // Criando funcionários
        Funcionario advogado = new Advogado("Ana", "12345678900", "1234567", endereco1, Setor.JURIDICO, Sexo.FEMININO, 10000, "01/01/1980", "12345");
        Funcionario motorista = new Motorista("Carlos", "98765432100", "7654321", endereco2, Setor.OPERACOES, Sexo.MASCULINO, 8000, "02/02/1975", "XYZ-1234");

        CargoDeConfianca gerente = new Gerente("Maria Souza", "11122233344", "9876543", endereco3, Setor.ENGENHARIA, Sexo.FEMININO, 1200, "03/03/1985");
        CargoDeConfianca diretor = new Diretor("João", "44455566677", "7654321", endereco4, Setor.MARKETING, Sexo.MASCULINO, 1500, "04/04/1970");

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
