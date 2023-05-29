/*
Descrição: Esta lógica recebe a altura e a base do triângulo, calcula e mostra a área de um triângulo.
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
