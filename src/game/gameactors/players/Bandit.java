package game.gameactors.players;

import game.weapons.GreatKnife;


/**

 The Bandit class represents a player of the game who is a bandit.

 It extends the Player class and adds a GreatKnife weapon to the inventory.

 @author aditti, tanul, Satoshi

 @version 2
 */
public class Bandit extends Player{
    /**

     Constructor for the Bandit class.
     It sets the initial hitpoints of the Bandit to 414 and adds a GreatKnife weapon to the inventory.
     */
    public Bandit() {
        super( 414);
        this.addWeaponToInventory(new GreatKnife());
    }


}
