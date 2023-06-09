import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a win world screen that lets the play know that they have won.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (25/05/2023)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     */
    public WinWorld()
    {    
        // Creates a new world with 700x600 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        //This line of code adds the restart button to the Win world menu.
        addObject(new RestartButton(),200,450);
        // This adds the Exit button to the "WinWorld"
        addObject(new Exit(),500,450);
    }
}
