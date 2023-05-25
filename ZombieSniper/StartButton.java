import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a start button and allows the player to start the game.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (25/05/2023)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public StartButton()
    {   
        //This sets the start button size
        getImage().scale(200,100);
    }
    public void act()
    {
        /*This if statement checks if the player left clicks on the restart sprite and sets the the world to MyWorld.*/
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
