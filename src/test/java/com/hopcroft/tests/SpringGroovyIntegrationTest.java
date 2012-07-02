package com.hopcroft.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hopcroft.examples.JavaServer;

public class SpringGroovyIntegrationTest {

	@Test
	public void ServerTest() {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"./src/main/resources/spring/applicationContext.xml");
		JavaServer javaServer = (JavaServer) context.getBean("javaServer");
		javaServer.start();
		javaServer.restart();
		javaServer.stop();

		javaServer.testGroovyServer();
	}

}
