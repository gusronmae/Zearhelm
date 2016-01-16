package core.game.jonathan;

/**
 * Created by Jonathan on 1/10/2016.
 */
public class Enemy {

    private double health;
    private double speed;
    private double attackPower;
    private double spellPower;
    String name;

    void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setSpellPower(double spellPower) {
        this.spellPower = spellPower;
    }

    public double getSpellPower() {
        return spellPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
