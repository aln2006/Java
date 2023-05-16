 import java.util.Scanner;

 public class Ex2 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        
        int cont, n1, n2;

        System.out.println("Digite o primeiro número:");
        n1 = numeros.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = numeros.nextInt();

        if (n1 > n2 ) 
        {
            n2 = n2+1;
            n1 = n1-1;
            cont = n2;

            while (cont <= n1) 
            {
                System.out.println(cont++);
            }
        } else 
        {
            n1 = n1+1;
            n2 = n2-1;
            cont = n1;

            while (cont <= n2) 
            {
                System.out.println(cont++);
            }
        }
    }
 }

