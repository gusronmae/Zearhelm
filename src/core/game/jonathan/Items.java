package core.game.jonathan;

/**
 * Created by Jonathan on 1/16/2016.
 */
public class Items {

    static void potion() {

        // restores 40% of health
        Player.setHealth((Player.health * 0.4));

    }

    static void EpicChest() {

        Player.attackPower += 2;
        Player.setHealth(25);
        Player.speed += 5;

    }

}
