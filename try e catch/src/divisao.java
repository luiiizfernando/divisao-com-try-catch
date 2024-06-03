/*
    Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
    Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        int n1, n2;
        boolean valido = true;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa recebe 2 número e divide o primeiro pelo segundo.");
        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextByte();
        int cont = 0;

        while (valido) {
            try {
                if (cont == 0) {
                    System.out.println("Digite o segundo número: ");
                    n2 = leitura.nextByte();
                    System.out.println(n1 + " ÷ " + n2 + " = " + n1 / n2);
                    valido = false;
                }
                else
                {
                    System.out.println("Digite o segundo número novamente: ");
                    n2 = leitura.nextByte();
                    System.out.println(n1 + " ÷ " + n2 + " = " + n1 / n2);
                    valido = false;
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
                cont++;
            }
        }
    }
}
