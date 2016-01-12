package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Game {

    public static void main(String args[]) {

        Story story = new Story();
        playerClass playerClass = new playerClass();
        story.introduction();
        playerClass.playerClass();
    }

}
