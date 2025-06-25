public class Cliente extends Pessoa{
    // ATRIBUTOS
    private String email;
    private String telefone;
    private String fidelidade;

    // CONSTRUTORES
    Cliente(){
    }

    Cliente(String nome, String cpf, String nascimento, String email, String telefone, String fidelidade){
        super(nome, cpf, nascimento);
        this.email = email;
        this.telefone = telefone;
        this.fidelidade = fidelidade;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String pessoa = super.printaTudo();
        String email = this.email;
        String telefone = this.telefone;
        String fidelidade = this.fidelidade;
        
        return pessoa+ "\nEmail: " +email+ "\nTelefone: " +telefone+ "\nNum. Cartao fidelidade: " +fidelidade;
    }

    // GETTERS
    public String getEmail(){
        return email;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getFidelidade(){
        return fidelidade;
    }

    // SETTERS
    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setFidelidade(String fidelidade){
        this.fidelidade = fidelidade;
    }
}
