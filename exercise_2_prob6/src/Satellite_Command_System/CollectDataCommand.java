package Satellite_Command_System;

import java.util.logging.Logger;

class CollectDataCommand implements Command {
    private static final Logger logger = Logger.getLogger(CollectDataCommand.class.getName());
    private Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.collectData();
        logger.info("CollectDataCommand executed.");
    }
}
