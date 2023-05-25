import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for seting the world size and adding the back button to 
 * the tutorial page.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (25/05/2023)
 */
public class Tutorial extends World
{
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 700x600 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        
        // This adds the Back button to the "Tutorial Page".
        addObject(new BackButton(),600, 540);
    }
}
