import java.util.Scanner;

/**
 * This class asks the user to input two doubles, x and y and then
 * calculates a third double z, where z = y * (y/x). For example:
 * 
 * enter the first double: 3
 * enter the second double: 6
 * 
 * the first double was 3.0
 * the second double was 6.0
 * the third double is therefore 12.0
 *     
 * Note: In the Mastery Test, you *must* store all three doubles
 *       x, y and z in an array called "sequence" before outputing the answer.
 *     
 * @author Raymond Lister
 * @version Spring 2015, August 11 
 */
class Sequence {

    static double [] sequence = {0, 0, 0}; 

    // DO NOT CHANGE ANYTHING ABOVE THIS COMMENT LINE
    // You may change anything you like below this line, as long as it is compatible with all the
    // instructions given above. 

    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("enter the first double: ");
        sequence[0] = myObj.nextDouble();
        
        System.out.print("enter the second double: ");
        sequence[1] = myObj.nextDouble();

        //calculate and store sequence[1] * (sequence[1] / sequence[0]);
        sequence[2] = sequence[1] * (sequence[1] / sequence[0]);

        System.out.println();
        System.out.println("the first double was "+sequence[0]);
        System.out.println("the second double was "+sequence[1]);
        System.out.println("the third double is therefore "+sequence[2]);
        System.out.println();
    
    } // method main
     
    // You may change anything you like above this line, as long as it is compatible with all the
    // instructions given above.
    // DO NOT CHANGE ANYTHING BELOW THIS COMMENT LINE

    /**
     * This method allows plate to check that the appropriate values are stored in array "sequence".
     * DO NOT CHANGE THIS METHOD.
     */
    public static double getSequence(int subscript)
    {
        return sequence[subscript];

    } // method getSequence

} // class Sequence
