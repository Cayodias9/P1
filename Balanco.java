import java.io.PrintStream;

public class Balanco{
    private static PrintStream printf;

    public static void main(String[] args){

        double GastosAbril = 1212.00;

        System.out.printf("Valor salário mínimo: %.2f R$",GastosAbril," R$");

        printf = System.out.printf("\nValor salário mínimo multiplicado x10: %.2f R$",(GastosAbril * 10)," R$");

    }

}
