import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1); 
        prepare();
    }
    
    public void act(){
    if(Greenfoot.getRandomNumber(50) < 1) {                        
            addObject(new zombie1(), 1199, 556);
        }
    if(Greenfoot.getRandomNumber(50) < 1) {                        
            addObject(new zombie2(), 1, 556);
        }
    if(Greenfoot.getRandomNumber(30) < 1) {                        
            addObject(new baik(), Greenfoot.getRandomNumber(1200), 1);
        }
    if(Greenfoot.getRandomNumber(50) < 1) {                        
            addObject(new beracun(), Greenfoot.getRandomNumber(1200), 1);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ungke ungke = new ungke();
        addObject(ungke,568,556);
    }
}
