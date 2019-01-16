import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Five frogs shows the user how many frogs they have saved. If the user has saved 5 frogs this actor will be displayed.
 */
public class FiveFrogs extends SafeFrogs
{
    public FiveFrogs()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/3; //shrink image size by 3
        int myNewWidth = (int) myImage.getWidth()/3; //shrink image size by 3
        myImage.scale(myNewWidth, myNewHeight);//display new image size
    }

    /**
     * Act - do whatever the FiveFrogs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // nothing here because the congratulations (beat game) screen is being displayed
    }    
}
