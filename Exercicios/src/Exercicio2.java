import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int res = 0;

        System.out.println("digite um numero");
        num1= teclado.nextInt();
        System.out.println("digite um outro numero");
        num2 = teclado.nextInt();
        res=num1+num2;
        System.out.println("o resultado é  " + res);
        System.out.println("fim do programa ");


    }
}
