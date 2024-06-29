public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";
        String plano = "M";
        verificacaoComSwitchCase(sigla);
        verificarComSwitchCaseSemBreak(plano);
    }

    /**
     * Nem sempre o switch case é mais performático
     * do que um if else. O importante é avaliar qual
     * seria a melhor abordagem. O break faz com que
     * ao cair na condição determinada encerre o bloco
     * 
     * @param sigla
     */
    private static void verificacaoComSwitchCase(String sigla) {
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }

    /**
     * Quando não utilizamos o break, o resultado é
     * a condicao atendida mais o que vem abaixo.
     * @param plano
     */
    private static void verificarComSwitchCaseSemBreak(String plano) {
        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
