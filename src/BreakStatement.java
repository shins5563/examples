
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class BreakStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);
        
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Wall(kw, 1, 4, Direction.EAST);
        
        
//        while(true) 
//        {
//            karel.pickThing();
//            if(karel.frontIsClear())
//            {
//                karel.move();
//            }else
//            {
//                break;
//            }
//        }
        
        
        
        while(true) 
        {
            karel.pickThing();
            if(karel.frontIsClear())
            {
                karel.move();
            }else
            {
                break;
            }
        }
        
//        do
//        {
//            karel.pickThing();
//            if(karel.frontIsClear())
//            {
//                karel.move();
//            }else
//            {
//                break;
//            }
//        }while(true);
//        
        
       
        
        
        
    }
}
