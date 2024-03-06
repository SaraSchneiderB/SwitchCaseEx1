/*
 Escreva um programa que leia um número inteiro de 1 a 4 e imprima o nome de uma
estação do ano correspondente usando switch case. Por exemplo, se o número for 1, 
imprima “Verão”.
 */
package com.mycompany.switchcaseex1;

import java.util.Scanner;

public class SwitchCaseEx1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número entre 1 e 4: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1 ->
                System.out.println("Olá, você está curtindo o Verão!");
            case 2 ->
                System.out.println("Olá, você está curtindo o Outono!");
            case 3 ->
                System.out.println("Olá, você está curtindo o Inverno!");
            case 4 ->
                System.out.println("Olá, você está curtindo a Primavera!");
        }

    }
}
