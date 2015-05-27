
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shins5563
 */
public class CountedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        
//        int count = 4;
//        
//        while(count > 0)
//        {
//            karel.move();
//            karel.move();
//            karel.turnLeft();
//            karel.turnLeft();
//            karel.turnLeft();
//            count --;
//        }
        
        //for loop
//        for(int i = 0; i < 4; i++) 
//        {
//            karel.move();
//            karel.move();
//            karel.turnLeft();
//            karel.turnLeft();
//            karel.turnLeft();
//            
//        }
        
        for(int street = 1; street < 5; street++)
        {
            for(int ave = 0; ave < 4; ave++)
            {
                karel.move();
            }
            //remainder is zero? if street number is even
            //% modulo(remainder when behind)
            if(street % 2 == 0)
            {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }else
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        
        }
    }
}
//double ans = Math.pow(2,3)
//2^3


//ans = Math.round(ans)
//Math.sqrt(ans)

//+=9
//-=8
// or ||
//and &&
