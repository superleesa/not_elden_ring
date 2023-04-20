package game.gameactors.enemies;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actions.DoNothingAction;
import edu.monash.fit2099.engine.displays.Display;
import edu.monash.fit2099.engine.positions.GameMap;
import game.actions.DespawnAction;
import game.gameactors.EnemyType;
import game.gameactors.StatusActor;
import game.utils.RandomNumberGenerator;

public abstract class Skeleton extends Enemy{

    /**
     * Constructor.
     *
     * @param name        the name of the Actor
     * @param displayChar the character that will represent the Actor in the display
     * @param hitPoints   the Actor's starting hit points
     */
    public Skeleton(String name, char displayChar, int hitPoints) {
        super(name, displayChar, hitPoints);
        addCapability(EnemyType.SKELETON_TYPE);
    }

    public Action playTurn(ActionList actions, Action lastAction, GameMap gameMap, Display display){
        if (!this.hasCapability(StatusActor.FOLLOWING) && RandomNumberGenerator.getBooleanProbability(10)){
            return new DespawnAction();
        }

        return new DoNothingAction();
    }

    // add PileOfBones
}
