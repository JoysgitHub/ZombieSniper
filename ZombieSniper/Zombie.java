import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the enemy object, setting its speed, 
 * shooting the enemy bullet and removing the enemy   .
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (6/12/2022)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    /*These variables set the enemy speed, create a timer to space out the shooting 
     * and generate a random number between 1-8000 milliseconds. */
    //int enemySpeed = 3;
    int extraTime = 995;
    //int randomBullet = Greenfoot.getRandomNumber(8000);
    Hero hero;
    //This line of code creates a bullet timer object that keeps track of enenmy bullet time.
    
    //SimpleTimer bulletTimer = new SimpleTimer();
    
    public Zombie(Hero mainHero)
    {   
        hero = mainHero;
        //This line sets the enemy sprite size.
        getImage().scale(80,80); 
    }
    
    public void act()
    {   
        /*This line of code moves the enenmy object down the screen by adding the enemySpeed 
        variable to its y coordinate.*/
        //setLocation(getX(),getY() + enemySpeed);
        /*This block of code uses an if statment to check if time elapsed is over 
         * extraTime + randomBullet time to make the enemy shoot randomly and avoid over shooting. 
         * If the time elapsed is over the sum of extraTime + randomBullet it adds the enemy bullet 
           to the screen, plays the enemylaser sound, and generates another random time for the enemy bullet.*/
       
        //This if statment removes the enemy from the world when its y coordinate is over 595.
        
        moveTowards();
        checkCollision();
        
    }
    
    public void moveTowards(){
        move(5);
        turnTowards(hero.getX(), hero.getY());
    
    }   
    
    public void checkCollision(){
        Hero hero = (Hero)getOneIntersectingObject(Hero.class);
        /*This block of code uses an if statment to check if the the hero object
         * interacts with the enemy bullet. If a collision occurs it removes a life from 
         * the hero life counter ,plays the enemyexplode sound and removes the enemy bullet from the world. */
        if (hero != null)
        {
            MyWorld.heroLife.add(-1);
            Greenfoot.playSound("ZombieAttack.mp3");
            /*This block of code uses an if statment to check if the hero life equals to 0,
             * if life equals to 0 it removes the hero object, plays the sound and sets the world to loose menu*/
            if (MyWorld.heroLife.getValue() == 0)
            {
                getWorld().removeObject(hero);
                Greenfoot.playSound("Killed.mp3");
                Greenfoot.setWorld(new LooseWorld());
            }
            getWorld().removeObject(this);
        } 
        
    }

}
