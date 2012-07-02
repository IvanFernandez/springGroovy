package com.hopcroft.examples;

public class JavaServer {
	 private Server groovyServer;
	 
	    public JavaServer() {
	    }
	 
	    public void start() {
	        System.out.println("Java server started....");
	    }
	 
	    public void restart() {
	        System.out.println("Java server re-started....");
	    }
	 
	    public void stop() {
	        System.out.println("Java server stopped....");
	    }   
	 
	    public void setGroovyServer(Server groovyServer)
	    {
	        this.groovyServer = groovyServer;
	    }
	 
	    public void testGroovyServer(){
	        groovyServer.start();
	        groovyServer.restart();
	        groovyServer.stop();
	    }
}
