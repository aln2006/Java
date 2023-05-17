import java.util.Scanner;

public class Ex6
{
    public static void main(String[] args)
    { 
        Scanner numeros = new Scanner(System.in);
        int num;

        do
        {
        System.out.println("Digite um número inteiro:");
        num =  numeros.nextInt();
        
        } while(num <=1);
        
        int contador = 1;

        do 
        {
            System.out.println(num + "");
            contador ++;
        }while(contador <=num);

        System.out.println();
    }

}