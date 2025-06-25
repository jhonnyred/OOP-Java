public class Conta{

    //Atributos
    private double saldo;
    private int taxaConsulta;

    //Consulta
    public double getConsulta(){
        taxaConsulta++;
        if (taxaConsulta == 5){
            saldo -= 0.1;
            taxaConsulta = 0;
        }
        return saldo;
    }

    //Depósito
    public void setDeposito(double deposito) throws Exception{
        if (deposito < 0){
            throw new Exception("Nao eh possivel depositar valores menores que R$0.00");
        }else{
            this.saldo -= deposito*0.01;
            this.saldo += deposito;
        }
    }

    //Saque
    public void setSaque(double saque) throws Exception{
        if (saque < 0){
            throw new Exception("Nao eh possivel sacar valores menores que R$0.00");
        }else{
            this.saldo -= saque*0.005;
            this.saldo -= saque;
        }
    }
}