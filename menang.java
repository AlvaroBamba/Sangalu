import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menang extends World
{

    /**
     * Constructor for objects of class menang.
     * 
     */
    public menang()
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
        home home = new home();
        addObject(home,1045,532);
    }
}
