// Descrição: Esta lógica calcula 4 números e o quadrado de cada e os soma
// Nome: Alan Santana Leão
// Data: 10/04/2023

import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        float n1, n2, n3, n4, resSoma;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite os números:");
        n1 = sc1.nextFloat();
        n2 = sc1.nextFloat();
        n3 = sc1.nextFloat();
        n4 = sc1.nextFloat();

        resSoma = (n1*2) + (n2*2) + (n3*2) + (n4*2);

        System.out.println("O resultado da soma é: " + resSoma);
    }
}