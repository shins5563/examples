
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class Robottest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                City KW = new City();
                Robot Karel = new Robot(KW, 1,2, Direction.EAST);
                Robot Jeff = new Robot(KW, 1, 4, Direction.WEST);
                Thing Trash = new Thing(KW, 3, 4);
                Wall wall1 = new Wall(KW, 1, 2, Direction.NORTH);
                Wall wall2 = new Wall(KW, 1, 3, Direction.NORTH);
                Wall wall3 = new Wall(KW, 1, 4, Direction.NORTH);
                
                
                
                //label the robots
                Karel.setLabel("K");
                Jeff.setLabel("J");
                
                //make the robot move
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                //Karel.pickThing();
                
                
                Jeff.setColor(Color.yellow);
                Jeff.turnLeft();
                Jeff.move();
                Jeff.move();
                Jeff.pickThing();
                Jeff.move();
                Jeff.putThing();
                Jeff.move();
                     
    }
}
