import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,240,244);
        Crab crab2 = new Crab();
        addObject(crab2,465,237);
        Worm worm = new Worm();
        addObject(worm,194,322);
        Worm worm2 = new Worm();
        addObject(worm2,336,358);
    }
}