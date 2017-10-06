package au.com.cbigconsulting;

import org.apache.log4j.Logger;

public class Another {
    final static Logger log = Logger.getLogger(Another.class);

    public static void one() {
        log.info("Logging from Another one");
    }
}
