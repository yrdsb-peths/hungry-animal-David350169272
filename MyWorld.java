import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int Score = 0;
    Label socreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        socreLabel = new Label(0, 80);
        Bee bee = new Bee();
        addObject(bee, 300, 300);
        addObject(socreLabel, 50, 50);
        creatFood();
        
    }
    
    public void gameOver()
    {
        Label gameOver = new Label("Game Over", 100);
        addObject(gameOver, 300, 200);
    }
    
    public void increaseScore()
    {
        Score++;
        socreLabel.setValue(Score);
    }
    public void creatFood()
    {
        pizza pizza1 = new pizza();
        int random_Maxf = 600;
        int random_Minf = 0;        
        int random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);

        addObject(pizza1, random_intf, 0);
    }

}
