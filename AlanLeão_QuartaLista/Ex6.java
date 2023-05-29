/*
Descrição: Esta lógica recebe 10 números inteiros positivos e mostra a raiz quadrada deles (Ele ignora os números negativos)
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex6 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         int quantidadeValores = 10;
         int soma = 0;
 
         for (int i = 1; i <= quantidadeValores; i++) {
             System.out.print("Digite o valor #" + i + ": ");
             int valor = scanner.nextInt();
 
             if (valor >= 0) {
                 soma += valor;
             } else {
                 System.out.println("Valor negativo ignorado.");
             }
         }
 
         if (soma > 0) {
             double raizQuadrada = Math.sqrt(soma);
             System.out.println("A raiz quadrada da soma dos valores é: " + raizQuadrada);
         } else {
             System.out.println("Nenhum valor positivo foi inserido.");
         }
     }
 }
 