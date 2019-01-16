import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Three Lives shows the user if they have three lives left. If the user has 2 lives the three lives sign will be deleted
 */
public class ThreeLives extends Lives
{
    public ThreeLives()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5;
        int myNewWidth = (int) myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the ThreeLives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the user has less than 3 lives, the 3 hearts sign goes away
        if (Frog.lives < 3){
            getWorld().removeObjects(getWorld().getObjects(ThreeLives.class));
        }
    }    
}
