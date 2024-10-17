public class ComandosDeDecisao {  
  public static void main(String[] args) {
    int y = 20;
    int x = 10;
  
    // Primeira verificação: se x é maior que y
    if (x > y) {
      System.out.println("x é maior que y");
    } else {
      System.out.println("x é menor que y");
    }

    // Variáveis para notas e faltas
    int nota = 85;
    int faltas = 10;
    int maxFaltas = 5;
    int media = 60;

    // Segunda verificação: checar aprovação, recuperação ou reprovação
    if (nota >= media && faltas < maxFaltas) {
      System.out.println("Aprovado");
    } else if (nota < media) {
      System.out.println("Recuperação");
    }else if (faltas >= maxFaltas) {
      System.out.println("Reprovado por faltas");
    }
    
    
    else {
      System.out.println("Reprovado");
    }
  }
}
