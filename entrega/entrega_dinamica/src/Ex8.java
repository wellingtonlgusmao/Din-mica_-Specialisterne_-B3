
/*Criar um programa que leia uma palavra e mostre se tal palavra é um
palíndromo ou não, exemplo: (implementar em linguagem de 
programação).
Digite uma palavra:
Roma
Resultado: Roma não é
palíndromo
Digite uma palavra:
Reger
Resultado: Reger é palíndromo

Um palíndromo é uma palavra, 
frase ou qualquer outra 
sequência de unidades que tenha 
a propriedade de poder ser lida 
tanto da direita para a esquerda 
como da esquerda para a direita.
 */
import java.util.*;

public class Ex8 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String contrario = "";

            System.out.println("Digite uma palavra para verificar se é um palíndromo");
            String nome = scan.nextLine(); // recebo um texto pelo tclado

            for (int i = (nome.length() - 1); i >= 0; i--) {
                // converto isso pra vetores com indice progressivo, de limite i(num caractes);
                contrario = contrario + nome.charAt(i); // não estou familiarizado com esse metodo charAt
                System.out.println(contrario);
            }

            if (contrario.toLowerCase().equals(nome.toLowerCase())) // utilizo o metodo equals para comparar objetos e
                                                                    // me fornecer um boolean
            {
                System.out.println("Essa palavra é palíndromo :)");// caso true
            } else {
                System.out.println("Essa palavra não é palíndromo :(");// caso false
            }
        }

    }

}
