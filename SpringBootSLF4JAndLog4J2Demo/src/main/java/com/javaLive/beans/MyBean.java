package com.javaLive.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    Logger logger = LoggerFactory.getLogger(MyBean.class);

    public void doSomething() {
        logger.info("==========This is Info level log message from Mybean component.================");
        logger.trace("=========This is trace level log message from Mybean component.===============");
        logger.debug("=========This is debug level log message from Mybean component.===============");
        logger.warn("==========This is warn level log messagefrom Mybean component.=================");
        logger.error("=========This is error level log messagefrom Mybean component.================");
    }
}