package Satellite_Command_System;

import java.util.logging.Logger;

public class RotateCommand implements Command {
    private static final Logger logger = Logger.getLogger(RotateCommand.class.getName());
    private Satellite satellite;
    private String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        try {
            satellite.rotate(direction);
        } catch (IllegalArgumentException e) {
            logger.warning("Failed to rotate satellite: " + e.getMessage());
        }
    }
}
