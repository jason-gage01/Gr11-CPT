import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * The welcome screen, welcomes the player into the game and gives them options to either enter the game by pressing the enter key, or view the game rules by pressing r or view the game controls by pressing i.
 */
public class WelcomeScreen extends World
{

    /**
     * Constructor for objects of class WelcomeScreen.
     * 
     */
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(516, 510, 1); 
        Greenfoot.start();
    }

    public void act()
    {
        //Beginning screen that welcomes player to frogger
        
        //if user presses enter they go into the game
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new MyWorld());
        
        //if user presses r they can view the game rules screen
        if (Greenfoot.isKeyDown("r")) Greenfoot.setWorld(new RulesScreen());
        
        //if user presses i they can view the game controls screen
        if (Greenfoot.isKeyDown("i")) Greenfoot.setWorld(new ControlsScreen());
    }
}
