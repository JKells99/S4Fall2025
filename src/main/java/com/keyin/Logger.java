/*
 * Logger.java
 * Utility class for logging messages and inventory alerts in the pharmacy system.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

package com.keyin;

import java.io.BufferedWriter;
import java.nio.Buffer;

public class Logger {

    // Write me a logger that writes to files based on severity (info, debug, error, inventory alert) use Buffered writer for it

    /**
     * Logs an inventory alert message to a separate file called inventory_alerts.log.
     * @param message the alert message to log
     */
    public static void logInventoryAlert(String message) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("inventory_alerts.log", true))) {
            writer.write("[INVENTORY ALERT] " + message);
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
