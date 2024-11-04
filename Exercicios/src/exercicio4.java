import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int id=0;
        String nome ="";
        String descricao="";
        int quantidade=0;
        int precounitario =0;
        int taxadeimposto =0;
        int precototal=0;

        System.out.println("informe o id do produto ");
        id= Integer.parseInt(teclado.nextLine()); // converte para int.

        System.out.println("informe o nome do produto ");
        nome = teclado.nextLine();

        System.out.println("informe a descrição do produto ");
        descricao= teclado.nextLine();

        System.out.println("informe a quantidade do produto ");
        quantidade = Integer.parseInt(teclado.nextLine());

        System.out.println("informe o preço unitario do produto ");
        precounitario = Integer.parseInt(teclado.nextLine());

        System.out.println("informe a taxa de imposto do produto ");
        taxadeimposto = Integer.parseInt(teclado.nextLine());

        quantidade = quantidade * precounitario;
        taxadeimposto = (quantidade * precounitario) / 100;
        precototal = quantidade + taxadeimposto;

        System.out.println("id do produto: "+id);
        System.out.println("nome do produto: "+nome);
        System.out.println("descrição do produto: "+descricao);
        System.out.println("quantidade do produto: "+quantidade);
        System.out.println("preço unitario do produto: "+precounitario);
        System.out.println("taxa de imposto do produto: "+taxadeimposto);
        System.out.println("preço total do produto: "+precototal);

    }
}
