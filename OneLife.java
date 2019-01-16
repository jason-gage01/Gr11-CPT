import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * One Life shows the user if they have one live left. if the user has 0 lives the one life sign will be deleted
 */
public class OneLife extends Lives
{
    public OneLife()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5;
        int myNewWidth = (int) myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the OneLife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the user has 0 lives, the 1 live sign goes away
        if (Frog.lives == 0){
            getWorld().removeObjects(getWorld().getObjects(OneLife.class));
        }
    }    
}
