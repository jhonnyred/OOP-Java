import java.time.LocalDate;

class Funcionario extends Pessoa{
    // ATRIBUTOS
    private LocalDate contratacao;
    private double salario;
    
    // CONSTRUTORES
    Funcionario(){
    }

    Funcionario(String nome, String cpf, String nascimento, String contratacao, double salario){
        super(nome, cpf, nascimento);
        this.contratacao = formatLocal(contratacao);
        this.salario = salario;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String pessoa = super.printaTudo();
        String contratacao = formatStr(this.contratacao);
        String salario = String.valueOf(this.salario);

        return pessoa+ "\nData de contratacao: " +contratacao+ "\nSalario: R$" +salario; 
    }

    // GETTERS
    public LocalDate getContratacao(){
        return contratacao;
    }

    public double getSalario(){
        return salario;
    }

    // SETTERS
    public void setContratacao(LocalDate contratacao){
        this.contratacao = contratacao;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}