package com.javaLive.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    Logger logger = LoggerFactory.getLogger(MyBean.class);

    public void doSomething() {
        logger.info("This is Info level log message from Mybean component.");
    }
}