/*
Descrição: o primeiro exemplo dessa lógica recebe um número real do usuário e mostra se ele e positivo, negativo ou igual a zero, o  segundo recebe um inteiro do usuário e mostra se ele é par ou impar, o terceiro recebe uma palavra do usuário e a mostra, o quarto mostra o caractére que o usuário o inseriu
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (numeroReal > 0) {//primeiro exemplo, onde mostra se o número real é positivo, negativo ou  igual a zero
            System.out.println("O número real é positivo.");
        } else if (numeroReal < 0) {
            System.out.println("O número real é negativo.");
        } else {
            System.out.println("O número real é igual a zero.");
        }

        if (numeroInteiro % 2 == 0) {//Segundo exemplo, ele mostra se o número inteiro é par ou impar
            System.out.println("O número inteiro é par.");
        } else {
            System.out.println("O número inteiro é ímpar.");
        }

        System.out.println("A palavra digitada é: " + palavra);//terceiro exemplo, mostra a palavra digitada anteriormente pelo usuário
        System.out.println("O caractere digitado é: " + caractere);//Quarto Exemplo, Mostra o caractere Digitado anteriormente pelo usuário
    }
}
