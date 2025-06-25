abstract class ContaBancaria{
    // ATRIBUTOS
    protected double saldo = 0.0;

    // MÉTODOS
    abstract void saque(double saque);

    abstract void deposito(double deposito);

    abstract void consulta();
}