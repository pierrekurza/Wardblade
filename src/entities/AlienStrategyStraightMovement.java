package entities;
import base.Game;
/**
 * Created by xeloow on 14/11/16.
 */
public class AlienStrategyStraightMovement extends Strategy{

    public AlienStrategyStraightMovement(Entity entity)
    {
        super(entity);
    }

    @Override
    public void move(long delta,Game g)
    {
        if ((entity.dx < 0) && (entity.x < 10)) {
            g.updateLogic();
        }
        if ((entity.dx > 0) && (entity.x > 750)) {
            g.updateLogic();
        }

        entity.x += (delta * entity.dx) / 1000;
        entity.y += (delta * entity.dy) / 1000;
    }
}
