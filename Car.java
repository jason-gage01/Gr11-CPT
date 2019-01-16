import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Car moves back and fourth across the road, this acts as an obstacles for the frog to avoid, as if the frog hits the car the frog loses a life.
 */
public class Car extends Vehicles
{
    public Car()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5;
        int myNewWidth = (int) myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();

        setLocation(x,y);

        move(3); //move at speed of 3

        if (isAtEdge()){
            turn(180); // if car reaches the end of the road then turn around 180 degrees
        }    
    }
}
