package KI305.Panasiuk.Lab4;
/**
 * This class demonstrates the functionality of a WaterPistol object.
 * @author taraspanasiuk
 */
public class WaterPistolDriver {
    /**
     * The main method of the WaterPistolDriver class, which serves as the entry point
     * for demonstrating the functionality of a WaterPistol object.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating a water pistol object
        WaterPistol myWaterPistol = new WaterPistol("Super Soaker", 0.5, new Company(), new Trigger(), new Magazine(), 500);

        // Demonstrating water pistol properties
        System.out.println("Water Pistol Name: " + myWaterPistol.getName());
        System.out.println("Weight: " + myWaterPistol.getWeight() + " kg");
        System.out.println("Water Capacity: " + myWaterPistol.getWaterCapacity() + " ml");

        // Refilling the water pistol
        myWaterPistol.refillWater(250);

        // Spraying water
        System.out.println("\nSpraying Water:");
        myWaterPistol.sprayWater();
        myWaterPistol.sprayWater();
        myWaterPistol.sprayWater();
        myWaterPistol.sprayWater();

        // Checking for water
        boolean hasWater = myWaterPistol.getWaterCapacity() > 0;
        System.out.println("\nWater in the water pistol: " + (hasWater ? "Yes" : "No"));

        // Checking safety status and toggling it
        System.out.println("\nSafety Status:");
        boolean isSafetyOn = myWaterPistol.getTrigger().isSafety();
        System.out.println("Safety is on: " + (isSafetyOn ? "Yes" : "No"));
        myWaterPistol.toggleSafety();
        isSafetyOn = myWaterPistol.getTrigger().isSafety();
        System.out.println("Safety is on: " + (isSafetyOn ? "Yes" : "No"));

        // Checking water pistol status (loaded or not)
        System.out.println("\nWater Pistol Status:");
        boolean isWaterPistolLoaded = myWaterPistol.isLoaded();
        System.out.println("Water pistol is loaded: " + (isWaterPistolLoaded ? "Yes" : "No"));

        // Changing magazine capacity and checking it
        System.out.println("\nChanging Water Capacity:");
        myWaterPistol.setWaterCapacity(750);
        int newWaterCapacity = myWaterPistol.getWaterCapacity();
        System.out.println("Water capacity: " + newWaterCapacity);

        // Reloading the water pistol (in the context of a water pistol, this means refilling water)
        System.out.println("\nReloading the Water Pistol:");
        myWaterPistol.refillWater(500);

        // Aiming
        System.out.println("\nAiming:");
        myWaterPistol.aim();

        // Clearing the water pistol (in the context of a water pistol, this doesn't apply)
        System.out.println("\nClearing the Water Pistol (Not Applicable):");
        System.out.println("Water pistols don't have magazines to clear.");
    }
}
