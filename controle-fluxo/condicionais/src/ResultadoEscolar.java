public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        verificarNotaComIfElse(nota);
        verificarNotaComOperadorTernario(nota);

    }

    /**
     * Método que faz a verificação da nota através de if, else if e else
     * @param nota
     */
    private static void verificarNotaComIfElse(int nota) {
        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de recuperação");
        }
        else
            System.out.println("Reprovado");
    }

    /**
     * Método que faz a verificação da nota através de operadores ternários
     * @param nota
     */
    private static void verificarNotaComOperadorTernario(int nota) {
        //Operador ternário com if e else
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        //Operador ternário com if, else if e else
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
