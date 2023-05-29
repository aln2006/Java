/*
Descrição: Esta lógica mostra todos os números até o 100, cujo o quadrado é divisível por 4, coloquei uma escala, porém da para utilizar sem ela.
Nome: Alan Santana Leão
Data: 28/05/2023
 */

public class Ex1 {

    public static void main(String[] args) {
        int limiteSuperior = 100; // Define o limite superior dos números a serem verificados
        int soma = 0;

        for (int i = 1; i <= limiteSuperior; i++) {
            int quadrado = i * i;
            if (quadrado % 4 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números cujo quadrado é divisível por 4 é: " + soma);
    }
}
