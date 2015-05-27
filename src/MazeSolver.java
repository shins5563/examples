
import becker.robots.Direction;
import becker.robots.MazeCity;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class MazeSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MazeCity maze = new MazeCity(15, 15);
        RobotSE karel = new RobotSE(maze, 0, 0, Direction.EAST);
        new Thing(maze, 14, 14);
        
        
        
        while(!karel.canPickThing()) {
            karel.turnLeft();
            //move until karel hits a wall
            if(karel.frontIsClear()) {
                
                karel.move();
            
            }else{//if there is a wall
                //face the original direcrion
                karel.turnRight();
                if(karel.frontIsClear()) {//if there isnt a wall
                    karel.move(); //move a space
                }else{
                    karel.turnRight();
                }
            }
        
        }
        
    }
}
