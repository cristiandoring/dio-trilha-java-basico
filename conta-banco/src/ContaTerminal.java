import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        //entrada do número da agência
        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();
        
        //consumir quebra de linha pendente
        scanner.nextLine();

        //entrada do código da agência
        System.out.println("Digite a agência!");
        String agencia = scanner.nextLine();

        //entrada do nome do cliente
        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

        //entrada do saldo
        scanner.useLocale(Locale.US);//aceita o formato decimal americano "."
        System.out.println("Digite saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
