import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * If the player saves 5 frogs in the game, the congratulations (beatgame) screen will pop up because they have beat the game. User can return to start menu by pressing s.
 */
public class BeatGame extends World
{

    /**
     * Constructor for objects of class BeatGame.
     * 
     */
    public BeatGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(516, 510, 1); 
    }

    public void act()
    {
        //player is in the beat game screen and if they press s they will return to start menu
        if (Greenfoot.isKeyDown("s")) Greenfoot.setWorld(new WelcomeScreen());
    }
}
