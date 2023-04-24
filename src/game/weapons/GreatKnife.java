package game.weapons;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Location;
import edu.monash.fit2099.engine.weapons.WeaponItem;
import game.runes.Rune;

/**
 * A simple weapon that can be used to attack the enemy.
 * It deals 75 damage with 70% hit rate
 * Created by:
 * @author Aditti
 * Modified by:
 *
 */

public class GreatKnife extends WeaponItem implements Purchasable, Sellable {

    /**
     * Constructor.
     */
    public GreatKnife() {
        super("Great Knife", '/', 75, "hit", 70);
    }

    @Override
    public void tick(Location currentLocation, Actor actor) {}

    @Override
    public Rune getPurchasingPrice() {
        return new Rune(3500);
    }

    @Override
    public Rune getSellingPrice() {
        return new Rune(350);
    }
}
