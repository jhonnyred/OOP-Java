public class Main{
    public static void main(String[] args){
        // INSTÂNCIANDO
        ContaCorrente c1 = new ContaCorrente("Alberto", 456875);
        ContaPoupanca p1 = new ContaPoupanca("Emilia", 567985);

        // SAÍDA
        System.out.println("POUPANCA\n");
        System.out.println("Teste 1");
        p1.saque(1);
        System.out.println("Teste 2");
        p1.deposito(1000);
        p1.saque(200);
        p1.consulta();

        System.out.println("\n\nCORRENTE\n");
        System.out.println("Teste 1");
        c1.saque(98);
        c1.saque(98);
        System.out.println("Teste 2");
        c1.deposito(1100);
        c1.consulta();
    }
}