import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta:");
    int numero = scanner.nextInt();

    System.out.println("Por favor, digite o número da agência:");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o nome do cliente:");
    String nomeCliente = scanner.next();

    System.out.println("Por favor, digite o saldo:");
    Double saldo = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
   }
}
