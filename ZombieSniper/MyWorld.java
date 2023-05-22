import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for adding creating hero life and score counters, 
 * setting the main world size and spawning all the actors necessary for gameplay.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza) 
 * @version (6/12/2022)
 */
public class MyWorld extends World
{
    /*These lines of code use the built in counter to create a new counter for the hero life and score  */
    public static Counter heroLife = new Counter();
    public static Counter heroScore = new Counter();
    //These lines of code create the constants for the screen height and width.
    public static final int SCREEN_WIDTH = 700;
    public static final int SCREEN_HEIGHT = 600;
    
    public Hero mainHero = new Hero();
    /**
     * Constructor for objects of class MyWorld.
     */
    
    public MyWorld()
    {   
        // This Creates a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(SCREEN_WIDTH,SCREEN_HEIGHT, 1); 
        /*These lines of code call the addScore, addLife and addHero function which 
         * adds the counters and the hero to the screen.*/
        
        prepare();
        addScore();
        addLife();
        addHero();
    }
    /*This function sets the hero life value to 10 and adds the counter to the specified x
     * and y coordinates on the screen. */
      private void addLife()
    {
        heroLife.setValue(10);
        addObject(heroLife, 60, 590);
    }
    /*Thia function sets the hero score to 0 and adds the counter to the world to the 
     * specfied x and y coordinates*/
    private void addScore()
    {
        heroScore.setValue(0);
        addObject(heroScore, 650, 590);
    }
    /*This block of code creates a hero object using the Hero class, gets the screen width and divides 
     * it by two to get the x coordinate and then gets the hero width divides it by two and takes it away
       from the screen height to create the y coordinate and finally uses the two variables to add the hero to the screen*/
    private void addHero()
    {
        //Hero hero = new Hero();
        int imageSize = mainHero.getImage().getWidth();
        int x = SCREEN_WIDTH/2;
        int y = (SCREEN_HEIGHT - imageSize/2);
        addObject(mainHero, x, y);
    }
    /*This function gets a random number between 1 and 60 to avoid adding too many enemys to the screen and
     * adds the enemy to the screen using the addEnemy function*/
    public void act()
    {
        if (Greenfoot.getRandomNumber(20)<1)
        {
            addZombie();
        }
    }
   /*This function gets a random number between 0 - 480 and adds the enemy to a random x position when called*/
    public void addZombie()
    {
         addObject(new Zombie(mainHero), Greenfoot.getRandomNumber(680),0);
    }
    
    private void prepare()
    {

        Music music = new Music();
        addObject(music,58,34);
    }
}
