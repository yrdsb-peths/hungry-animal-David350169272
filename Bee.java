import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        // Add your action code here.
        
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("shift"))
        {
            move(-2);
        } else if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("shift"))
        {
            move(2);
        } else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }

        eat();
    }
    
    public void eat()
    {
        if(isTouching(pizza.class))
        {
            removeTouching(pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.creatFood();
            world.increaseScore();
        }
    }
}
