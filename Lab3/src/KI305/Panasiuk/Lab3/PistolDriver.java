package KI305.Panasiuk.Lab3;

/**
 * This class demonstrates the functionality of a Pistol object.
 * @author taraspanasiuk
 */
public class PistolDriver {
    /**
     * The main method of the PistolDriver class, which serves as the entry point
     * for demonstrating the functionality of a Pistol object.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating a pistol object
        Pistol myPistol = new Pistol("Glock 19", 9, 1.0, new Company(), new Trigger(), new Magazine());

        // Demonstrating pistol properties
        System.out.println("Pistol Name: " + myPistol.getName());
        System.out.println("Caliber: " + myPistol.getCaliber());
        System.out.println("Weight: " + myPistol.getWeight() + " kg");

        // Loading the magazine
        myPistol.loadAmmo(10);

        // Firing
        System.out.println("\nFiring:");
        myPistol.fire();
        myPistol.fire();
        myPistol.fire();
        myPistol.fireMultipleTimes(3); // Fire 3 more rounds

        // Checking for ammunition
        boolean hasAmmo = myPistol.isLoaded();
        System.out.println("\nRounds in the magazine: " + (hasAmmo ? "Yes" : "No"));

        // Checking safety status and toggling it
        System.out.println("\nSafety Status:");
        boolean isSafetyOn = myPistol.getTrigger().isSafety();
        System.out.println("Safety is on: " + (isSafetyOn ? "Yes" : "No"));
        myPistol.toggleSafety();
        isSafetyOn = myPistol.getTrigger().isSafety();
        System.out.println("Safety is on: " + (isSafetyOn ? "Yes" : "No"));

        // Checking pistol status (loaded or not)
        System.out.println("\nPistol Status:");
        boolean isPistolLoaded = myPistol.isLoaded();
        System.out.println("Pistol is loaded: " + (isPistolLoaded ? "Yes" : "No"));

        // Changing magazine capacity and checking it
        System.out.println("\nChanging Magazine Capacity:");
        myPistol.changeMagazineCapacity(15);
        int newCapacity = myPistol.getMagazine().getCapacity();
        System.out.println("Magazine capacity: " + newCapacity);

        // Reloading the magazine
        System.out.println("\nReloading the Magazine:");
        myPistol.reload();

        // Aiming
        System.out.println("\nAiming:");
        myPistol.aim();

        // Clearing the magazine
        System.out.println("\nClearing the Magazine:");
        myPistol.clearMagazine();
    }
}
