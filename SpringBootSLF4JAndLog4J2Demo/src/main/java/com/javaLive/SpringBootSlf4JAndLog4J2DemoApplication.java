package com.javaLive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javaLive.beans.MyBean;

@SpringBootApplication
public class SpringBootSlf4JAndLog4J2DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
                SpringApplication.run(SpringBootSlf4JAndLog4J2DemoApplication.class, args);
		MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();
	}

}
