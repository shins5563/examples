
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class InputOutput 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String name; //to store someone's name
        System.out.print("Please enter your name: ");
        //sout tab-shortcut
        name = input.nextLine(); //reads the name
        
        //say hello to the user
        System.out.println("Hello " + name);
        System.out.println();
        
        //ln: new line
        
        System.out.println("Please enter a number: ");
        double aNumber = input.nextDouble();
        
        double answer = aNumber + 100;
        System.out.println(aNumber + " + 100 = " + answer);
                
        
        City kw = new City();
        System.out.println("Please ener the street of the robot: ");
        int street =input.nextInt();
        System.out.println("Please ener the avenue of the robot: ");
        int avenue =input.nextInt();
        Robot karel = new Robot(kw, street, avenue, Direction.EAST);
        
               
        
        double num = 234.234;
        num = Math.ceil(num);
        System.out.println(num);
        
                
    }
}
