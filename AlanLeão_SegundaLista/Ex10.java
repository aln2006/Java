/*
Descrição: Esta lógica recebe um número do usuário e mostra se ele é par ou impar
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
