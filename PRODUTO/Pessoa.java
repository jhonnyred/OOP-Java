public class Pessoa{
    //Atributos
    private String complete_name;
    private String email;
    private String data;
    private int idade;
    private double altura;
    
    //sobrecarga caso entrada nula
    public Pessoa(){
    }

    //Método Consturtor
    public Pessoa(String nome, String aniversario, int idade, double altura){
        this.complete_name = nome;
        this.idade = idade;
        this.altura = altura;
        this.data = aniversario;
        this.email = emailPesoal();
    }
    
    private String emailPesoal(){
        String emailPessoal;

        //Criando email
        String nomes[] = this.complete_name.split(" ");
        emailPessoal = nomes[0].toLowerCase() + "." + nomes[nomes.length - 1].toLowerCase() + "@email.com";

        return emailPessoal;
    }

    // GETTERS
    // Getter complete_name
    public String getComplete_name(){
        return complete_name;
    }
    
    // Getter email
    public String getEmail(){
        return email;
    }

    // Getter data
    public String getData(){
        return data;
    }

    // Getter idade
    public int getIdade(){
        return idade;
    }

    // Getter altura
    public double getAltura(){
        return altura;
    }

    // SETTERS
    // Setter compelte_name
    public void setComplete_name(String name){
        this.complete_name = name;
    }

    // Setter compelte_name
    public void setEmail(String email){
        this.email = email;
    }

    // Setter compelte_name
    public void setData(String data){
        this.data = data;
    }

    // Setter idade
    public void setIdade(int idade){
        this.idade = idade;
    }

    // Setter altura
    public void setAltura(double altura){
        this.altura = altura;
    }
}
