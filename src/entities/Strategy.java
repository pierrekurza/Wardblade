package entities;

import base.Game;

/**
 * Created by xeloow on 14/11/16.
 */
public abstract class Strategy {

    protected Entity entity;

    public Strategy(Entity e)
    {
        this.entity = e;
    }


    public abstract void move(long delta, Game g);

}
