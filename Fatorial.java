package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        long fatorial = 1;
        long aux = 0;
        long percentual = 20;
        long resultadoPercentual = 0;

        //Solicita um número para o usuário
        System.out.println("Informe um número:");
        aux = leia.nextInt();

        //Calcula o fatorial
        for (long i = aux; i >= 1; i--) {
            fatorial = fatorial * i;

            System.out.print(i);

            /*Imprime o sinal de multiplicação
            caso o i for maior que 1
             */
            if (i > 1) {
                System.out.print(" * ");
            }
        }

        System.out.println("");
        System.out.println("Fatorial: " + fatorial);

        //Calcula o percentual com regra de "3"
        resultadoPercentual = (fatorial * percentual) / 100;

        System.out.println("20%: " + resultadoPercentual);

    }

}
