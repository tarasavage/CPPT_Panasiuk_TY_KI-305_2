package KI305.Panasiuk.Lab4;

/**
 * The WaterPistol class represents a water-based toy pistol.
 * @author taraspanasiuk
 */
public class WaterPistol extends Pistol {
    private int waterCapacity;

    /**
     * Default constructor for WaterPistol.
     */
    public WaterPistol() {
        super();
        waterCapacity = 0;
    }

    /**
     * Parameterized constructor for WaterPistol.
     *
     * @param name            The name of the water pistol.
     * @param weight          The weight of the water pistol.
     * @param company         The manufacturing company of the water pistol.
     * @param trigger         The trigger type of the water pistol.
     * @param magazine        The magazine associated with the water pistol.
     * @param waterCapacity   The water capacity of the water pistol.
     */
    public WaterPistol(String name, double weight, Company company, Trigger trigger, Magazine magazine, int waterCapacity) {
        super(name, weight, company, trigger, magazine);
        this.waterCapacity = waterCapacity;
    }

    /**
     * Get the water capacity of the water pistol.
     *
     * @return The water capacity of the water pistol.
     */
    public int getWaterCapacity() {
        return waterCapacity;
    }

    /**
     * Set the water capacity of the water pistol.
     *
     * @param waterCapacity The water capacity of the water pistol.
     */
    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    /**
     * Spray water from the water pistol.
     */
    public void sprayWater() {
        if (waterCapacity > 0) {
            System.out.println("Spray! " + getName() + " sprayed water.");
            waterCapacity--;
            logActivity(getName() + " sprayed water.");
        } else {
            System.out.println(getName() + " is out of water.");
            logActivity(getName() + " attempted to spray water but ran out.");
        }
    }

    /**
     * Refill the water pistol with water.
     *
     * @param waterToAdd The amount of water to add.
     */
    public void refillWater(int waterToAdd) {
        if (waterToAdd > 0) {
            waterCapacity += waterToAdd;
            System.out.println("Refilled " + getName() + " with " + waterToAdd + " units of water.");
            logActivity(getName() + " refilled with " + waterToAdd + " units of water.");
        } else {
            System.out.println("Invalid amount of water to refill.");
            logActivity(getName() + " attempted to refill with an invalid amount of water.");
        }
    }

    /**
     * Toggle the safety of the water pistol.
     */
    @Override
    public void toggleSafety() {
        System.out.println("Toggle safety for " + getName() + " water pistol.");
    }

    /**
     * Aim the water pistol at the target.
     */
    @Override
    public void aim() {
        System.out.println("Aim " + getName() + " water pistol at the target.");
    }
}
