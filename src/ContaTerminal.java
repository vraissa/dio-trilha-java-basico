import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número de usuário:");
        int usuario = scan.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        int agencia = scan.nextInt();

        System.out.println("Por favor, informe seu nome:");
        String nomeUsuario = scan.next();

        System.out.println("Por favor, informe o valor desejado para saque:");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeUsuario + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
