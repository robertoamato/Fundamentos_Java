import java.util.Scanner;

public class Exercicio_Imprimir_Uma_Soma {

    public static void main(String[] args) {
        //Declaraçao
        int numero1 = 0;
        int numero2= 0;
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados

        System.out.println("Digite um numero");
        numero1= teclado.nextInt();

        System.out.println("Digite um novo numero");
        numero2 = teclado.nextInt();

        int soma= numero1 + numero2;

            // saida de dados
        System.out.println(" o valor da soma é  "  + soma);

    }
}
