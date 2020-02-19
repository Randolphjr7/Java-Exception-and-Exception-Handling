

package quadratictester;

/**
 *
 * @author rando
 */
public class Quadratic {
    
    // instance variables
    private double a, b, c, discriminant, root1, root2;
    private String message = "Coefficient of x square is zero, hence no quadratic";
    private String s;
   

    // Quadratic Object that takes in an array of doubles
    public Quadratic(double input[]) {
        s = "";
        a = input[0];
        b = input[1];
        c = input[2];
    }
    
    boolean isZero() {
        try {
            if(a == 0.0)
                throw new QuadraticException(message);
            return false;
        } 
        catch (QuadraticException e) {
            s = s + e.toString();
            return true;
        }
    }
    
    void calculateDiscriminant() {
        discriminant = Math.pow(b, 2) - 4 * a * c;
        try {
            if(discriminant < 0)
                throw new QuadraticException("No real root",a,b,discriminant);
            calculateDoubleRoot();
            s = s + "Root 1 = " + root1 + "\tRoot 2 = " + root2;
        }
        catch(QuadraticException e) {
            s = s + e.toString() + ": " + e.imaginaryRoots();
        }
    }
    
    void calculateSingleRoot() {
        s = s + (-b / (2*a));
    }
    
    void calculateDoubleRoot() {
        root1 = (-b + Math.sqrt(discriminant)) / (2*a);
        root2 = (-b - Math.sqrt(discriminant)) / (2*a);
    }
    
    boolean singleRoot() {
        return discriminant == 0;
    }
    
    String getResult() {
        return s;
    }
}
