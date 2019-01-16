import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Fish moves back and fourth across water, ready to help the frog get across the water
 */
public class Fish extends Logs
{
    public Fish()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/10; //shrink image size by 10
        int myNewWidth = (int) myImage.getWidth()/10; //shrink image size by 10
        myImage.scale(myNewWidth, myNewHeight); //display new image size
    }

    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();

        setLocation(x,y);

        move(1); //move at speed of 1

        if (isAtEdge()){
            turn(180); // if fish reaches end of the water it will turn around 180 degrees
        }    
    }
}
