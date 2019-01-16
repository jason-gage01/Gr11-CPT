import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jason Gage
 * ICS3U1b
 * Frogger CPT
 * Monday June 11 2018
 * Here is where the frogger game screen and all objects get placed into the game in their appropriate coordinates. 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(516, 510, 1); 
        prepare();

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Adding all the objects into their positions on the screen
        
        //fish
        Fish fish = new Fish();
        addObject(fish,25,160);
        
        //second fish
        Fish fish2 = new Fish();
        addObject(fish2,25,78);
        
        //log
        Log log = new Log();
        addObject(log,50,230);
        
        //second log
        Log2 log22 = new Log2();
        addObject(log22,100,122);
        
        //third log
        Log log3 = new Log();
        addObject(log3,510,198);
        
        //frog
        Frog frog = new Frog();
        addObject(frog,260,485);
        
        //second frog
        Frog2 frog2 = new Frog2();
        addObject(frog2,260,485);
        
        //third frog
        Frog3 frog3 = new Frog3();
        addObject(frog3,260,485);
        
        //fourth frog
        Frog4 frog4 = new Frog4();
        addObject(frog4,260,485);
        
        //fifth frog
        Frog5 frog5 = new Frog5();
        addObject(frog5,260,485);
        
        //car
        Car car = new Car();
        addObject(car,510,358);
        
        //second car
        Car2 car2 = new Car2();
        addObject(car2,10,308);
        
        //third car
        Car2 car22 = new Car2();
        addObject(car22,10,402);
        
        //truck
        Truck truck = new Truck();
        addObject(truck,510,445);
        
        //first life
        OneLife onelife = new OneLife();
        addObject(onelife, 470, 486);
        
        //two lives
        TwoLives twolives = new TwoLives();
        addObject(twolives, 470, 486);
        
        //three lives
        ThreeLives threelives = new ThreeLives();
        addObject(threelives, 470, 486);
        
        //five frogs
        FiveFrogs fivefrogs = new FiveFrogs();
        addObject(fivefrogs, 70, 486);
        
        //four frogs
        FourFrogs fourfrogs = new FourFrogs();
        addObject(fourfrogs, 70, 486);
        
        //three frogs
        ThreeFrogs threefrogs = new ThreeFrogs();
        addObject(threefrogs, 70, 486);
        
        //two frogs
        TwoFrogs twofrogs = new TwoFrogs();
        addObject(twofrogs, 70, 486);
        
        //one frog
        OneFrog onefrog = new OneFrog();
        addObject(onefrog, 70, 486);
        
        //zero frogs
        ZeroFrogs zerofrogs = new ZeroFrogs();
        addObject(zerofrogs, 70, 486);
    }
}
