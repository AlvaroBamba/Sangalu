import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pintu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pintu3 extends Actor
{
    /**
     * Act - do whatever the pintu3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(ungke.class)){
            Greenfoot.playSound("menang.wav");
            Greenfoot.setWorld(new menang());
        }
    }    
}
