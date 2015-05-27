
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        
        //to sound like Elmur Fudd
        //We change r, l to w
        
        String unchanged = word;
        
        word = word.replaceFirst("r", "w");
        word = word.replaceAll("R", "W");
        word = word.replaceAll("l", "w");
        word = word.replaceAll("L", "W");
        
        String robberWord = "";
        for(int i = 0; i < unchanged.length(); i++)
        {
            if(unchanged.charAt(i) == 'a')
            {
                robberWord = robberWord + 'a';
            }else if(unchanged.charAt(i) == 'e')
            {
                robberWord = robberWord + 'e';
            }else if(unchanged.charAt(i) == 'i')
            {
                robberWord = robberWord + 'i';
            }else if(unchanged.charAt(i) == 'o')
            {
                robberWord = robberWord + 'o';
            }else if(unchanged.charAt(i) == 'u')
            {
                robberWord = robberWord + 'u';
            }else if(unchanged.charAt(i) == 'y')
            {
                robberWord = robberWord + 'y';
            }else if(unchanged.charAt(i) == ' ')
            {
                robberWord = robberWord + " ";
            }else
            {
                char letter = unchanged.charAt(i);
                robberWord = robberWord + letter + 'o' + letter;
            }
        }
        
        
        //Lamont's Language
        //break off anything before the l and 
        
        String Lamont = "";
        
        //start with l, dont touch  it
        if(unchanged.startsWith("l"))
        {
            Lamont = unchanged;
        }else if(!unchanged.contains("l")) 
        {
            Lamont = "la" + unchanged;
        }else
        {
            //find l
            int place = unchanged.indexOf("l");
            String after = unchanged.substring(place);
            String before = unchanged.substring(0, place);
            Lamont = after + before;
        }
        
        
        System.out.println("Elmur says " + word);
        System.out.println("Robbers say " + robberWord);
        
        
        
    }
}
