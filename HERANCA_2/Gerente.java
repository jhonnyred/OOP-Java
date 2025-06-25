class Gerente extends Funcionario{
    // ATRIBUTOS
    private String departamento;
    
    //CONSTRUTORES
    Gerente(){
    }

    Gerente(String nome, String cpf, String nascimento, String contratacao, double salario, String departamento){
        super(nome, cpf, nascimento, contratacao, salario);
        this.departamento = departamento;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String funcionario = super.printaTudo();
        String departamento = this.departamento;

        return funcionario+ "\nDepartamento: " +departamento;
    }

    // GETTERS
    public String getDepartamento(){
        return this.departamento;
    }

    // SETTERS
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
