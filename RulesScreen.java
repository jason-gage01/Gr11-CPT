import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * The rules screen is entered after the user hits r in the Welcome Screen. Here the user can view all the rules of Frogger. To return to start menu (welcome screen) the user presses s
 */
public class RulesScreen extends World
{

    /**
     * Constructor for objects of class RulesScreen.
     * 
     */
    public RulesScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(516, 510, 1); 
    }

    public void act()
    {
        //if the player is in the rules screen then they will need to press s to return to start menu
        if (Greenfoot.isKeyDown("s")) Greenfoot.setWorld(new WelcomeScreen());    
    }    
}
