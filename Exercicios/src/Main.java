import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        System.out.println("Digite sua nota");
        nota = entrada.nextInt();

        if (nota >= 5) {
            System.out.println("Voce foi aprovado com a nota  " + nota);

        } else {
            System.out.print("voce foi reprovado com a nota " + nota);


        }
        int faltas = 0;
        System.out.println("Digite a quantidade de falta");
        faltas = entrada.nextInt();

        if (faltas <= 5) {
            System.out.print("Voce foi aprovado por falta " + faltas);
        } else {
            System.out.print("voce foi reprovado por faltas " + faltas);
        }



    }
}