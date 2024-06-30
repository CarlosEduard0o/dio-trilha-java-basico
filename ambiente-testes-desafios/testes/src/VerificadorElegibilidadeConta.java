import java.util.Scanner;

public class VerificadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        verificarIdade(idade);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    private static void verificarIdade(int idade) {
        // TODO: Verificar se a idade do cliente
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta
        // bancaria."
        String status = (idade >= 18) ? "Voce esta elegivel para criar uma conta bancaria." : "Voce nao esta elegivel para criar uma conta bancaria."; 
        System.out.println(status);
    }
}
