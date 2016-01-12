package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Player {

    static int health = 100;
    static int speed = 45;
    static int attackPower = 30;
    int spellPower = 36;
    static String playerClass;
    
    static void setPlayerClass(String p) {
        playerClass = p;
    }

    static String getPlayerClass() {
        return playerClass;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getHealth() {
        return health;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    int getAttackPower() {
        return attackPower;
    }

    void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    int getSpellPower() {
        return spellPower;
    }

}
