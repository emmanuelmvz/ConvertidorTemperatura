package convertidortemperatura;

/**
 *
 * @author maryse
 *
 * Este programa convierte temperaturas de grados Fahrenheit a grados Celsius
 *
 *
 */
public class ConvertidorTemperatura {
    int PUNTO_CONGELACION;
    int FACTOR_CONVERSION;
    int fahrenheit;
    String calsius;
                 

    public static void main(String[] args) {

        final double PUNTO_CONGELACION = 32.0;
        final double FACTOR_CONVERSION = 5.0 / 9.0;
        double fahrenheit = 50; // temperatura en Fahrenheit
        double celsius; // temperatura en Celsius

        celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELACION);
        System.out.println(fahrenheit + " grados Fahrenheit = "
                + celsius + " grados Celsius.");
    }
}
