public class Main{    
    public static void main(String[] args){

        //SAÍDA PESSOA
        Pessoa p1 = new Pessoa("Alberto Souza Lima", "10/11/1997", 26, 1.76);
        Pessoa p2 = new Pessoa("Isabela Alves Carvalho", "10/07/2005",19, 1.57);
    
        System.out.println("\n\nNome: " +p1.complete_name+ "\nIdade: " +p1.idade+ "\nAltura: " +p1.altura+ "\nData de nascimento: " +p1.data+ "\nemail: " +p1.email);
        System.out.println("\n\nNome: " +p2.complete_name+ "\nIdade: " +p2.idade+ "\nAltura: " +p2.altura+ "\nData de nascimento: " +p2.data+ "\nemail: " +p2.email);
        

        //SAÍDA PRODUTO
        System.out.println("\n\n\n");
        Produto prod1 = new Produto("Refri","Coca-Cola",3,8);
        Produto prod2 = new Produto("Escova dental","Colgate",3, 15);
        Produto prod3 = new Produto("Papel Higiênico","Neve",10,45.76);
    
        System.out.println("Nome: " +prod1.nome+ "\nMarca: " +prod1.marca+ "\nCusto: " +prod1.custo+ "\nPreço de venda: " +prod1.venda+ "\nLucro: " +prod1.calculador() +"\n\n");
        System.out.println("Nome: " +prod2.nome+ "\nMarca: " +prod2.marca+ "\nCusto: " +prod2.custo+ "\nPreço de venda: " +prod2.venda+ "\nLucro: " +prod2.calculador() +"\n\n");
        System.out.println("Nome: " +prod3.nome+ "\nMarca: " +prod3.marca+ "\nCusto: " +prod3.custo+ "\nPreço de venda: " +prod3.venda+ "\nLucro: " +prod3.calculador());
    }
}

