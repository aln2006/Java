/*
Descrição: Esta lógica recebe 50 números reais e 50 números inteiros, os soma e no final mostra qual dos dois é maior
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        int quantidadeNumeros = 50;

        // Geração dos números inteiros aleatórios e cálculo da soma
        int somaInteiros = 0;
        Random randomInt = new Random();
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numeroInteiro = randomInt.nextInt();
            somaInteiros += numeroInteiro;
        }

        // Geração dos números reais aleatórios e cálculo da soma
        double somaReais = 0.0;
        Random randomDouble = new Random();
        for (int i = 0; i < quantidadeNumeros; i++) {
            double numeroReal = randomDouble.nextDouble();
            somaReais += numeroReal;
        }

        // Comparação das somas
        System.out.println("A soma dos números inteiros é: " + somaInteiros);
        System.out.println("A soma dos números reais é: " + somaReais);

        if (somaInteiros > somaReais) {
            System.out.println("A soma dos números inteiros é maior.");
        } else if (somaInteiros < somaReais) {
            System.out.println("A soma dos números reais é maior.");
        } else {
            System.out.println("As somas dos números inteiros e reais são iguais.");
        }
    }
}
