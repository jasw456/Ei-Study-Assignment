package Satellite_Command_System;

import java.util.logging.Logger;

public class DeactivatePanelsCommand implements Command {
    private static final Logger logger = Logger.getLogger(DeactivatePanelsCommand.class.getName());
    private Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.deactivatePanels();
        logger.info("DeactivatePanelsCommand executed.");
    }
}
