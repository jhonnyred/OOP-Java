class FuncionarioHorista extends Funcionario implements Bonus{
    // ATRIBUTOS
    double salario;

    // CONTRUTOR
    FuncionarioHorista(double salario){
        this.salario = salario;
    }

    // MÉTODOS
    @Override
    public void calcularBonus(){
        System.out.println("Bonus: R$ " +String.valueOf(this.salario*0.1));
    }
}