import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kalah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalah extends World
{

    /**
     * Constructor for objects of class Kalah.
     * 
     */
    public Kalah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        replay replay = new replay();
        addObject(replay,134,568);
        home home = new home();
        addObject(home,1014,564);
    }
}
