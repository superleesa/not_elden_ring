package game.actions;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actions.MoveActorAction;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.positions.Location;
import game.gameactors.StatusActor;
import game.gameactors.allyorinvader.Ally;
import game.gameactors.allyorinvader.Invader;
import game.gameactors.players.*;
import game.utils.RandomNumberGenerator;

import java.nio.file.StandardCopyOption;

public class SummonAction extends Action {

    public void spawnAlly(GameMap map, Location destination){
        Player player;
        int allyType = RandomNumberGenerator.getRandomInt(4);

        switch (allyType) {
            case 0:
                player = new Astrologer();
                map.addActor(new Ally(player), destination);
                break;
            case 1:
                player = new Bandit();
                map.addActor(new Ally(player), destination);
                break;
            case 2:
                player = new Samurai();
                map.addActor(new Ally(player), destination);
                break;
            case 3:
                player = new Wretch();
                map.addActor(new Ally(player), destination);
                break;
        }
    }


    public void spawnInvader(GameMap map, Location destination){
        Player player;
        int enemyType = RandomNumberGenerator.getRandomInt(4);

        switch (enemyType) {
            case 0:
                player = new Astrologer();
                map.addActor(new Ally(player), destination);
                break;
            case 1:
                player = new Bandit();
                map.addActor(new Ally(player), destination);
                break;
            case 2:
                player = new Samurai();
                map.addActor(new Ally(player), destination);
                break;
            case 3:
                player = new Wretch();
                map.addActor(new Ally(player), destination);
                break;
        }
    }
    @Override
    public String execute(Actor actor, GameMap map) {
        String res = "";
        for (Exit exit : map.locationOf(actor).getExits()) {
            Location destination = exit.getDestination();
            // ally if 0 else invader
            if (RandomNumberGenerator.getRandomInt(2) == 0) {
                res = "Ally has been summoned";
                spawnAlly(map, destination);
                return res;
                }
            else {
                res = "Invader has been summoned";
                spawnInvader(map,destination);
                return res;
            }
        }
        return res;
    }

    @Override
    public String menuDescription(Actor actor) {
        return  "Summon guest from another realm";
    }
}
