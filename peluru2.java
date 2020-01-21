import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru2 extends Actor
{
    /**
     * Act - do whatever the peluru2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+10, getY()); 
        if (isAtEdge())
        {
        getWorld().removeObject(this);
        }
        else if(isTouching(zombie1.class))
        {    
            Greenfoot.playSound("kenazombie.wav");
            removeTouching(zombie1.class);
            getWorld().removeObject(this);
        } 
        else if(isTouching(zombie2.class))
        {    
            Greenfoot.playSound("kenazombie.wav");
            removeTouching(zombie2.class);
            getWorld().removeObject(this);
        }    
}
}
