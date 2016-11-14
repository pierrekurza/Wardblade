package entities;
import base.Game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by xeloow on 14/11/16.
 */
public class AlienEntities {
    private ArrayList<Entity> alienEntities;
    private int nbAliens;
    private Game g;

    public ArrayList<Entity> getAlienEntities() {
        return alienEntities;
    }

    public int getNbAliens() {
        return nbAliens;
    }

    public void setNbAliens(int nbAliens) {
        this.nbAliens = nbAliens;
    }

    public void init()
    {
        for (int row=0;row<3;row++) {
            for (int x=0;x<10;x++) {
                Entity alien = new AlienEntity(g,"sprites/alien.gif",100+(x*50),(50)+row*30);
                alien.setStrat(new AlienStrategyStraightMovement(alien));
                alienEntities.add(alien);
            }
        }
    }

    public void setHM()
    {
        for(Entity entity : alienEntities)
            if (entity instanceof AlienEntity)
                entity.setHorizontalMovement(entity.getHorizontalMovement() * 1.02);
    }

    public AlienEntities(int nbAliens, Game g)
    {
        this.nbAliens = nbAliens;
        alienEntities = new ArrayList<>();
        this.g = g;
    }

    public void move(long delta)
    {
        for(Entity e : alienEntities)
        {
            e.move(delta);
        }
    }

    public Entity get(int indice)
    {
        return alienEntities.get(indice);
    }

    public int size()
    {
        return alienEntities.size();
    }

    public void draw(Graphics graphics)
    {
        for(Entity e : alienEntities)
            e.draw(graphics);
    }

    public void removeAll(ArrayList<Entity> entity)
    {
        alienEntities.removeAll(entity);
    }

    public void doLogic()
    {
        for(Entity e : alienEntities)
            e.doLogic();
    }

    public void clear()
    {
        alienEntities.clear();
    }

}
