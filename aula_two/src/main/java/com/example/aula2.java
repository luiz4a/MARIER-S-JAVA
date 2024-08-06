package com.example;

/**
 * Hello world!
 *
 */
public class aula2 
{
    public static void main( String[] args )
    {
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo quantidade de caracteres
        System.out.println("Tamanho do nome: "+ nome.length());;
        System.out.println("Tamanho do sobrenome: "+ sobrenome.length());

        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        //Exibindo nome completo usando metodos Strings - Maiúsculas
        System.out.println("Concatenação maiúscula:"+ nomeCompleto.toUpperCase());

        // Exibindo nome completo usando metodos Strings - Minúsculas
        System.out.println("Concatenação Minúscula: "+ nomeCompleto.toLowerCase());
    }
}