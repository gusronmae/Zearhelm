package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Player {

    static double health = 100;
    static double speed = 45;
    static double attackPower = 30;
    double spellPower = 36;
    static String playerClass;
    
    static void setPlayerClass(String p) {
        playerClass = p;
    }

    static String getPlayerClass() {
        return playerClass;
    }

    void setHealth(double health) {
        this.health = health;
    }

    double getHealth() {
        return health;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    double getSpeed() {
        return speed;
    }

    void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    double getAttackPower() {
        return attackPower;
    }

    void setSpellPower(double spellPower) {
        this.spellPower = spellPower;
    }

    double getSpellPower() {
        return spellPower;
    }

}
