import java.util.Scanner;

public class ObjetoDaClasseScanner {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner1 = new Scanner(System.in);

        // Receber o nome do usuário
        String nome = "";
        System.out.println("Qual é o seu nome?");
        nome = scanner1.nextLine();
        System.out.println("Bem-vindo, " + nome + ", no que posso lhe ajudar?");

        // Receber a primeira entrada do usuário
        String digite = "";
        System.out.println("Digite algo:");
        digite = scanner1.nextLine();
        System.out.println("Você digitou: " + digite);

        // Confirmar o que foi digitado
        String confirma = "";
        System.out.println("Você confirma?");
        confirma = scanner1.nextLine();
        System.out.println("Você confirmou: " + confirma);

        // Receber a nota do usuário
        int nota = 0;
        System.out.println("Digite a sua nota:");
        nota = scanner1.nextInt();

        // Consumir a nova linha pendente após o nextInt()
        scanner1.nextLine();

        // Exibir a nota
        System.out.println("Você digitou a nota: " + nota);

        // Verificar se o usuário foi aprovado ou reprovado com base na nota
        if (nota >= 5) {
            System.out.println(nome + ", você foi aprovado.");
        } else {
            System.out.println(nome + ", você foi reprovado.");
        }

        // Fechar o Scanner
        scanner1.close();
    }
}
