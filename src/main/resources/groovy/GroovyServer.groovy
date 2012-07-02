package com.hopcroft.examples.groovy

import com.hopcroft.examples.Server

public class GroovyServer implements Server
{
    public void start()
    {
        println ("Groovy Server started...")
    }
 
    public void restart()
    {
        println ("Groovy Server restarted...")
    }
 
    public void stop()
    {
        println ("Groovy Server stopped...")
    }
}