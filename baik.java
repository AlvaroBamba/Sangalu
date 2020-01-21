import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baik extends Actor
{
    /**
     * Act - do whatever the baik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+10); 
        if (isAtEdge()){
       getWorld().removeObject(this);}
      
    }    
}
