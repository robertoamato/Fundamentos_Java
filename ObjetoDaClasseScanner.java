import java.util.Scanner;

public class ObjetoDaClasseScanner {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner1 = new Scanner(System.in);

        String nome = "" ;
        System.out.println("Qual é o seu nome?");
        nome = scanner1.nextLine();
        System.out.println("Ola, " + nome + "!");
        
        scanner1.close();

   

}

}



