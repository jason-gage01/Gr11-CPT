import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * The frogs purpose is to make it across the screen, while avoiding a variety of obstacles on the way. The frog is the only piece of the game that is controlled by the user. 
 * The user can move the frog by using the arrow keys on the keyboard. The up key moves the frog up, down key moves the frog down, left key moves frog left and right key moves the frog right. 
 * Every time the key is touched the frog moves 2 pixels in that direction. Once the frog makes it to safety a new frog is called and the safe frog goes away.
 */
public class Frog5 extends Frogs
{
    public Frog5()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int) myImage.getHeight()/4;//shrunk image by 4
        int myNewWidth = (int) myImage.getWidth()/4;//shrunk image by 4
        myImage.scale(myNewWidth, myNewHeight);//display new smaller image

    }

    /**
     * Act - do whatever the Frog5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();

        if (Frog.score == 4){
            
            //MOVEMENT
            //up arrow moves frog up
            if(Greenfoot.isKeyDown("UP"))y-=2;
            
            //down arrow moves frog down
            if(Greenfoot.isKeyDown("DOWN"))y+=2;
            
            //left arrow moves frog left
            if(Greenfoot.isKeyDown("LEFT"))x-=2;
            
            //right arrow moves frog right
            if(Greenfoot.isKeyDown("RIGHT"))x+=2;
            
            
            setLocation(x, y);

            
            //if frog is touching the log it will move the frog to the middle and match the speed so the player doesnt have to hold the left or right keys to stay on the log
            Actor Log = getOneIntersectingObject(Log.class);
            if (getOneObjectAtOffset(0,0, Log.class) instanceof Log && (!Greenfoot.isKeyDown("UP") && !Greenfoot.isKeyDown("DOWN") && !Greenfoot.isKeyDown("LEFT") && !Greenfoot.isKeyDown("RIGHT")) ){
                setLocation(Log.getX(), Log.getY());
            }
            
            //if frog is touching the log it will move the frog to the middle and match the speed so the player doesnt have to hold the left or right keys to stay on the log
            Actor Log2 = getOneIntersectingObject(Log2.class);
            if (getOneObjectAtOffset(0,0, Log2.class) instanceof Log2 && (!Greenfoot.isKeyDown("UP") && !Greenfoot.isKeyDown("DOWN") && !Greenfoot.isKeyDown("LEFT") && !Greenfoot.isKeyDown("RIGHT")) ){
                setLocation(Log2.getX(), Log2.getY());
            }
            
            //if frog is touching the fish it will move the frog to the middle and match the speed so the player doesnt have to hold the left or right keys to stay on the fish
            Actor Fish = getOneIntersectingObject(Fish.class);
            if (getOneObjectAtOffset(0,0, Fish.class) instanceof Fish && (!Greenfoot.isKeyDown("UP") && !Greenfoot.isKeyDown("DOWN") && !Greenfoot.isKeyDown("LEFT") && !Greenfoot.isKeyDown("RIGHT")) ){
                setLocation(Fish.getX(), Fish.getY());
            }    

            
            //LOGS FISH AND CARS
            //if the frog hits a car then it loses a life and starts from beginning again
            if (isTouching(Vehicles.class)){
                Frog.lives = Frog.lives -1;
                Greenfoot.playSound("Lost.wav");
                Greenfoot.delay(30);
                setLocation(260, 485);
            }
            
            //if the frog is in the water and not touching the logs and not touching fish, they lose a life and have to start from begining again
            if ((y < 240 && y > 55) && (!isTouching(Logs.class))){
                Frog.lives = Frog.lives -1;
                Greenfoot.playSound("Lost.wav");
                Greenfoot.delay(30);
                setLocation(260, 485);
            }

            
            
            //GAME OVER
            //When player runs out of lives game over screen will be displayed
            if (Frog.lives == 0){
                Greenfoot.playSound("GG.wav");
                Greenfoot.setWorld(new GameOver());
            }

            
            //LILYPADS AND LAND, coordinates are all connected therefore all land is safe    
            //left lilypad
            //make it here and you save the frog
            if ((y < 50 && y >= 0) && (x < 100 && x > 0)){
                Frog.score = Frog.score + 1;
                Greenfoot.playSound("Nice.wav");
                setLocation(260, 485);
                Greenfoot.delay(50);//pause helps user to realize they have saved the frog and get ready for new frog at bottom of screen
            }
            
            //second from left lilypad
            //make it here and you save the frog
            if ((y < 50 && y > 0) && (x < 200 && x > 100)){
                //addObject(frog,260,485);
                Frog.score = Frog.score + 1;
                Greenfoot.playSound("Nice.wav");
                setLocation(260, 485);
                Greenfoot.delay(50);//pause helps user to realize they have saved the frog and get ready for new frog at bottom of screen
            }
            
            //middle lilypad
            //make it here and you save the frog
            if ((y < 50 && y > 0) && (x < 300 && x > 200)){
                //addObject(frog,260,485);
                Frog.score = Frog.score + 1;
                Greenfoot.playSound("Nice.wav");
                setLocation(260, 485);
                Greenfoot.delay(50);//pause helps user to realize they have saved the frog and get ready for new frog at bottom of screen
            }
            
            //second to the right lilypad
            //make it here and you save the frog
            if ((y < 50 && y > 0) && (x < 400 && x > 300)){
                //addObject(frog,260,485);
                Frog.score = Frog.score + 1;
                Greenfoot.playSound("Nice.wav");
                setLocation(260, 485);
                Greenfoot.delay(50);//pause helps user to realize they have saved the frog and get ready for new frog at bottom of screen
            }
            
            //far right lilypad section
            //make it here and you save the frog
            if ((y < 50 && y > 0) && (x < 500 && x > 400)){
                //addObject(frog,260,485);
                Frog.score = Frog.score + 1;
                Greenfoot.playSound("Nice.wav");
                setLocation(260, 485);
                Greenfoot.delay(50);//pause helps user to realize they have saved the frog and get ready for new frog at bottom of screen
            }
            
            
            // BEAT GAME
            //if players score is 5 rhey win the game, display the congrats screen
            if (Frog.score == 5){
                Greenfoot.setWorld(new BeatGame());
            }
        }
    }    
}
