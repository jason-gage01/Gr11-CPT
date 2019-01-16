import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Car2 moves back and fourth across the road, this acts as an obstacles for the frog to avoid, as if the frog hits car2 the frog loses a life.
 */
public class Car2 extends Vehicles
{
    public Car2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5; //shrink image by 5
        int myNewWidth = (int) myImage.getWidth()/5; //shrink image by 5
        myImage.scale(myNewWidth, myNewHeight); //display new image size
    }

    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();

        setLocation(x,y);
        
        move(2);//car moves at speed of 2
        
        if (isAtEdge()){
            turn(180);//if it reaches the end of the road it will turn around 180 degrees
        }    
    }    
}
