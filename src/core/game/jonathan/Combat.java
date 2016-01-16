package core.game.jonathan;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Jonathan on 1/14/2016.
 */
public class Combat {

    boolean playerFirstOrNot;
    int currentTurn;
    Scanner keyboard = new Scanner(System.in);


    Combat(Enemy enemy) {

        System.out.println("You have entered combat with: " + enemy.getName());
        System.out.println("Flipping coin...");

        if (randNum(1, 2) == 1) {
            playerFirstOrNot = true;
            System.out.println("You go first...");
        }
        else System.out.println(enemy.getName() + " goes first...");

        while (true) {

            if (playerFirstOrNot) {

            }

        }



    }

    public static int randNum(int min, int max) {

        Random rand = null;

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;

    }

}
