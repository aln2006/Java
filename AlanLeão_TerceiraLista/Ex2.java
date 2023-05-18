/*
 Descrição: Esta lógica mostra os numeros que faltam, do maior para o menor fazendo uma contagem, 1 e 6, ele mostra 2, 3, 4, 5.
 Nome: Alan Santana Leão
 Data: 17/05/2023
 */

import java.util.Scanner;

 public class Ex2 {
    public static void main(String[] args) {

        //criação das variáveis
        Scanner numeros = new Scanner(System.in);
        int cont, n1, n2;

        //Declaração das variáveis
        System.out.println("Digite o primeiro número:");
        n1 = numeros.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = numeros.nextInt();

        //Inicio da lógica de Mostrar
        if (n1 > n2 ) 
        {
            n2 = n2+1;
            n1 = n1-1;
            cont = n2;

            System.out.println("Sequencia do menor para o maior");
            while (cont <= n1) 
            {
                System.out.println(cont++);
            }
        } else if( n2 > n1)
        {
            n1 = n1+1;
            n2 = n2-1;
            cont = n1;

            System.out.println("Sequencia do menor para o maior");
            while (cont <= n2) 
            {

                System.out.println(cont++);
            }
        }else
        {
            System.out.println("Os números são iguais");
        }
    }
 }

