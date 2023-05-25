import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for seting the world size and adding the restart button to itself.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (25/05/2023)
 */
public class LooseWorld extends World
{

    /**
     * Constructor for objects of class LooseWorld.
     * 
     */
    public LooseWorld()
    {    
        // Create a new world with 700x600 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        //This line of code adds the restart button to the loose world menu.
        addObject(new RestartButton(),200,450);
        // This adds the Exit button to the "looseworld".
        addObject(new Exit(),500,450);
        
    }
}
