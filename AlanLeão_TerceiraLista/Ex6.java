// Descrição: Esta lógica mostra o número que o úsuario digita a mesma quantidade de vez que o número representa, exemplo número 5: 5, 5, 5, 5, 5
// Nome: Alan Santana Leão
// Data: 10/04/2023

import java.util.Scanner;

public class Ex6
{
    public static void main(String[] args)
    { 
        //Criação das variáveis
        Scanner numeros = new Scanner(System.in);
        int num;

        //Inicio da Logica
        do
        {
        System.out.println("Digite um número inteiro:");
        num =  numeros.nextInt();//A variável num recebe o número digitado pelo usuário
        
        } while(num <=1);//O while verifica se o num é menor ou igual a 1
        
        int contador = 1;//Declaração da Variável contador

        do //Esse "do" realiza a adição de +1 na variável contador, enquanto o contador, for menor ou igual a variável num
        {
            System.out.println(num + "");
            contador ++;
        }while(contador <=num);

        System.out.println();
    }

}