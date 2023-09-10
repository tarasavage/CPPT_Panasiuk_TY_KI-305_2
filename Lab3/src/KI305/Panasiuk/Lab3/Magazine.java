package KI305.Panasiuk.Lab3;

/**
 * The Magazine class represents a firearm magazine that holds rounds.
 * @author taraspanasiuk
 */
public class Magazine {
    private int capacity;
    private int currentRounds;

    /**
     * Default constructor for a Magazine.
     * Sets the default capacity to 10 rounds and initializes currentRounds to 0.
     */
    public Magazine() {
        capacity = 10;
        currentRounds = 0;
    }

    /**
     * Parameterized constructor for a Magazine.
     *
     * @param capacity      The maximum capacity of the magazine.
     * @param currentRounds The current number of rounds in the magazine.
     */
    public Magazine(int capacity, int currentRounds) {
        this.capacity = capacity;
        this.currentRounds = currentRounds;
    }

    /**
     * Get the maximum capacity of the magazine.
     *
     * @return The maximum capacity of the magazine.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Set the maximum capacity of the magazine.
     *
     * @param capacity The maximum capacity of the magazine.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Get the current number of rounds in the magazine.
     *
     * @return The current number of rounds in the magazine.
     */
    public int getCurrentRounds() {
        return currentRounds;
    }

    /**
     * Set the current number of rounds in the magazine.
     *
     * @param currentRounds The current number of rounds in the magazine.
     */
    public void setCurrentRounds(int currentRounds) {
        this.currentRounds = currentRounds;
    }

    /**
     * Load rounds into the magazine.
     *
     * @param rounds The number of rounds to load into the magazine.
     */
    public void loadRounds(int rounds) {
        if (rounds > 0 && rounds <= capacity) {
            currentRounds = rounds;
        } else {
            System.out.println("Invalid number of rounds to load.");
        }
    }

    /**
     * Fire rounds from the magazine.
     *
     * @param rounds The number of rounds to fire from the magazine.
     */
    public void fireRounds(int rounds) {
        if (rounds > 0 && rounds <= currentRounds) {
            currentRounds -= rounds;
            System.out.println("Fired " + rounds + " rounds.");
        } else {
            System.out.println("Not enough rounds to fire.");
        }
    }
}
