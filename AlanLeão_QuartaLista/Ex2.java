/*
Descrição: Esta lógica recebe três números, os soma e caso a soma seja diferente de 48 ou 71, ele se repete INFINITAMENTE
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

 public class Ex2 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         int soma = 0;
 
         while (soma != 48 && soma != 71) {
             System.out.println("Digite três números: ");
 
             int numero1 = scanner.nextInt();
             int numero2 = scanner.nextInt();
             int numero3 = scanner.nextInt();
 
             soma = numero1 + numero2 + numero3;
         }
 
         System.out.println("A soma é igual a 48 ou 71. Encerrando o programa.");
     }
 }
 