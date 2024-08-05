package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    Scanner  curso = new Scanner (System.in);

    System.out.println("Digite Seu nome: ");
    String nome = curso.next();

    System.out.println("Digite a Primeira nota: ");
    double primeiraNota = curso.nextDouble();

    System.out.println("Digite a Segunda nota: ");
    double segundaNota = curso.nextDouble();

    System.out.println("Digite a Terceira nota: ");
    double terceiraNota = curso.nextDouble();


    double media = (primeiraNota + segundaNota + terceiraNota) / 3;

     if ( media >= 7 ) {
        System.out.println("Aprovado!");
     }else if (media >=  5) {
        System.out.println("Verificação Suplementar!");
     }else{ 
        System.out.println("Reprovado!!");
     }

     System.out.println("Nome: "+ nome);
     System.out.println("Média: "+ media);


    
        

    }
}
