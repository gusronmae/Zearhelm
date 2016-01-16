package core.game.jonathan;

import java.util.Scanner;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class playerClass {

    int answer;
    static String playerClassChoice;
    Scanner keyboard = new Scanner(System.in);

    void playerClass() {
        Delay.pause(1000);
        System.out.println("There are two available classes. You must choose between Warrior or Mage.");
        System.out.println();
        Delay.pause(2000);
        System.out.println("The Warrior class has the following abilities: ");
        Delay.pause(2000);
        System.out.println("Bloodthirst: Smash the target dealing 150% of attack power. Heal for 20% of the damage done.");
        Delay.pause(2000);
        System.out.println("Rend: Deal damage equal to 45% of attack power each turn.");
        Delay.pause(2000);
        System.out.println("Execute: Attempt to execute enemy dealing 300% of attack power as damage." +
                "Only usable on enemies with less than 20% Health.");
        System.out.println();
        Delay.pause(2000);
        System.out.println("The Mage class has the following abilities: ");
        Delay.pause(2000);
        System.out.println("Fireball: Deal 120% of spell power as damage. Generates 1 Combustion.");
        Delay.pause(2000);
        System.out.println("Blinding Flare: Deal 30% of spell power as damage and interrupts the enemy turn." +
                "This ability always goes first. Three turn cooldown.");
        Delay.pause(2000);
        System.out.println("Pyromaniac: Consume all stacks of combustion to deal damage equal to 100% of spell power" +
                "for each stack of Combustion. The enemy also takes damage over the next two turns equal to 20% of the" +
                "damage done.");
        Delay.pause(2000);

        while(true) {

            System.out.println();
            System.out.println("Enter 1 for Warrior or 2 for Mage: ");

            answer = keyboard.nextInt();

            if (answer == 1) {
                Player.setPlayerClass("Warrior");
                break;
            }
            else if (answer == 2) {
                Player.setPlayerClass("Mage");
                break;
            }
            else System.out.println("Invalid selection.");
        }

        System.out.println("You have selected: " + Player.getPlayerClass());


    }

}
