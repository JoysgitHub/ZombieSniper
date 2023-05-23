import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the the hero, getting the user keyboard 
 * inputs and shooting the enemy.
 * 
 * @author (Joyson Cardoso, Keegan De souza) 
 * @version (6/12/2022)
 */
    public class Hero extends Actor
    {
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hero()
    {
        //This line of code sets the hero sprite size.
        getImage().scale(110,110);
        
    }
    //This line of code creates a timer to space the bullets out.
    SimpleTimer bulletTimer = new SimpleTimer();
    //This creates a variable that is used to space out the hero bullet.
    int bulletSpacer = 900;
    
    public void act()
    {
        
    
        /*This block of code checks if the player presses the space bar and 
         * If these two conditions are met it adds a hero bullet to the screen and plays a sound.  
           */
        checkMouse();
        fireBullet();
    }
    
    public void checkMouse(){        
        if(Greenfoot.getMouseInfo() != null)
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getX());
    }
    
    public void fireBullet(){
        
        if (Greenfoot.isKeyDown("space") && bulletTimer.millisElapsed() > bulletSpacer)
        {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY()); 
            bullet.setRotation(getRotation());
            Greenfoot.playSound("enemyexplode.mp3");
            bulletTimer.mark();
        }
        
    }
}
