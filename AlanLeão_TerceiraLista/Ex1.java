/* 
Descrição: Esta lógica Mostra todos Os números do zero até o mil
Nome: Alan Santana Leão
Data: 17/05/2023
 */

public class Ex1 {
    public static void main(String[] args) {
        //criação das variáveis
        int contador = 0;
        //esse "do" pega a variável contador e a mostra na tela, porém toda vez que passa por ele, adiciona um número e mostra novamente
        do {

            System.out.println(contador);
            contador++;

        } while (contador <= 1000);
    }
}