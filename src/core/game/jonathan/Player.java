package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Player {

    static double health = 100;
    static double speed = 45;
    static double attackPower = 30;
    static double spellPower = 36;
    static String playerClass;
    static boolean isRendActive;
    static boolean isBlindingFlareActive = false;
    
    static void setPlayerClass(String p) {
        playerClass = p;
    }

    static String getPlayerClass() {
        return playerClass;
    }

    static void setHealth(double h) {
        health += h;
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

    static void skillOne(Enemy enemy) {
        if (playerClass.equals("Warrior")) {
            // Bloodthirst - 150% of attack power
            double damage = (attackPower * 1.5);
            System.out.println("You cast Bloodthirst, Dealing " + damage + " damage." );
            enemy.setHealth(-damage);
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
        }
        else if (playerClass.equals("Mage")) {
            // Fireball - 120% of spell power
            double damage = (spellPower * 1.2);
            System.out.println("You cast Fireball, dealing " + damage + " damage.");
            enemy.setHealth(-damage);
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
        }
    }

    static void skillTwo(Enemy enemy) {
        if (playerClass.equals("Warrior")) {
            // Rend 45% attack power per turn
            double damage = (attackPower * 0.45);

            if (isRendActive) {
                enemy.setHealth(-damage);
                System.out.println("Your Rend deals " + damage + " damage.");
                System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
            }
        }
        else if (playerClass.equals("Mage")) {
            // Blinding flare - 30% spell power and interrupt enemy turn
            int cooldown = 3;
            double damage = (spellPower * 0.3);
            isBlindingFlareActive = true;
            System.out.println("You cast Blinding Flare, dealing " + damage + " damage.");
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
        }
    }

    static void skillThree(Enemy enemy) {

    }

}
