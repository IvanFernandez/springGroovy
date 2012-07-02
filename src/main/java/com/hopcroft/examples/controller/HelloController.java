package com.hopcroft.examples.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	private Controller helloGroovyController;

	public Controller getHelloGroovyController() {
		return helloGroovyController;
	}

	public void setHelloGroovyController(Controller helloGroovyController) {
		this.helloGroovyController = helloGroovyController;
	}

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return helloGroovyController.handleRequest(arg0, arg1);
	}

}