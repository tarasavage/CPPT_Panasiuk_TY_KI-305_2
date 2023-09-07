package KI305.Panasiuk.Lab7;

/**
 * A program driver to demonstrate the use of the TrashCan class and placing items in it.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */

public class TrashCanDriver {
    /**
     * The main method of the program.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a TrashCan container for various types of trash
        TrashCan<Item> trashCan = new TrashCan<>();

        // Create objects of the Paper and PlasticBottle classes and add them to the container
        Paper paper1 = new Paper("Contents of the first paper");
        Paper paper2 = new Paper("Contents of the second paper");
        PlasticBottle bottle1 = new PlasticBottle(500);
        PlasticBottle bottle2 = new PlasticBottle(750);

        trashCan.add(paper1);
        trashCan.add(paper2);
        trashCan.add(bottle1);
        trashCan.add(bottle2);

        // Display information about the items in the container
        System.out.println("Contents of the TrashCan container:");
        trashCan.showContents();

        // Check if the container is empty and display its size
        System.out.println("\nThe container is empty: " + trashCan.isEmpty());
        System.out.println("Size of the container: " + trashCan.size());

        // Remove one item from the container
        Item removedItem = trashCan.remove();
        if (removedItem != null) {
            System.out.println("\nRemoved item from the container:");
            removedItem.print();
        } else {
            System.out.println("\nThe container is empty.");
        }

        // Display the size of the container after removal
        System.out.println("Size of the container after removal: " + trashCan.size());

        // Clear the container
        trashCan.clear();
        System.out.println("\nThe container has been cleared.");

        // Display the size of the container after clearing
        System.out.println("Size of the container after clearing: " + trashCan.size());
    }
}
