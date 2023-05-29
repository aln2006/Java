/*
Descrição: Esta lógica recebe um texto que o usuário digitou e caso ele tenha mais que 10 caracteres, mostra "Você digitou um palavrão", caso contrário mostra "Você digitou uma palavrinha"
Nome: Alan Santana Leão
Data: 28/05/2023
 */

 import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        int quantidadeCaracteres = texto.length();

        if (quantidadeCaracteres > 10) {
            System.out.println("Você digitou um palavrão!");
        } else {
            System.out.println("Você digitou uma palavrinha.");
        }
    }
}
