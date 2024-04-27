import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main (String [] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, a seguir, informe os dados para a criação da sua conta.");

        System.out.print("Seu nome: ");
        conta.setNomeCliente(scanner.next());

        System.out.print("Agência: ");
        conta.setAgencia(scanner.next());

        System.out.print("Número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Qual é o saldo? ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println();

        System.out.println("Olá "
            .concat(conta.getNomeCliente())
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(conta.getAgencia())
            .concat(", conta ")
            .concat(String.valueOf(conta.getNumero()))
            .concat(" e seu saldo ")
            .concat(String.valueOf(conta.getSaldo()))
            .concat(" já está disponível para saque")
        );
    }
}
