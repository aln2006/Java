/*
 Descrição: Esta lógica Recebe 500 números do úsuario e calcula a média deles
 Nome: Alan Santana Leão
 Data: 17/05/2023
*/

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args)
    {
        //Criação das variáveis
        Scanner num = new Scanner(System.in);
        int numeros;
        int soma = 0;
        
        //Inicio da lógica que Recebe os 500 números dos usuários, onde usamos a variavel cont para, nos dar a base de quando deve acabar de enviar as informações de receber um número
        for(int cont = 1; cont <= 500; cont++){
            System.out.println("Digite o " + cont + "° número:");
            numeros = num.nextInt();
            soma = soma + numeros;
        }
        System.out.println("A media é: " + soma/500);
    }
}