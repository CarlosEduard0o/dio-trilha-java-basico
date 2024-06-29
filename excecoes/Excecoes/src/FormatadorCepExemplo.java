public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237640");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    /**
     * Eu criei CepInvalidoException, que tem que
     * extender de Exception. Além disso, tenho que 
     * chamar o método formatarCep dentro de um bloco
     * try catch.
     * @param cep
     * @return
     * @throws CepInvalidoException
     */
    private static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length()!=8)
        throw new CepInvalidoException();

        //Simulando um cep formatado
        return "23.765-046";
    }
}
