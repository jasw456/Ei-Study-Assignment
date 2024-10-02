package Satellite_Command_System;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a command (rotate, activatePanels, deactivatePanels, collectData, status, exit):");
            String input = scanner.nextLine();

            switch (input) {
                case "rotate":
                    System.out.println("Enter direction (North, South, East, West):");
                    String direction = scanner.nextLine();
                    try {
                        Command rotateCommand = new RotateCommand(satellite, direction);
                        invoker.executeCommand(rotateCommand);
                    } catch (IllegalArgumentException e) {
                        logger.warning("Invalid direction input.");
                        System.out.println(e.getMessage());
                    }
                    break;
                case "activatePanels":
                    Command activatePanelsCommand = new ActivatePanelsCommand(satellite);
                    invoker.executeCommand(activatePanelsCommand);
                    break;
                case "deactivatePanels":
                    Command deactivatePanelsCommand = new DeactivatePanelsCommand(satellite);
                    invoker.executeCommand(deactivatePanelsCommand);
                    break;
                case "collectData":
                    Command collectDataCommand = new CollectDataCommand(satellite);
                    invoker.executeCommand(collectDataCommand);
                    break;
                case "status":
                    satellite.displayStatus();
                    break;
                case "exit":
                    logger.info("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    logger.warning("Invalid command input: " + input);
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}
