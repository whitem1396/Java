/*
Creating 3 different displays using the same example and calling them 
01/28/2020
Matthew White
 */

package classwork_01_whitematthew;

import java.util.Scanner;  // Needed for the Scanner class
import javax.swing.JOptionPane;
/*
*/

public class Classwork_01_WhiteMatthew 
{
    public static void main(String[] args) 
    {
       displayPseudocode();
       displayScanner();
       displayJOptionPane();
    }
    
        public static void displayPseudocode () {
            
            System.out.println("I'm creating the display scanner function.");
            System.out.println("You are going to input your age.");
            System.out.println("Next you are going to input your annual income.");
            System.out.println("Then you are going to type just your first name.");
            System.out.println("The computer isthen going to output all of the "
                    + "results you entered.");
            System.out.println("");
            System.out.println("I'm creating the JOptionPane function.");
            System.out.println("You are going to type just your first name.");
            System.out.println("You are going to input your age.");
            System.out.println("You are going to input your annual income.");
            System.out.println("The computer is going to output all of the results"
                    + " you entered.");
            System.out.println("");
            
        }
        
        public static void displayScanner () {
        String name; // To hold the user's name
        int age;     // To hold the user's age
        double income; // To hold the user's income
        
        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System. in);
        
        // Get the users age.
        System.out.print("What is your age? ");
        // Turning age into a integer
        age = keyboard.nextInt();
        
        // Get the user's income.
        System.out.print("What is your annual income? ");
        // Turning income into a double
        income = keyboard.nextDouble();
        
        // Consume the remaining new line.
        keyboard.nextLine();
        
        // Get the user's name.
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        
        // Display the information back to the user.
        System.out.println("Hello, " + name + ". Your age is " +
                            age + " and your income is $" + income);
        }
        
        public static void displayJOptionPane () {
            
            String inputString;
            String name; // the users name
            int age; // the users age
            double income;
            
            name = 
                    JOptionPane.showInputDialog("What is your name. ");
            
            // Get the user's age
            inputString = 
                    JOptionPane.showInputDialog("What is your age? ");
            
            // Convert Age to an integer
            age = Integer.parseInt(inputString);
            
            // Get the User's income
            inputString =
                    JOptionPane.showInputDialog("What is your Annual income? ");
            
            // Convert the input to a double
            income = Double.parseDouble(inputString);
            
            // Display the results.
            JOptionPane.showMessageDialog(null, "Hello " +
                                           name + " your age is "+ age
                                           + " your income is $" + income);
            
            
            
            
        }
        // TODO code application logic here
    }

    

