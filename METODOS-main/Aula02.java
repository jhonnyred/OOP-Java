public class Aula02{

    //MÉTODO POSITIVO OU NEGATIVO
    public static String posneg(int a){
        String posneg;
        if (a < 0){
            posneg = "Negativo";
        }else{
            posneg = "Positivo";
        }
        return posneg;
    }

    //MÉTODO MÉDIA ARITIMÉTICA
    public static float aritimetica(int a, int b, int c){
        float aritimetica;
        
        aritimetica = (a + b + c)/3;

        return aritimetica;
    }

    //MÉTODO MAIOR ENTRE 3
    public static int maior(int a, int b, int c){
        int maior;

        if(a>b && a>c){
            maior = a;
        }else if(b>a && b>c){
            maior = b;
        }else{
            maior = c;
        }

        return maior;
    }

    //MÉTODO POTENCIAÇÃO
    public static int elevado(int a, int b){
        int elevado;
        elevado = 1; 

        for(int i=0; i<b; i++){
            elevado *= a;
        }

        return elevado;
    }

    //MÉTODO HORAS E MINUTOS
    public static String horasminutos(int a){
        String horasminutos;

        horasminutos = a/60+ " Horas e " +a%60+ " minutos";

        return horasminutos;

    }

    //MÉTODO FATORIAL
    public static long fatorial(int a){
        long fatorial = a;

        for (int i=1; i<=a; i++){
            fatorial *= i;
        }

        return fatorial;
    }   
}