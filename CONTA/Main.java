public class Main {
    public static void main(String[] args) throws Exception{
        //Instânciando
        Conta c1 = new Conta();
        
        //Depositando e sacando
        c1.setDeposito(1000);
        c1.setSaque(500);
        System.out.println("\nSaldo: R$" +c1.getConsulta());

        //Testando Consulta
        System.out.println("\n\nANTES DA TAXA POR CONSULTA SER APLICADA");
        for(int i = 0; i < 3; i++){
            System.out.println("Saldo: R$" +c1.getConsulta());
        }

        System.out.println("\nAPOS A TAXA DE CONSULTA SER APLICADA");
        System.out.println("Saldo: R$" +c1.getConsulta());
    }
}
