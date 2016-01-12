package core.game.jonathan;

import java.util.Scanner;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class playerName {

    static String playerName;
    static Scanner keyboard;
    static boolean confirm;

    static void setPlayerName() {

        keyboard = new Scanner(System.in);
        confirm = false;

        while(!confirm) {
            System.out.print("Enter your name: ");
            playerName = keyboard.nextLine();

            System.out.println("You entered " + playerName);
            System.out.println("Is that correct? (y/n)");

            if (keyboard.nextLine().toLowerCase().equals("y")) confirm = true;

        }

    }

    static String getPlayerName() {
        return playerName;
    }

}
