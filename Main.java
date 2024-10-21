import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variaveis
        Scanner teclado = new Scanner(System.in);
        String Nome = "";
        String Sobrenome ="";
        int idade = 0;
        // entrada de dados
        System.out.print("Digite seu nome: ");
        Nome = teclado.next();
        System.out.print("Digite seu sobrenome: ");
        Sobrenome = teclado.next();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        // saida de dados
        System.out.print("Boa tarde " + Nome + " " + Sobrenome + "!" + " Você tem " + idade + " anos.");


    }
}