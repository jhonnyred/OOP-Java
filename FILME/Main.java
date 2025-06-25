public class Main {
    public static void main(String[] args) throws Exception{
        //Instânciando a classe
        Filme f1 = new Filme();

        //Definindo os atributos
        f1.setTitulo("Ilha do Medo");
        f1.setDuracao(150);
        f1.setGenero(Genero.TERROR);

        //Saída
        System.out.println("Titulo: " +f1.getTitulo());
        System.out.println("Duracao: " +f1.getDuracao());
        System.out.println("Genero: " +f1.getGenero());
    }
}
