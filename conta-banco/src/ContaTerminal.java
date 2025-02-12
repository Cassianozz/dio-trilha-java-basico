import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    int numero = 0;
    String agencia;
    String nomeCliente;
    double saldo = 1518.67;   

    System.out.println("Bem vindo, digite seu nome: ");
    nomeCliente = new Scanner(System.in).nextLine();

    System.out.println("Ola, digite o numero da agencia: ");
    agencia = new Scanner(System.in).nextLine();
    
    System.out.println("Informe o numero da conta: ");
    numero = new Scanner(System.in).nextInt();

    System.out.println("Olá " + nomeCliente +"," + " obrigado por criar uma conta em nosso banco, sua agência é "
     + agencia +"," + " conta " + numero + " e seu saldo " + saldo + 
     " ja esta disponivel para saque.");
    }
    } 