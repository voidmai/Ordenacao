public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double limiteCredito;
    private double saldo;

    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public int compareTo(Conta outraConta) {
        return Integer.compare(this.numero, outraConta.numero);
    }
}