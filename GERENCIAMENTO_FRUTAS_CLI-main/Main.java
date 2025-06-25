import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>();
        
        // MENU 
        while (true){
            try {
                // MENU
                Utilidades.clear();//limpa terminal
                Utilidades.eixoX();//pula linhas (define eixo X do menu)
                System.out.println(Utilidades.eixoY()+ "Escolha uma opção: ");
                System.out.println(Utilidades.eixoY()+ "1. Adicionar uma fruta");
                System.out.println(Utilidades.eixoY()+ "2. Listar todas as frutas");
                System.out.println(Utilidades.eixoY()+ "3. Modificar uma fruta");
                System.out.println(Utilidades.eixoY()+ "4. Remover uma fruta");
                System.out.println(Utilidades.eixoY()+ "5. Sair");
                System.out.print(Utilidades.eixoY()+ "====> ");

                int opcao = input.nextInt();
                input.nextLine(); //limpando buffer


                switch (opcao){
                    case 1:
                        Utilidades.clear();
                        Utilidades.eixoX();
                        System.out.print(Utilidades.eixoY()+ "Digite o nome da fruta para adicionar: ");
                        String novaFruta = input.nextLine();
                        frutas.add(novaFruta);
                        System.out.println(Utilidades.eixoY()+novaFruta+ " foi adicionada.");
                        System.out.println("\n" +Utilidades.eixoY()+"Pressione ENTER para voltar ao MENU");
                        input.nextLine();
                        break;

                    case 2:
                        Utilidades.clear();
                        Utilidades.eixoX();
                        System.out.println(Utilidades.eixoY()+ "Frutas: " +frutas);
                        System.out.println("\n" +Utilidades.eixoY()+ "Pressione ENTER para voltar ao MENU");
                        input.nextLine();
                        break;

                    case 3:
                        Utilidades.clear();
                        Utilidades.eixoX();
                        System.out.print(Utilidades.eixoY()+ "Digite o índice da fruta que deseja modificar: ");
                        int indiceModificar = input.nextInt();
                        input.nextLine(); //limpando buffer
                        if (indiceModificar >= 0 && indiceModificar < frutas.size()){
                            System.out.print(Utilidades.eixoY()+ "Digite o novo nome da fruta: ");
                            String frutaModificada = input.nextLine();
                            frutas.set(indiceModificar, frutaModificada);
                            System.out.println(Utilidades.eixoY()+ "Fruta no índice " +indiceModificar+ " foi modificada para " +frutaModificada);
                        }else{
                            System.out.println(Utilidades.eixoY()+ "índice inválida");
                        }
                        System.out.println("\n" +Utilidades.eixoY()+ "Pressione ENTER para voltar ao MENU");
                        input.nextLine();
                        break;

                    case 4:
                        Utilidades.clear();
                        Utilidades.eixoX();
                        System.out.print(Utilidades.eixoY()+ "Digite o nome da fruta que deseja remover: ");
                        String frutaRemover = input.nextLine();
                        if (frutas.remove(frutaRemover)){
                            System.out.println(Utilidades.eixoY()+ frutaRemover+ " foi removida.");
                        }else{
                            System.out.println(Utilidades.eixoY()+ frutaRemover +" não foi encontrada.");
                        }
                        System.out.println("\n" +Utilidades.eixoY()+ "Pressione ENTER para voltar ao MENU");
                        input.nextLine();
                        break;

                    case 5:
                        System.out.println("Saindo...");
                        input.close();
                        return;

                    // ERRO
                    default:
                        System.out.println("Opcao invalida. Tente novamente");
                }
            // ERRO
            }catch (InputMismatchException e){
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                input.nextLine();
            }
        }
    }
}