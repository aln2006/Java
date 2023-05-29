/*
Descrição: Esta lógica recebe um número do usuário e mostra o seu antecessor e o seu sucessor
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

 public class Ex5 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Digite um número: ");
         int numero = scanner.nextInt();
 
         int antecessor = numero - 1;
         int sucessor = numero + 1;
 
         System.out.println("Número: " + numero);
         System.out.println("Antecessor: " + antecessor);
         System.out.println("Sucessor: " + sucessor);
     }
 }
 