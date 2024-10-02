package Satellite_Command_System;

import java.util.logging.Logger;

class ActivatePanelsCommand implements Command {
    private static final Logger logger = Logger.getLogger(ActivatePanelsCommand.class.getName());
    private Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        if (satellite == null) {
            logger.severe("Satellite object is null during ActivatePanelsCommand creation.");
            throw new IllegalArgumentException("Satellite object cannot be null.");
        }
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        try {
            satellite.activatePanels();
            logger.info("ActivatePanelsCommand executed successfully.");
        } catch (Exception e) {
            logger.severe("Failed to execute ActivatePanelsCommand: " + e.getMessage());
        }
    }
}
