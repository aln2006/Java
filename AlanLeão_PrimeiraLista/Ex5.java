// Descrição: Esta lógica pega a idade do úsuario e diz o que ele e com base nela.
// Nome: Alan Santana Leão.
// Data: 10/05/2023

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int idade;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite sua idade:");

        idade = sc1.nextInt();

        if (idade <= 12) 
        {
            System.out.println("Você é uma criança.");
        } 
        else if (idade <= 19 && idade > 12) 
        {
            System.out.println("Você é um adolescente.");
        } 
        else if (idade <= 65) 
        {
            System.out.println("Você é um adulto.");
        } 
        else 
        {
            System.out.println("Você é um idoso.");
        }
    }
}
