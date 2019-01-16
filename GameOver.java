import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * The game over screen, is displayed when the user runs out of lives (dies 3 times). Once in the game over screen the user can hit the space bar to return to start menu.
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(516, 510, 1); 

    }

    public void act()
    {
        //if user dies 3 times game over screen is displayed. Press space bar to leve game over screen and return to start menu
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new WelcomeScreen());
    }
}
