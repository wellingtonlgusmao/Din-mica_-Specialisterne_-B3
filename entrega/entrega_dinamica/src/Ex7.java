
/*
Crie um programa que receba um número. Se o número for par apresente o
quadrado, se for ímpar apresente o cubo. (implementar em linguagem de 
programação)

Exemplo 1:
Digite um número:
2
2 é um número par e seu quadrado é 4 (pois 2²=4)
Exemplo 2:
Digite um número:
3
3 é um número ímpar e seu cubo é 27 (pois 3³=27)
 */
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um Número inteiro: ");
            int numero = scan.nextInt();
            int numeroqd = numero * numero;
            int numerocubo = numeroqd * numero;

            if (numero % 2 == 0)
                System.out.println("é um número par e seu quadrado é" + numeroqd);

            else
                System.out.println("é um número impar e seu cubo é" + numerocubo);
        }

    }
}
