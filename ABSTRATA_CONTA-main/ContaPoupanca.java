class ContaPoupanca extends ContaBancaria{
    // ATRIBUTOS
    private String nome;
    private int numero;
    
    // CONSTRUTORES
    ContaPoupanca(){
    }

    ContaPoupanca(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    // MÉTODOS
    @Override
    void saque(double saque){
        if(super.saldo < saque){
            System.out.println("Voce nao possui saldo suficiente para realizar este saque\n");
        }else{
            super.saldo -= saque+0.2;
            System.out.println("Nome: " +this.nome);
            System.out.println("Conta: " +this.numero);
            System.out.println("Saque: R$" +saque);
            System.out.println("Saldo: R$" +super.saldo+ "\n*Para cada saque é descontando uma tarifa de R$0,20*\n");
        }
    }

    @Override
    void deposito(double deposito){
        super.saldo += deposito-0.05;
        System.out.println("Nome: " +this.nome);
        System.out.println("Conta: " +this.numero);
        System.out.println("Deposito: R$" +deposito);
        System.out.println("Saldo: R$" +super.saldo+ "\n*Para cada deposito é cobrado uma tarifa de R$0,05*\n");
    }

    @Override
    void consulta(){
        super.saldo -= 0.02;
        System.out.println("Saldo: R$" +super.saldo+ "\n*Para cada consulta é cobrado uma tarifa de R$0,02\n");
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}