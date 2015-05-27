
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        int countLoops = 0;  
        while(countLoops < 20) {
            new Thing(kw, 1, 3);
            countLoops = countLoops + 1;
            
    }
        //while the robot cannot pick something up
        //!=not
        while(!karel.canPickThing()) {
            karel.move();
        }
        //as long as there is something to pick up
        //pick it up
        int countThings = 0;
        while(karel.canPickThing()) {
            karel.pickThing();
            countThings++;
            System.out.println("I'm here ");
            
        }
        
        System.out.println(" karel picked up " + countThings);
        System.out.println(karel);
        int numberinBack = karel.countThingsInBackpack();
    }
}
