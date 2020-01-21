import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie1 extends Actor
{
    private String[] imagezombie1 = {"left1.png" , "left2.png" , "left3.png" , "left4.png", "left5.png" , "left6.png"};
    private int currentImage = 0;
    private GreenfootImage myImage = getImage();
    /**
     * Act - do whatever the zombie1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public zombie1()
    {
       
    }
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()-3, getY());
        jalan1();
        if (isAtEdge())
        {
        getWorld().removeObject(this);
        }   
    }
   private void jalan1(){
       if(currentImage >= imagezombie1.length)
                currentImage=0;
            GreenfootImage newImage = new GreenfootImage(imagezombie1[currentImage]);
            setImage(newImage);
            myImage=getImage();
    } 
}
   
