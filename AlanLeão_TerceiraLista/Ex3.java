import java.util.Scanner;

public class Ex3{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int numeros;
        int soma = 0;
        
        for(int cont = 1; cont <= 5; cont++){
            System.out.println("Digite o " + cont + "° número:");
            numeros = num.nextInt();
            soma = soma + numeros;
        }
        System.out.println("A media é: " + soma/5);
    }
}