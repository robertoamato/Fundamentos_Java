import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = 0;
            System.out.println("digite a sua idade");
        idade = teclado.nextInt();
        if (idade >= 18) {
            System.out.println(" voce é de maior ");
        } else {
            System.out.println(" voce é de menor");
        }

    }
}