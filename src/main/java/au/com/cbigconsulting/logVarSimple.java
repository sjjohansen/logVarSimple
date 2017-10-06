package au.com.cbigconsulting;

import org.apache.log4j.Logger;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * basically stolen from:
 *   https://stackoverflow.com/questions/36170962/how-to-append-hostname-to-log-file-in-log4j-xml
 */

public class logVarSimple {

    private static int NUM_TIMES = 10;

    public static void main(String args[]) {

        String thisHost = "UNKNOWN_HOST";

        try {
            thisHost = InetAddress.getLocalHost().getHostName().toLowerCase();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.setProperty("thisHost", thisHost);
        final Logger log = Logger.getLogger(logVarSimple.class);

        for(int i = 0; i < NUM_TIMES; i++){
            try {
                Thread.sleep((long)(Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("log some stuff from " + thisHost);
            Another.one();
        }
    }
}

