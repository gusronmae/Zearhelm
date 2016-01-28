package core.game.jonathan;

/**
 * Created by Jonathan on 1/9/2016.
 */
public class Inventory {

    static Items[] items = new Items[11];

    static void addInventory(Items item) {
        int slot = 0;
        items[slot] = item;
        slot++;
    }

    static void showInventory() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    static void clearInventory() {
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

}
