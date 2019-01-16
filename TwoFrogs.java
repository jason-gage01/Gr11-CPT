import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Two frogs shows the user how many frogs they have saved. If the user has saved 2 frogs this actor will be displayed.
 */
public class TwoFrogs extends SafeFrogs
{
    public TwoFrogs()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/3; //shrink image size by 3
        int myNewWidth = (int) myImage.getWidth()/3; //shrink image size by 3
        myImage.scale(myNewWidth, myNewHeight); //display new image size
    }

    /**
     * Act - do whatever the TwoFrogs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the user has saved 3 frogs then the two frogs saved sign goes away
        if (Frog.score == 3){
            getWorld().removeObjects(getWorld().getObjects(TwoFrogs.class));
        }
    }    
}
