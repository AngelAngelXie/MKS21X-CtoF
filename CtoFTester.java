/** What should the functions have as parameters? What type?
 *  - Celcius double
 *  - Fahrenheit double
 *  What should the functions return? 
 *  - [input] is approximately equivalent to [output].
 */ 
 
public class CtoFTester {
    static void celsiusToFahrenheit(double celsius){
        System.out.print(celsius + " C is approximiately equivalent to " + (9.0 / 5.0 * celsius + 32.0) + " F."); 
    }

    static void fahrenheitToCelsius(double fahrenheit){
        System.out.print(fahrenheit + " F is approximately equivalent to " + ((fahrenheit - 32) * 5 / 9) + " C.");
    }
    
    public static void main(String[] args){
        celsiusToFahrenheit(30.0);
        System.out.println("\n");
        fahrenheitToCelsius(100.0);

    }

}
