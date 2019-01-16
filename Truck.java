import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Truck moves back and fourth across the road, this acts as an obstacles for the frog to avoid, as if the frog hits the Truck the frog loses a life.
 */
public class Truck extends Vehicles
{
    public Truck()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5;
        int myNewWidth = (int) myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the Truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();

        setLocation(x,y);

        move(1);//truck moves at speed of 1

        if (isAtEdge()){
            turn(180);//if truck reaches end of road it will turn around 180 degrees
        }    
    }    
}
