import java.util.Scanner;

public class Exercicio3_Imprimir_Uma_Soma {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        int num1=0;
        int num2=0;

        System.out.println("Digite um numero");
        num1 = Teclado.nextInt();

        System.out.println("Digite um novo numero");
        num2 = Teclado.nextInt();

        int soma = num1 * num2;

        System.out.println("O resultado é  " + soma);

 

    }
}
