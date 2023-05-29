- Construa um algoritmo que receba três números, e enquanto a soma deles for diferente
de 48 ou 71, continue recebendo três valores infinitamente.


import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int varA = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int varB = scanner.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("A = " + varA);
        System.out.println("B = " + varB);

        int temp = varA;
        varA = varB;
        varB = temp;

        System.out.println("Valores após a troca:");
        System.out.println("A = " + varA);
        System.out.println("B = " + varB);
    }
}
