import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a Restart button and allows the player to restart the game.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (25/05/2023)
 */
public class RestartButton extends Actor
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RestartButton()
    {   
        //This sets the restart button size
        getImage().scale(250,100);
    }
    public void act()
    {
        /*This if statment checks if the player left clicks on the restart sprite and sets the the world to MyWorld.*/
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}