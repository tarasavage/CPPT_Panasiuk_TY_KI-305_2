package KI305.Panasiuk.Lab7;

/**
 * A class representing a plastic bottle that implements the Item interface.
 * It provides methods to get the volume of the bottle and to print its details.
 * This class also implements the Comparable interface for comparison with other items.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class PlasticBottle implements Item {
    private int volume;

    /**
     * Constructs a plastic bottle with the specified volume.
     *
     * @param volume The volume of the plastic bottle in milliliters.
     */
    public PlasticBottle(int volume) {
        this.volume = volume;
    }

    /**
     * Gets the volume of the plastic bottle.
     *
     * @return The volume of the plastic bottle in milliliters.
     */
    public int getVolume() {
        return volume;
    }

    @Override
    public int getSize() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println("Plastic Bottle, Volume: " + volume + " mL");
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof PlasticBottle) {
            PlasticBottle otherBottle = (PlasticBottle) other;
            return Integer.compare(this.volume, otherBottle.volume);
        }
        return 0;
    }
}
