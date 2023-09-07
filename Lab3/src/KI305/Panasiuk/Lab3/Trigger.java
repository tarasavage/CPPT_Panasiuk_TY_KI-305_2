package KI305.Panasiuk.Lab3;

/**
 * The Trigger class represents the trigger mechanism of a firearm.
 * @author taraspanasiuk
 */
public class Trigger {
    private String type;
    private boolean safety;

    /**
     * Default constructor for a Trigger.
     * Initializes the trigger type to "Standard" and safety to false.
     */
    public Trigger() {
        type = "Standard";
        safety = false;
    }

    /**
     * Parameterized constructor for a Trigger.
     *
     * @param type   The type of the trigger.
     * @param safety Indicates whether the safety is engaged or not.
     */
    public Trigger(String type, boolean safety) {
        this.type = type;
        this.safety = safety;
    }

    /**
     * Get the type of the trigger.
     *
     * @return The type of the trigger.
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of the trigger.
     *
     * @param type The type of the trigger.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Check if the safety is engaged.
     *
     * @return True if the safety is engaged, false otherwise.
     */
    public boolean isSafety() {
        return safety;
    }

    /**
     * Set the safety status of the trigger.
     *
     * @param safety True to engage the safety, false to disengage.
     */
    public void setSafety(boolean safety) {
        this.safety = safety;
    }
}
