import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Exercicio_String01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, email, telefone;
        int idade;
        Double peso, altura;

        System.out.println("Digite seu email");
        email = teclado.nextLine();


        System.out.println("Digite seu nome");
        nome = teclado.nextLine();


        System.out.println(" Digite seu numero de telefone");
        telefone = teclado.nextLine();


        System.out.println(" Digite a sua idade" );
        idade = Integer.parseInt(teclado.nextLine());


        System.out.println("Digite seu peso");
        peso = Double.parseDouble(teclado.nextLine());


        System.out.println(" Digite sua altura ");
        altura = Double.parseDouble(teclado.nextLine());

        System.out.println( " email  " + email  );
        System.out.println( "nome " + nome );
        System.out.println( "telefone "  + telefone );
        System.out.println( "idade " + idade );
        System.out.println( "peso "  + peso );
        System.out.println( "altura " + altura  );


}}
