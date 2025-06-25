import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // CONSTRUTORES
    Pessoa(){
    }

    Pessoa(String nome, String cpf, String nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = formatLocal(nascimento);
    }

    // MÉTODOS
    protected LocalDate formatLocal(String data){
        LocalDate formatado = LocalDate.parse(data,formatador);

        return formatado;
    }

    protected String formatStr(LocalDate data){
        String formatado = data.format(formatador);

        return formatado;
    }

    
    protected String printaTudo(){
        String nome = this.nome;
        String cpf = this.cpf;
        String nascimento = formatStr(this.nascimento);

        return "\nNome: " +nome+ "\nCPF: " +cpf+ "\nData de nascimento: " +nascimento; 
    }

    // GETTERS

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    //SETTERS

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = formatLocal(nascimento);
    }
}
