package KI305.Panasiuk.Lab3;

import java.io.*;

/**
 * The Pistol class represents a firearm with various properties and methods for
 * firing, reloading, and managing ammunition.
 * @author taraspanasiuk
 */
public class Pistol {
    private String name;
    private int caliber;
    private double weight;
    private Company company;
    private Trigger trigger;
    private Magazine magazine;

    /**
     * Default constructor for Pistol.
     */
    public Pistol() {
        name = "Unknown";
        caliber = 9;
        weight = 1.0;
        company = new Company();
        trigger = new Trigger();
        magazine = new Magazine();
    }

    /**
     * Parameterized constructor for Pistol.
     *
     * @param name     The name of the pistol.
     * @param caliber  The caliber of the pistol.
     * @param weight   The weight of the pistol.
     * @param company  The manufacturing company of the pistol.
     * @param trigger  The trigger type of the pistol.
     * @param magazine The magazine associated with the pistol.
     */
    public Pistol(String name, int caliber, double weight, Company company, Trigger trigger, Magazine magazine) {
        this.name = name;
        this.caliber = caliber;
        this.weight = weight;
        this.company = company;
        this.trigger = trigger;
        this.magazine = magazine;
    }

    /**
     * Get the name of the pistol.
     *
     * @return The name of the pistol.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the caliber of the pistol.
     *
     * @return The caliber of the pistol.
     */
    public int getCaliber() {
        return caliber;
    }

    /**
     * Get the weight of the pistol.
     *
     * @return The weight of the pistol.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Get the manufacturing company of the pistol.
     *
     * @return The manufacturing company of the pistol.
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Get the trigger type of the pistol.
     *
     * @return The trigger type of the pistol.
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Get the magazine associated with the pistol.
     *
     * @return The magazine associated with the pistol.
     */
    public Magazine getMagazine() {
        return magazine;
    }

    /**
     * Set the name of the pistol.
     *
     * @param name The name of the pistol.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the caliber of the pistol.
     *
     * @param caliber The caliber of the pistol.
     */
    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    /**
     * Set the weight of the pistol.
     *
     * @param weight The weight of the pistol.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Set the manufacturing company of the pistol.
     *
     * @param company The manufacturing company of the pistol.
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * Set the trigger type of the pistol.
     *
     * @param trigger The trigger type of the pistol.
     */
    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    /**
     * Set the magazine associated with the pistol.
     *
     * @param magazine The magazine associated with the pistol.
     */
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    /**
     * Log an activity to a file.
     *
     * @param activity The activity to be logged.
     */
    public void logActivity(String activity) {
        try {
            FileWriter fileWriter = new FileWriter("pistol_log.txt", true);
            fileWriter.write(activity + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Fire one round from the pistol.
     */
    public void fire() {
        if (magazine.getCurrentRounds() > 0) {
            System.out.println("Bang! " + name + " fired a round.");
            magazine.fireRounds(1);
            logActivity(name + " fired a round.");
        } else {
            System.out.println("Click! " + name + " is out of ammo.");
            logActivity(name + " attempted to fire but ran out of ammo.");
        }
    }

    /**
     * Fire multiple rounds from the pistol.
     *
     * @param rounds The number of rounds to fire.
     */
    public void fireMultipleTimes(int rounds) {
        for (int i = 0; i < rounds; i++) {
            fire();
        }
        logActivity(name + " fired " + rounds + " rounds.");
    }

    /**
     * Toggle the safety of the pistol.
     */
    public void toggleSafety() {
        trigger.setSafety(!trigger.isSafety());
        String safetyStatus = trigger.isSafety() ? "enabled" : "disabled";
        logActivity(name + " toggled the safety. Status: " + safetyStatus);
    }

    /**
     * Reload the pistol.
     */
    public void reload() {
        if (magazine.getCurrentRounds() < magazine.getCapacity()) {
            int roundsToLoad = magazine.getCapacity() - magazine.getCurrentRounds();
            System.out.println("Reloading " + name + " with " + roundsToLoad + " rounds.");
            magazine.loadRounds(roundsToLoad);
            logActivity(name + " reloaded. Loaded " + roundsToLoad + " rounds.");
        } else {
            System.out.println(name + " is already fully loaded.");
            logActivity(name + " attempted to reload, but the magazine is already fully loaded.");
        }
    }

    /**
     * Load ammunition into the pistol's magazine.
     *
     * @param roundsToAdd The number of rounds to load.
     */
    public void loadAmmo(int roundsToAdd) {
        if (roundsToAdd > 0) {
            magazine.loadRounds(roundsToAdd);
            System.out.println("Loaded " + roundsToAdd + " rounds into " + name + "'s magazine.");
            logActivity(name + " loaded " + roundsToAdd + " rounds into the magazine.");
        } else {
            System.out.println("Invalid number of rounds to load.");
            logActivity(name + " attempted to load an invalid number of rounds.");
        }
    }

    /**
     * Aim the pistol at the target.
     */
    public void aim() {
        System.out.println("Aiming " + name + " at the target.");
        logActivity(name + " is aiming at the target.");
    }

    /**
     * Clear the pistol's magazine.
     */
    public void clearMagazine() {
        int roundsInMagazine = magazine.getCurrentRounds();
        if (roundsInMagazine > 0) {
            System.out.println("Clearing " + name + "'s magazine. Removed " + roundsInMagazine + " rounds.");
            magazine.setCurrentRounds(0);
            logActivity(name + " cleared the magazine. Removed " + roundsInMagazine + " rounds.");
        } else {
            System.out.println(name + "'s magazine is already empty.");
            logActivity(name + " attempted to clear the magazine, but it is already empty.");
        }
    }

    /**
     * Change the magazine capacity of the pistol.
     *
     * @param newCapacity The new capacity of the magazine.
     */
    public void changeMagazineCapacity(int newCapacity) {
        magazine.setCapacity(newCapacity);
        logActivity(name + " changed the magazine capacity to " + newCapacity + " rounds.");
    }

    /**
     * Check if the pistol is loaded.
     *
     * @return True if the pistol is loaded, false otherwise.
     */
    public boolean isLoaded() {
        boolean loaded = magazine.getCurrentRounds() > 0;
        if (loaded) {
            logActivity(name + " checked the pistol's status. It is loaded.");
        } else {
            logActivity(name + " checked the pistol's status. It is not loaded.");
        }
        return loaded;
    }
}
