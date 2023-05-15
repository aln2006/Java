// Descrição: Esta lógica Converte o valor da moeda Real para Dolar
// Nome: Alan Santana Leão
// Data: 10/04/2023

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args) 
    {
       float real, resDolar;
       Scanner sc1 = new Scanner(System.in);
       
       System.out.println("Digite o valor que será convertido para dolar:");

       real = sc1.nextFloat(); 
       resDolar = real*4.94;

       System.out.println("O resultado da conversão para dolar é: " + resDolar);
    }
}