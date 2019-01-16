import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Log moves back and fourth across water, ready to help the frog get across the water
 */
public class Log2 extends Logs
{
    public Log2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/8;
        int myNewWidth = (int) myImage.getWidth()/8;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the Log2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        move(1); // moves at speed of 1
        
        
        if (isAtEdge()){
            turn (180); // if log reaches end of the water it will turn around 180 degrees
        }

    } 
}
