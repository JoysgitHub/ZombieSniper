import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the zombie object, setting its speed, 
 * shooting removing life from hero, removing the enemy.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (25/05/2023)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    /*These variables sets the zombie speed and makes them attack the hero*/
    //hero variable
    Hero hero;
    //This constructor sets the zombie size.
    public Zombie(Hero mainHero)
    {   
        hero = mainHero;
        getImage().scale(80,80); 
    }
    //The act function calls the movetowards and check collision functions.
    public void act()
    {   
        moveTowards();
        checkCollision();
    }
    //This function makes the the zombies move to the hero location.
    public void moveTowards(){
        move(5);
        turnTowards(hero.getX(), hero.getY());
    }   
    /*This function checks for collision with the hero object, deducts a life from the hero,
       plays a sound and the zombie object. 
       -This also check if the hero life is 0 and ends the game. */
    public void checkCollision(){
        Hero hero = (Hero)getOneIntersectingObject(Hero.class);
        if (hero != null)
        {
            MyWorld.heroLife.add(-1);
            Greenfoot.playSound("ZombieAttack.mp3");
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
