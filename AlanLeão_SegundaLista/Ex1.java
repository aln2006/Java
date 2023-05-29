/* 
Descrição: Esta lógica Mostra o valor que o usuário insere e o valor com 15% de desconto
Nome: Alan Santana Leão
Data: 28/05/2023
 */

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        double desconto = valor * 0.15;
        double valorComDesconto = valor - desconto;

        System.out.println("Valor original: " + valor);
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}
