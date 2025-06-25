abstract class Produto{
    // ATRIBUTOS
    private String nome;
    private double custo;
    private double venda;

    // CONSTRUTORES
    Produto(){
    }

    Produto(String nome, double custo, double venda){
        this.nome = nome;
        this.custo = custo;
        this.venda = venda;
    }

    // MÉTODOS
    public double calcularLucro(){
        return this.venda - this.custo;
    }

    public String save(){
        String nome = this.nome;
        String custo = String.valueOf(this.custo);
        String venda = String.valueOf(this.venda);

        return "INSERT INTO Produto (nome, custo, venda) \nVALUES (" +nome+ "," +custo+ "," +venda+ ");";
    }

    public String delete(){
        String nome = this.nome;

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';";
    }

    public String update(){
        String nome = this.nome;
        String custo = String.valueOf(this.custo);
        String venda = String.valueOf(this.venda);

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';\nINSERT INTO Produto (nome, custo, venda) VALUES (" +nome+ "," +custo+ "," +venda+ ");";
    }
    
    // GETTERS
    public String getNome(){
        return nome;
    }

    public double getCusto(){
        return custo;
    }

    public double getVenda(){
        return venda;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCusto(double custo){
        this.custo = custo;
    }

    public void setVenda(double venda){
        this.venda = venda;
    }
}