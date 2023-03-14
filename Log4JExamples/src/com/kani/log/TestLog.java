package com.kani.log;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestLog {
private static Logger log=Logger.getLogger(TestLog.class);
	public static void main(String[] args) {
		// Create a Layout
        //Layout layout=new SimpleLayout();
		//Layout layout=new HTMLLayout();
		//Layout layout=new XMLLayout();
		Layout layout=new PatternLayout("%p,%d,%C,%M,%m,%n");



		//Create a Appender
		Appender app=new ConsoleAppender(layout);
		//Appender app=new FileAppender(layout,"c:\\users\\project\\data.log");

		//Link Appender with Logger
		log.addAppender(app);
		
		log.info("This is INFO");
		log.debug("This is DEBUG");
		log.warn("This is WARN");
		log.error("This is ERROR");
        log.fatal("This is FATAL");


	}

}
