public class Utilidades { 
    public static void clear() { 
        try { 
            if (System.getProperty("os.name").contains("Windows")) { 
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            } else { 
                new ProcessBuilder("clear").inheritIO().start().waitFor(); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

    public static void eixoX(){
        for(int i=0; i<14; i++){
            System.out.println();
        }
    }
    public static String eixoY(){
        return "                                                                     ";
    }
} 