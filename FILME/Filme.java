class Filme{
    //Atributos
    private String titulo;
    private String duracao;
    private Genero genero;
    

    //Titulo
    //Getter titulo
    public String getTitulo(){
        return titulo;
    }

    //Setter titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    //Duração
    //Getter duracao
    public String getDuracao(){
        return duracao;
    }

    //Setter duracao
    public void setDuracao(int duracao) throws Exception{
        if (duracao <= 0){
            throw new Exception("O filme nao pode ter 0 minutos de duracao");
        }else{
            this.duracao = duracao/60 +" Horas e "+ duracao%60 +" minutos";
        }
    }

    //Gênero
    //Getter genero
    public Genero getGenero(){
        return genero;
    }
    
    //Setter genero
    public void setGenero(Genero genero){
        this.genero = genero;
    }
}

//enum para Gênero
enum Genero{
    ROMANCE, TERROR, COMEDIA;
}