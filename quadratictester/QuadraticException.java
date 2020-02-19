
package quadratictester;

/**
 *
 * @author rando
 */
public class QuadraticException extends Throwable {
    
    private double a, b, discriminant;

    // constructor or object of the class QuadraticException
    QuadraticException(String message) {
        super(message);
    }

    // constructor or object of the class QuadraticException
    public QuadraticException(String message, double a, double b, double d) {
        this(message);
        this.a = a; // Co-efficient of x square
        this.b = b; // Co-efficient of x
        discriminant = d;
    }
    
    public String imaginaryRoots() {
        double x1 = (-b + Math.sqrt(-discriminant)) / (2*a);
        double x2 = (-b + Math.sqrt(-discriminant)) / (2*a);
        
        return "Imaginary roots: " + x1 + "i" + " and " + x2 + "i";
    }
    
    
    
}
