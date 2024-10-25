import java.util.Locale;

public class ParOuImpar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //config. do Locale
        Locale.setDefault(Locale.US);
        //obj. do tipo Scanner
        Scanner sc = new Scanner(System.in);

        int valor;
        //entrada de dados
        System.out.print("Informe um valor: ");
        valor = Integer.parseInt(sc.nextLine());

        //verifica se o número é par ou ímpar
        if(valor % 2 == 0) {
            System.out.println(valor + " é par");
        }
        else {
            System.out.println(valor + " é ímpar");


    }
}
