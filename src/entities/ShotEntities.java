package entities;

import base.Game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by xeloow on 14/11/16.
 */
public class ShotEntities {

    private ArrayList<Entity> shotEntities;
    private Game g;

    public ShotEntities(Game g)
    {
        shotEntities = new ArrayList<>();
        this.g = g;
    }

    public void move(long delta)
    {
        for(Entity e : shotEntities)
        {
            e.move(delta);
        }
    }

    public Entity get(int indice)
    {
        return shotEntities.get(indice);
    }

    public int size()
    {
        return shotEntities.size();
    }

    public void draw(Graphics graphics)
    {
        for(Entity e : shotEntities)
            e.draw(graphics);
    }

    public void removeAll(ArrayList<Entity> entity)
    {
        shotEntities.removeAll(entity);
    }

    public void doLogic()
    {
        for(Entity e : shotEntities)
            e.doLogic();
    }

    public void clear()
    {
        shotEntities.clear();
    }

    public void add(Entity e)
    {
        shotEntities.add(e);
    }

    public void collides(AlienEntities e)
    {
        ArrayList<Entity> alienEntities = e.getAlienEntities();

        for (Entity p : alienEntities) {
            for (Entity s : shotEntities) {
                Entity me = p;
                Entity him = s;

                if (me.collidesWith(him)) {
                    me.collidedWith(him);
                    him.collidedWith(me);
                }
            }
        }
    }

}
