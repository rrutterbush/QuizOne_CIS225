
/**
 * Quiz 1, CIS 225
 * 
 * @author Rodnie Rutterbush 
 * @version 2.5.2015
 */
public class QuizOne
{
    // instance variables - replace the example below with your own
    private int age;
    private double bookPrice;
    private String lastName;

    /**
     * Constructor for objects of class QuizOne
     */
    public void StartHere(int age, double bookPrice, String lastName){
        // initialise instance variables
        age = 0;
        bookPrice = 0.00;
        lastName = "Unknown";
    }

    /**
     * Sets the variable int age
     *
     */
    public void setAge (int age) {
        if((age < 5) && (age > 105)) {
            throw new IllegalArgumentException("Age must be between 5 and 105.");
        }
    }
    /**
     * Returns the value of int age
     */
    public int getAge (int age) {
       return age;
    }
    /**
     * Sets the variable bookPrice
     * 
     */
    public void setBookPrice() {
        System.out.println ("The book price is" + bookPrice + ".");
       
    }
    /**
     * Returns variable bookPrice
     */
    public double getBookPrice( double bookPrice){
        return bookPrice;
    }
    /**
     * Sets the lastName string value
     * 
     */
    public void setLastName(String lastName){
        System.out.println ("The last name entered is" + lastName + ".");
    }
    /**
     * Calculates the final price of the book
     */
    private int setFinalBookPrice (int bookPrice){
        //
        double taxRate = .06;
        bookPrice = bookPrice * taxRate;
        System.out.println (" The final price of the book is" + bookPrice +".");
    }
}
