import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Three frogs shows the user how many frogs they have saved. If the user has saved 3 frogs this actor will be displayed.
 */
public class ThreeFrogs extends SafeFrogs
{
    public ThreeFrogs()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/3; //shrink image size by 3
        int myNewWidth = (int) myImage.getWidth()/3; //shrink image size by 3
        myImage.scale(myNewWidth, myNewHeight);//display new image size
    }

    /**
     * Act - do whatever the ThreeFrogs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the user has saved 4 frogs then the three frogs saved sign goes away
        if (Frog.score == 4){
            getWorld().removeObjects(getWorld().getObjects(ThreeFrogs.class));
        }
    }    
}
