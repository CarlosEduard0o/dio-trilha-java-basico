import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        // System.out.println(valor);
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //A proposta de exceções checkeds e não unckecheds 
    //é o fato de ao tentar usar o método esse método 
    //determina que voc~e rpecisa tratar algum erro imediatamente.

    //Diferentemente das runtime exception que o erro pode acontecer, 
    //mas você não tratou. Isso porque não detectaram ou perceberam que 
    //poderia não ser um erro tão recorrente.

    //Também é possível criar sua própria exceção
}
