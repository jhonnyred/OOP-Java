class ProdutoVestuario extends Produto{
    // ATRIBUTOS
    private String tamanho;
    private String cor;
    private String material;

    // CONSTRUTORES
    ProdutoVestuario(){
    }

    ProdutoVestuario(String nome, double custo, double venda, String tamanho, String cor, String material){
        super(nome, custo, venda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // MÉTODOS 
    @Override
    public double calcularLucro(){
        return super.calcularLucro();
    }

    public String save(){
        String nome = super.getNome();
        String custo = String.valueOf(super.getCusto());
        String venda = String.valueOf(super.getCusto());
        String tamanho = this.tamanho;
        String cor = this.cor;
        String material = this.material;

        return "INSERT INTO Produto (nome, custo, venda) \nVALUES (" +nome+ "," +custo+ "," +venda+ "," +tamanho+ "," +cor+ "," +material+ ");";
    }

    public String delete(){
        String nome = super.getNome();

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';";
    }

    public String update(){
        String nome = super.getNome();
        String custo = String.valueOf(getCusto());
        String venda = String.valueOf(getVenda());
        String tamanho = this.tamanho;
        String cor = this.cor;
        String material = this.material;

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';\nINSERT INTO Produto (nome, custo, venda) \nVALUES (" +nome+ "," +custo+ "," +venda+ "," +tamanho+ "," +cor+ "," +material+ ");";
    }

    // GETTERS
    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }

    // SETTERS
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
} 