
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of things: ");
        int numberOfThings = input.nextInt();
        
        int[] nums = new int[numberOfThings];
        
        //set them 0
        for(int i = 0; i < nums.length ; i++)
        {
            nums[i] = 0;
        }
        
        for(int i = 0; i < nums.length ; i++)
        {
            System.out.println("Please enter a value for number " + (i+1));
            nums[i] = input.nextInt();
        }
        
       
        int total = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total = total + nums[i];
        }
        System.out.println("The sum of the numbers is " + total);
        int average = total/nums.length;
        System.out.println("the average of the numbers is " + average);
        
        
        int biggest = nums[0];
        for(int i = 0; i < nums.length ; i++)
        {
            if(biggest < nums[i])
            {
                biggest = nums[i];
            }
        }
        System.out.println("The mazimum number is " + biggest);
        
        
        for(int i = 0; i < nums.length ; i++)
        {
            System.out.println(nums[i]);
        }
        
        int[] nummm = {1,2,3,4,5};
        
    }
}
