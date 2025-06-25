public class Produto{
    private String nome;
    private String marca;
    private double custo;
    private double venda;

    public Produto(String nome, String marca, double custo, double venda){
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }

    public String calculador(){
        String lucro = String.valueOf(this.venda - this.custo);
        return
           lucro;

    }

    // GETTERS
    // Getter nome
    public String getNome(){
        return nome;
    }

    // Getter marca
    public String getMarca(){
        return marca;
    }

    // Getter custo
    public double getCusto(){
        return custo;
    }

    // Getter venda
    public double getVenda(){
        return venda;
    }

    //SETTERS
    // Setter nome
    public void setNome(String nome){
        this.nome = nome;
    }

    // Setter marca
    public void setMarca(String marca){
        this.marca = marca;
    }

    // Setter custo
    public void setCusto(double custo){
        this.custo = custo;
    }

    // Setter venda
    public void setVenda(double venda){
        this.venda = venda;
    }
}

