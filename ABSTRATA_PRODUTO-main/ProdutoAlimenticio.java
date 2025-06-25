import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ProdutoAlimenticio extends Produto{
    // ATRIBUTOS
    private LocalDate validade;
    private String nutricionais;

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

    // CONSTRUTORES
    ProdutoAlimenticio(){
    }

    ProdutoAlimenticio(String nome, double custo, double venda, String validade, String nutricionais){
        super(nome, custo, venda);
        this.nutricionais = nutricionais;
        this.validade = LocalDate.parse(validade, formatador);
    }

    // MÉTODOS
    @Override
    public double calcularLucro() {
        return super.calcularLucro();
    }

    public String save(){
        String nome = super.getNome();
        String custo = String.valueOf(super.getCusto());
        String venda = String.valueOf(super.getVenda());
        String nutricionais = this.nutricionais;
        String validade = this.validade.format(formatador);

        return "INSERT INTO Produto (nome, custo, venda) \nVALUES (" +nome+ "," +custo+ "," +venda+ "," +nutricionais+ "," +validade+ ");";
    }

    public String delete(){
        String nome = super.getNome();

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';";
    }

    public String update(){
        String nome = super.getNome();
        String custo = String.valueOf(getCusto());
        String venda = String.valueOf(getVenda());
        String nutricionais = this.nutricionais;
        String validade = this.validade.format(formatador);

        return "DELETE FROM Produto\nWHERE nome = '" +nome+ "';\nINSERT INTO Produto (nome, custo, venda) \nVALUES (" +nome+ "," +custo+ "," +venda+ "," +nutricionais+ "," +validade+ ");";
    }

    // GETTERS
    public LocalDate getValidade() {
        return validade;
    }

    public String getNutricionais() {
        return nutricionais;
    }

    // SETTERS
    public void setValidade(String validade) {
        this.validade = LocalDate.parse(validade, formatador);
    }

    public void setNutricionais(String nutricionais) {
        this.nutricionais = nutricionais;
    }
}