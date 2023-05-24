import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This class is responsible for seting the world size and adding the start button 
 * and Tutorial button to the main menu.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (6/12/2022)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        //This line of code adds the start button to the main menu.
        addObject(new StartButton(),360,310);
        // This adds the Tutorial button to the "Main menu".
        addObject(new TutorialButton(),360,410);
    }
     
}
