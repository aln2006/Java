/*
Descrição: Esta lógica recebe um número do usuário e mostra que ele ganhou, caso esse número seja um número inteiro, positivo estando entre 94 e 456 e se ele errar, mostra tente novamente
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

 public class Ex7 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Digite um número inteiro: ");
         int numero = scanner.nextInt();
 
         if (numero >= 94 && numero <= 456) {
             System.out.println("Acertou!");
         } else {
             System.out.println("Tente de novo");
         }
     }
 }
 