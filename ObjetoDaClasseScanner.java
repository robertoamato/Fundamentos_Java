import java.util.Scanner;

public class ObjetoDaClasseScanner {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declarar variáveis
        int nota2 = 0;
        int nota3 = 0;
        String nome = "";

        // Receber o nome do usuário
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        // Receber a segunda nota
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        // Receber a terceira nota
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextInt();

        // Calcular e exibir a média das notas
        System.out.println(nome + ", a média é: " + (nota2 + nota3) / 2);

        // Fechar o Scanner
        sc.close();
    }
}
