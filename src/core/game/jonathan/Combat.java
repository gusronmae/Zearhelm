package core.game.jonathan;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Jonathan on 1/14/2016.
 */
public class Combat {

    int currentTurn;
    Scanner keyboard = new Scanner(System.in);
    int action;

    Combat(Enemy enemy) {

        System.out.println("You have entered combat with: " + enemy.getName());
        System.out.println("Checking Speed...");

        if (Player.speed > enemy.getSpeed()) System.out.println("You go first.");
        else System.out.println(enemy.getName() + " goes first.");

        while (true) {

            currentTurn = 1;

            if (Player.speed > enemy.getSpeed()) {
                if (Player.playerClass.equals("Warrior")) {

                    System.out.println("Enter 1 for Bloodthirst, 2 for Rend, or 3 for Execute.");
                    while(true) {
                        action = keyboard.nextInt();
                        if (action == 1) {
                            Player.skillOne(enemy);
                            break;
                        }
                        else if (action == 2) {
                            Player.skillTwo(enemy);
                            break;
                        }
                        else if (action == 3) {
                            Player.skillThree(enemy);
                            break;
                            
                        }

                    }

                }

                else if (Player.playerClass.equals("Mage")) {

                    System.out.println("Enter 1 for Fireball, 2 for Blinding Flare, or 3 for Pyromaniac.");
                    while (true) {
                        action = keyboard.nextInt();
                        if (action == 1) {
                            Player.skillOne(enemy);
                            break;
                        }
                        else if (action == 2) {
                            Player.skillTwo(enemy);
                            break;
                        }
                    }
                }
            }


            currentTurn++;

        }



    }

    public static int randNum(int min, int max) {

        Random rand = null;

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;

    }

}
