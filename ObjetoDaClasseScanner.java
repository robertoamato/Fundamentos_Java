import java.util.Scanner;

public class ObjetoDaClasseScanner {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner1 = new Scanner(System.in);

        String nome = "" ;
        System.out.println("Qual é o seu nome?");
        nome = scanner1.nextLine();
        System.out.println("Ola, " + nome + "!");
        
      int idade = 0;
        System.out.println("Qual é a sua idade?");
        idade = scanner1.nextInt();
        
        
      int nota = 0;
        System.out.println("digite o valor da sua nota");
        nota = scanner1.nextInt();  
        System.out.println("A sua nota é: " + nota);

        if (nota > 0) { 
            System.out.println(" PARABENS, VOCE FOI APROVADO");
        } else {
            System.out.println("Reprovado");
          
        }

        scanner1.close();

   

}

}



