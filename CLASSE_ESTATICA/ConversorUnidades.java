public class ConversorUnidades{
    //MÉTODOS
    //celsius para fahrenheit
    public static String celsiusParaFahrenheit(double celsius){
        return String.valueOf(celsius*(9/5)) + "°F";   
    }

    //Quilômetro para milha
    public static String quilometrosParaMilhas(double quilometros){
        return String.valueOf(quilometros/1.609) +" Milhas";
    }

    //Gramas para Libras
    public static String gramasParaLibras(double gramas){
        return String.valueOf(gramas/453.6) + "lb";
    }
}