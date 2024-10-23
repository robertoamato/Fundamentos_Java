import java.util.Scanner;


public class Exercicio2_Imprimir_Uma_Soma {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;


        System.out.println("digite um numero"  );
        num1 = sc.nextInt();

        System.out.println("Digite um segundo numero" );
        num2 = sc.nextInt();

        int res = num1 + num2;

        System.out.println("O valor da soma é "  +  res);

        sc.close();
    }
}
