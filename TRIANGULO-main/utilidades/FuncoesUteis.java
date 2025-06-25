package utilidades;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FuncoesUteis{
    // CONSTRUTOR
    FuncoesUteis(){
    }
    
    // MÉTODOS
    // soma
    public static int soma(int a, int b){
        return a+b;
    }

    //triângulo
    public static void triangulo(int altura){

        for(int i=0; i<=altura; i++){
            for(int j=0; j<i; j++){
                System.out.print("X");;
            }
            System.out.println("\n");
        }
    }

    //arquivo
    public static void printArquivo(String name){
    
        if(name.endsWith(".txt") == false){
            name += ".txt";
        }

        try{
            File arquivo = new File(name);
            Scanner reader = new Scanner(arquivo);
            String conteudo;
            while (reader.hasNextLine()){
                conteudo = reader.nextLine();
                System.out.println(conteudo);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Não foi possível ler o arquivo");
            e.printStackTrace();
        }

    }
}