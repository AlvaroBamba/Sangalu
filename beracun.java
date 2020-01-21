import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beracun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beracun extends Actor
{
    /**
     * Act - do whatever the beracun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+Greenfoot.getRandomNumber(20)); 
   if (isAtEdge()){
       getWorld().removeObject(this);}
}
}
