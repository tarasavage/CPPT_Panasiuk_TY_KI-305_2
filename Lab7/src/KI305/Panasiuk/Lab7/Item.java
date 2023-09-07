package KI305.Panasiuk.Lab7;

/**
 * An interface representing an item that can be placed in a trash can.
 * Implementing classes must provide methods to get the size of the item and to print its details.
 * This interface extends the Comparable interface to allow for comparison between items.
 * @author Taras Panasiuk
 * @version 1.0
 */
public interface Item extends Comparable<Item> {
    /**
     * Gets the size of the item.
     *
     * @return The size of the item.
     */
    public int getSize();

    /**
     * Prints the details of the item.
     */
    public void print();
}
