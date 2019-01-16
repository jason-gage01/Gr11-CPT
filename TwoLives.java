import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Two Lives shows the user if they have two lives left. If the user has 1 lives the two lives sign will be deleted
 */
public class TwoLives extends Lives
{
    public TwoLives()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/5; //shrink image size by 5
        int myNewWidth = (int) myImage.getWidth()/5;  //shrink image size by 5
        myImage.scale(myNewWidth, myNewHeight); //display new image size
    }

    /**
     * Act - do whatever the TwoLives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the user has less than 2 lives, the 2 hearts sign goes away
        if (Frog.lives < 2){
            getWorld().removeObjects(getWorld().getObjects(TwoLives.class));
        }
    }    
}
