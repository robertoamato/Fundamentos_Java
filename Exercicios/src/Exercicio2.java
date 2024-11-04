import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int res = 0;

        System.out.println("digite um numero");
        num1 = teclado.nextInt();
        System.out.println("digite um outro numero");
        num2 = teclado.nextInt();
        res = num1 + num2;
        if (res >= 6) {
            System.out.println("O aluno foi aprovado como nota " + res);

         } else if (res >= 4) {
            System.out.println("O aluno esta de recuperacao com nota " + res );
          }else if ( res <= 2){
                System.out.println("O aluno foi reprovado com nota " + res);
         }
        System.out.println(" fim do progrma ");
        }

    }

