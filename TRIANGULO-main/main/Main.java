package main;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args){
        //Soma
        System.out.println(FuncoesUteis.soma(5,6));

        //Triângulo
        FuncoesUteis.triangulo(10);

        //Arquivo
        FuncoesUteis.printArquivo("teste");
    }
}
