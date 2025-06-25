public class Main{
    public static void main(String[] args){
        FuncionarioAssalariado f1 = new FuncionarioAssalariado();
        FuncionarioHorista f2 = new FuncionarioHorista(7000);
        
        f1.calcularBonus();
        f2.calcularBonus();
    }
}