package Satellite_Command_System;

import java.util.logging.Logger;

public class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());
    private String orientation;
    private String solarPanelStatus;
    private int dataCollected;

    public Satellite() {
        // Initial state
        this.orientation = "North";
        this.solarPanelStatus = "Inactive";
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        if (direction == null || (!direction.equalsIgnoreCase("North") && !direction.equalsIgnoreCase("South")
                && !direction.equalsIgnoreCase("East") && !direction.equalsIgnoreCase("West"))) {
            logger.warning("Invalid direction: " + direction);
            throw new IllegalArgumentException("Invalid direction provided: " + direction);
        }
        this.orientation = direction;
        logger.info("Satellite rotated to " + direction);
        System.out.println("Satellite rotated to " + direction);
    }

    public void activatePanels() {
        if ("Active".equals(this.solarPanelStatus)) {
            logger.warning("Solar panels are already active.");
            System.out.println("Solar panels are already active.");
        } else {
            this.solarPanelStatus = "Active";
            logger.info("Solar panels activated.");
            System.out.println("Solar panels activated.");
        }
    }

    public void deactivatePanels() {
        if ("Inactive".equals(this.solarPanelStatus)) {
            logger.warning("Solar panels are already inactive.");
            System.out.println("Solar panels are already inactive.");
        } else {
            this.solarPanelStatus = "Inactive";
            logger.info("Solar panels deactivated.");
            System.out.println("Solar panels deactivated.");
        }
    }

    public void collectData() {
        try {
            if ("Active".equals(this.solarPanelStatus)) {
                this.dataCollected += 10;
                logger.info("Data collected: " + this.dataCollected + " units.");
                System.out.println("Data collected: " + this.dataCollected + " units.");
            } else {
                logger.warning("Cannot collect data: Solar panels are inactive.");
                System.out.println("Cannot collect data: Solar panels are inactive.");
            }
        } catch (Exception e) {
            logger.severe("Error collecting data: " + e.getMessage());
        }
    }

    public void displayStatus() {
        logger.info("Displaying satellite status");
        System.out.println("Satellite Status: ");
        System.out.println("Orientation: " + this.orientation);
        System.out.println("Solar Panels: " + this.solarPanelStatus);
        System.out.println("Data Collected: " + this.dataCollected + " units.");
    }
}
