package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Warrior {

    void bloodthirst(Enemy enemy) {
        // 150% of attack power
        double damage = (Player.attackPower * 1.5);
        System.out.println("You cast Bloodthirst. Dealing " + damage + " damage." );
        enemy.setHealth(-damage);
        System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
    }

}
