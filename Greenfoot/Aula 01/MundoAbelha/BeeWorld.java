import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWolrd.
 * 
 * @author Rick  
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,85,95);
        Mosca mosca = new Mosca();
        addObject(mosca,332,268);
        Abelha abelha = new Abelha();
        addObject(abelha,327,89);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,439,265);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,212,266);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,85,265);
        mosca2.setLocation(89,335);
        mosca3.setLocation(134,372);
        mosca.setLocation(135,305);
        mosca3.setLocation(152,368);
        aranha.setLocation(25,27);
        abelha.setLocation(84,142);
        aranha.setLocation(147,91);
        abelha.setLocation(266,151);
    }
}
