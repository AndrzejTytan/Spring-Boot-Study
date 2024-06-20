package com.danwys.SpringBootStudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Play {
    Logger logger = LoggerFactory.getLogger(Play.class);

    private void testLogging() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
    }
}
