package KI305.Panasiuk.Lab7;

import java.util.Stack;

/**
 * A generic class representing a trash can that can hold items of type T.
 * It provides methods for adding, removing, checking emptiness, getting size, showing contents, clearing, and peeking into the trash can.
 *
 * @param <T> The type of items that the trash can can hold, must implement the Item interface.
 * @author Taras Panasiuk
 * @version 1.0
 */
public class TrashCan<T extends Item> {
    private Stack<T> items;

    /**
     * Constructs an empty trash can.
     */
    public TrashCan() {
        items = new Stack<T>();
    }

    /**
     * Adds an item to the trash can.
     *
     * @param item The item to be added.
     */
    public void add(T item) {
        items.push(item);
    }

    /**
     * Removes and returns the top item from the trash can.
     *
     * @return The top item removed from the trash can, or null if the trash can is empty.
     */
    public T remove() {
        if (!items.isEmpty()) {
            return items.pop();
        }

        return null;
    }

    /**
     * Checks if the trash can is empty.
     *
     * @return true if the trash can is empty, false otherwise.
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Gets the size of the trash can.
     *
     * @return The number of items in the trash can.
     */
    public int size() {
        return items.size();
    }

    /**
     * Displays the contents of the trash can by printing each item.
     */
    public void showContents() {
        for (T item : items) {
            item.print();
        }
    }

    /**
     * Clears all items from the trash can.
     */
    public void clear() {
        items.clear();
    }

    /**
     * Peeks at the top item in the trash can without removing it.
     *
     * @return The top item in the trash can, or null if the trash can is empty.
     */
    public T peek() {
        if (!items.isEmpty()) {
            return items.peek();
        }
        return null;
    }
}
