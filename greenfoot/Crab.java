import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    @Override
    public void act()
    {
       if (super.isTouching(Worm.class)){
           //System.out.println("tocando algo");
           super.removeTouching(Worm.class);
           Greenfoot.playSound("slurp.vab");
       }
       if(super.isAtEdge()){
           super.turn(15);
       }
       //int aleatorio= Greenfoot.getRandomNumber(100);
       /*if(aleatorio<10){
           int grados=Greenfoot.getRandomNumber(90);
           super.turn(grados-45);
       }*/
       if(Greenfoot.isKeyDown("right")){
            super.turn(10);
        }
        else if (Greenfoot.isKeyDown("left")){
            super.turn(-10);
        }
       super.move(10);
    }
}


