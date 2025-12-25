public class Account {

    private String titular;
    private String TipoDeConta;
    private double saldo;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > saldo || valor < +0) {
            return false;
        }
        saldo -= valor;
        return true;
    }


    public Account(String titular, String tipoDeConta) {
        this.titular = titular;
        this.TipoDeConta = tipoDeConta;
        this.saldo = 0.0;





    }
}

