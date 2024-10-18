package Curso;

public class ConversaoExplicita {

    public static void main(String[] args) {
        //Conversao Explicita do maior para o menor tipo

        long VarLong = 1000_0000_000L;
        int VarInt = (int) VarLong;
        System.out.println( VarInt);

        double VarDouble = 3654.9875;
        float VarFloat = (float) VarDouble;
        System.out.println( VarFloat);

        float VarFloat2 = 3654.9875f;
        double VarDouble2 = (double) VarFloat2;
        System.out.println( VarDouble2);
    }

}
