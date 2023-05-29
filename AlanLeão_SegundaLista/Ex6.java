/*
Descrição: Esta lógica recebe a quantidade de sorvetes e o sabor e mostra o Valor total da compra
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos picolés
        double precoKiwi = 3.20;
        double precoLaranja = 2.39;
        double precoRoma = 7.99;

        // Captura a quantidade de picolés de cada sabor
        System.out.print("Digite a quantidade de picolés de Kiwi: ");
        int qtdKiwi = scanner.nextInt();

        System.out.print("Digite a quantidade de picolés de Laranja: ");
        int qtdLaranja = scanner.nextInt();

        System.out.print("Digite a quantidade de picolés de Romã: ");
        int qtdRoma = scanner.nextInt();

        // Cálculo do valor total da compra
        double totalCompra = (precoKiwi * qtdKiwi) + (precoLaranja * qtdLaranja) + (precoRoma * qtdRoma);

        // Exibição do valor total da compra
        System.out.println("O valor total da compra é: R$ " + totalCompra);
    }
}
