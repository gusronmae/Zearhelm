package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Delay {

     static void pause(int d) {
        try {
            Thread.sleep(d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
