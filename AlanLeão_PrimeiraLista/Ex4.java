// Descrição: Aqui se é falado qual opção melhor se encaixa para cada tipo
// Nome: Alan Santana Leão
// Data: 10/04/2023

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args) 
    {
        double dolar; /*Pode ser float, ou em caso de bancos a maioria usa int por usarem a medida em centavos */
        
        float temperatura; /*Pode ser double também */

        int idade;

        int datas; /*Para ser mais preciso, use java.time.LocalDate */

        String genero; /*Coloquei string, porém daria um problema para filtrar na hora do banco de dados, no caso de armazenar usaria um Char */

        String frases, letra_de_musica; /* para ser melhor so montar um array list de String */

        double peso, preco; /*Pode ser float também, mas pela maior precisão escolhi o double */

        boolean resposta; /*Pode ser um enum também, caso seja sim não e um talvez*/
    }
}