import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Four frogs shows the user how many frogs they have saved. If the user has saved 4 frogs this actor will be displayed.
 */
public class FourFrogs extends SafeFrogs
{
    public FourFrogs()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/3; //shrink image size by 3
        int myNewWidth = (int) myImage.getWidth()/3; //shrink image size by 3
        myImage.scale(myNewWidth, myNewHeight);//display new image size
    }

    /**
     * Act - do whatever the FourFrogs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if the user has saved 5 frog then the four frogs saved sign goes away
        if (Frog.score == 5){
            getWorld().removeObjects(getWorld().getObjects(FourFrogs.class));
        }
    }    
}
