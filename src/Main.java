import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        Account conta = new Account("Ewerton", "Corrente");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                    ====== WetBank ======
                    1 - Consultar saldo
                    2 - Sacar
                    3 - Receber
                    4 - Sair
                    
                    """);

            opcao = le.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Saldo atual: R$ " +
                            conta.getSaldo());
                    break;

                case 2:

                    System.out.println("Valor para saque: ");
                    double saque = le.nextDouble();

                    if (conta.sacar((saque))) {
                        System.out.println("saque realizado com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3:

                    System.out.println("Valor para depósito: ");
                    double deposito = le.nextDouble();

                    conta.depositar(deposito);

                    System.out.println("Depósito realizado.");
                    break;

                case 4:

                    System.out.println("Saindo do sistema...");
                    break;

                default:

                    System.out.println("opção inválida.");

            }
        }

        le.close();

    }
}