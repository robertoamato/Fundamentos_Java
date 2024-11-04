import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        String sobrenome = "";
        String curso = "";
        int idade = 0;
        int ano = 0;
        int mes = 0;
        int dia = 0;

        System.out.println("Digite seu nome: ");
        nome = teclado.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = teclado.nextLine();

        // Limpar o buffer antes de usar o nextLine() para ler o curso
        teclado.nextLine();

        System.out.println("Digite o nome do seu curso: ");
        curso = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        idade = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite o ano do seu nascimento: ");
        ano = teclado.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        mes = teclado.nextInt();

        System.out.println("Digite o dia do seu nascimento: ");
        dia = teclado.nextInt();

        teclado.close();

        System.out.println("\nInformações coletadas:");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
    }
}
