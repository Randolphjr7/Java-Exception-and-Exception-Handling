
package quadratictester;

/**
 * Exception and Exception Handling
 * @author rando
 */
public class QuadraticTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declaring and initalizing 
        final double arr[][] = {{1,0,-9},{1,0,9},{2,-8,8},{0,4,12},{1,-1,-6}};
        
        for(int i = 0; i < arr.length; i++){
            String s = "a = " + arr[i][0] + " b = " + arr[i][1] + " c = " + arr[i][2] + "\n";
            // Quadratic object
            Quadratic q = new Quadratic(arr[i]);
            
            if(!q.isZero()){
                q.calculateDiscriminant();
                if(q.singleRoot())
                    q.calculateSingleRoot();
                else
                    q.calculateDoubleRoot();
            }
            System.out.println(s + q.getResult() + "\n");
        }
        
    }
    
}
