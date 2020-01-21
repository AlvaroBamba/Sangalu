import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ujang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ungke extends Actor
{
    boolean canFire = true;
    private String[] imageKena = {"terkena.png" , "ujang.png"};
    private String[] imageKiri = {"kiri 1.png" , "kiri 2.png" , "kiri 3.png","kiri 4.png","kiri 5.png","kiri 6.png" , "kiri 7.png"};
    private String[] imageKanan= {"kanan 1.png", "kanan 2.png","kanan 3.png", "kanan 4.png" , "kanan 5.png" , "kanan 6.png" , "kanan 7.png"};
    private int currentImage = 0;
    private int currentImages = 0;
    private GreenfootImage ujang =new GreenfootImage ("ujang.png");
    private GreenfootImage tembak =new GreenfootImage ("tembak.png");
    private GreenfootImage tembak2 =new GreenfootImage ("tembak2.png");
    private GreenfootImage myImage = getImage();
    int nyawa = 5;
    int point = 0;
    
    /**
     * Act - do whatever the ujang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        hit();
        nyawa();
        makan();
        tampil(); 
        tembak1();
        tembak2();
        gigit();
        gigit2();
        pindahlevel();

        if(Greenfoot.isKeyDown("down")){
            setImage(ujang);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-10, getY());
            currentImage++;
            if(currentImage >= imageKiri.length)
                currentImage=0;
            GreenfootImage newImage = new GreenfootImage(imageKiri[currentImage]);
            setImage(newImage);
            myImage=getImage();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+10, getY());
            currentImage++;
            if(currentImage >= imageKiri.length)
                currentImage=0;
            GreenfootImage newImage = new GreenfootImage(imageKanan[currentImage]);
            setImage(newImage);
            myImage=getImage();

        }       
}

private void tembak1()
{
    if(Greenfoot.isKeyDown("A") && canFire == true)
        {
            setImage(tembak2);
            getWorld().addObject(new peluru(), getX()-60, getY());
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("A"))
        {
            canFire = true;
        }
}

private void tembak2()
{
    if(Greenfoot.isKeyDown("D") && canFire == true)
        {
            setImage(tembak);
            getWorld().addObject(new peluru2(), getX()+60, getY());
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("D"))
        {
            canFire = true;
        }
}

    public void makan(){
        if(isTouching(baik.class)){
            Greenfoot.playSound("makan.wav");
            removeTouching(baik.class);
            point = point + 5;
        }
    }
    
    

    public void tampil(){
        getWorld().showText("Lives = "+ nyawa, 100, 50);
        getWorld().showText("Score = "+ point, 500, 50);
    }

    public void nyawa(){
        if(isTouching(beracun.class)){
            Greenfoot.playSound("kena.wav");
            removeTouching(beracun.class);
            nyawa = nyawa - 1;       
            if(nyawa < 1){
                endGame();
                Greenfoot.playSound("kalah.wav");
                Greenfoot.setWorld(new Kalah());
            }
        
        }
    }
    public void gigit(){
         if(isTouching(zombie1.class)){
         Greenfoot.playSound("kena.wav");
         removeTouching(zombie1.class);
         nyawa = nyawa - 2;
        }
        if(nyawa < 1)
        {
           endGame();
           Greenfoot.playSound("kalah.wav");
           Greenfoot.setWorld(new Kalah());
        }
    }
    
    public void gigit2(){
         if(isTouching(zombie2.class)){
         Greenfoot.playSound("kena.wav");
         removeTouching(zombie2.class);
         nyawa = nyawa - 2;
        }
        if(nyawa < 1)
        {
           endGame();
           Greenfoot.playSound("kalah.wav");
           Greenfoot.setWorld(new Kalah());

        }
    }

    public void hit(){
        if(isTouching(beracun.class)){
            if(currentImages >= imageKena.length)
                currentImages=0;
            GreenfootImage newImages = new GreenfootImage(imageKena[currentImages]);
            setImage(newImages);
            myImage=getImage();}
    }

    private void endGame(){
        Greenfoot.stop();
    }
    public void pindahlevel()
    {
        if(point == 50&&getWorld() instanceof MyWorld)
        {
          pintu muncul = new pintu();
          World myWorld = getWorld();
          myWorld.addObject(muncul, 100,567);
          myWorld.removeObject(new pintu());
        }
        else if(point == 100&&getWorld() instanceof level2)
        {
          pintu2 muncul = new pintu2();
          World myWorld = getWorld();
          myWorld.addObject(muncul, 100,567);
          myWorld.removeObject(new pintu2());
        }
        else if(point == 150&&getWorld() instanceof level3)
        {
          pintu3 muncul = new pintu3();
          World myWorld = getWorld();
          myWorld.addObject(muncul, 100,567);
          myWorld.removeObject(new pintu3());
        }
    }
}
