import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the hero bullet, moving the bullet up the screen, 
 * adding to the hero score by checking for enemy collison and removing the bullet from the screen.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza) 
 * @version (25/05/2023)
 */

public class Bullet extends Actor
{
    //This sets the bullet size
    public Bullet()
    {   
        getImage().scale(25,15);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // This line of code moves the bullet by 10
        move(11);
        //This line of code uses the built in method to check enemy collision.
        Zombie zombie = (Zombie)getOneIntersectingObject(Zombie.class);
        /*This block of code uses an if statment to check for collision with the enemy object.
           If detected it removes the enemy from the world, plays the explosion sound,
           removes the hero bullet and adds 5 to the score. It also uses another if statment to check
           if the hero score is 100 and sets the world to the win screen if the score equals to 100 */
        if (zombie != null)
        {
            getWorld().removeObject(zombie);
            Greenfoot.playSound("ZombieDeath.mp3");
            getWorld().removeObject(this);
            MyWorld.heroScore.add(5);
            if (MyWorld.heroScore.getValue() == 100)
            {
                Greenfoot.setWorld(new WinWorld());
            }
        }  
        //This if statment removes the hero bullet when it gets to 50 on the y axis 
        //and 650 on the x axis.
        else if (getY() < 50)
        {
            getWorld().removeObject(this);
        } 
        else if (getX() > 650)
        {
            getWorld().removeObject(this);
        }
    }
}
