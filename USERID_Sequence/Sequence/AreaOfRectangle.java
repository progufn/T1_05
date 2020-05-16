import java.util.Scanner;

/**
 * This class calculates the area of a rectangle, after the
 * user has provided the length of the two sides. For example:
 * 
 *     Enter one side: 2
 *     Enter the other side: 3
 *     
 *     one side is 2
 *     other side is 3
 *     area is 6
 *     
 * Note: YOU WILL BE **GIVEN** THIS CLASS IN THE MASTERY TESTS
 *       WHERE YOU WRITE "SEQUENCE" and "THREE NUMBERS".
 *
 * Note: You must have a method called "main". 
 *     
 * @author Raymond Lister
 * @version March 22, 2015 
 */
class AreaOfRectangle
{  
    static int [] side = {0, 0};  
    
    // DO NOT CHANGE ANYTHING ABOVE THIS COMMENT LINE
    // You may change anything you like below this line,
    // as long as it is compatible with all the
    // instructions given above.
    
    public static void main(String [] args) 
    {
        Scanner scanner = new Scanner(System.in);
    
        int area;
    
        System.out.print("Enter one side: ");
        side[0] = scanner.nextInt();
    
        System.out.print("Enter the other side: ");
        side[1] = scanner.nextInt();
    
        area = side[0] * side[1]; 
    
        System.out.println();
        System.out.println("one side is " + side[0]);
        System.out.println("other side is " + side[1]);
        System.out.println("area is " + area);  
        System.out.println();
        
    } // method main
      
    // DO NOT CHANGE ANYTHING BELOW THIS COMMENT LINE
    
    /**
     * This method allows plate to check that the
     * appropriate values are stored in array "side".
     */
    public static int getSide(int subscript)
    {
        return side[subscript];
        
    } // method getSide
  
} // class AreaOfRectangle
