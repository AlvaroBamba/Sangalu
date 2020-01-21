import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie2 extends Actor
{
    /**
     * Act - do whatever the zombie2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+3, getY()); 
        if (isAtEdge())
        {
        getWorld().removeObject(this);
        }
    }    
}
