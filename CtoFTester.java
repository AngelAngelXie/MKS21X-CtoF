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

    static void fahrenheitToCelsius(){
        System.out.print("underconstruction");
    }
    
    public static void main(String[] args){
        celsiusToFahrenheit(30.0);
    }

}
