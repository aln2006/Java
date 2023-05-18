// Descrição: Esta lógica calcula o peímetro de um circulo
// Nome: Alan Santana Leão
// Data: 10/05/2023

import java.util.Scanner;

public class CalculaPerimetroCirculo {
    public static void main(String[] args) {
        double raio, perimetro;
        double PI = 3.14159; // constante pi

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");

        raio = input.nextDouble();
        perimetro = 2 * PI * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
