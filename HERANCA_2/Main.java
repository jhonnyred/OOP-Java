public class Main {
    public static void main(String[] args){
        // Instânciando
        Vendedor v1 = new Vendedor("Ricardo", "527498648754", "20/11/2000", "07/10/2024", 2000, 7);
        Gerente g1 = new Gerente("Luiza", "45662138546", "19/11/1996", "07/10/2024", 5000, "Logistica");
        Cliente c1 = new Cliente("Claudineia", "4568972357", "22/06/1987", "neinha@outlook.com", "15987532458", "5697");

        // Printando
        System.out.println(v1.printaTudo());
        System.out.println(g1.printaTudo());
        System.out.println(c1.printaTudo());
    }
}
