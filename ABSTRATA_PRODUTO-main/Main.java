public class Main{
    public static void main(String[] args){
        // INSTÂNCIANDO
        ProdutoAlimenticio a1 = new ProdutoAlimenticio("nome", 7.0, 25.78, "02/11/2024", "nutricionais");
        ProdutoVestuario v1 = new ProdutoVestuario("nome", 80.65, 125.98, "G", "cor", "material");

        // SAÍDA METODO calcularLucro()
        System.out.println("Lucro a1: " +String.valueOf(a1.calcularLucro()));
        System.out.println("Lucro v1: " +String.valueOf(v1.calcularLucro()));

        // SAÍDA MÉTODOS INSTRUÇÕES SQL
        System.out.println("\nSalvar: \n" +a1.save());
        System.out.println("\n\nDeletar: \n" +a1.delete());
        System.out.println("\n\nAtualizar: \n" +a1.update());

        System.out.println("\n\nSalvar: \n" +v1.save());
        System.out.println("\n\nDeletar: \n" +v1.delete());
        System.out.println("\n\nAtualizar: \n" +v1.update());
    }
}