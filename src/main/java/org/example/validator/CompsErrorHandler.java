package org.example.validator;


import org.apache.log4j.FileAppender;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;

public class CompsErrorHandler extends DefaultHandler {
    private Logger logger = Logger.getLogger("org.example.logs");

    public CompsErrorHandler(String log) throws IOException {
        logger.addAppender(new FileAppender(new SimpleLayout(), log));
    }

    public CompsErrorHandler() {
    }

    public void warning(SAXParseException e) {
        logger.warn(getLineAddress(e) + e.getMessage());
    }

    public void error(SAXParseException e) {
        logger.error(getLineAddress(e) + e.getMessage());
    }

    public void fatalError(SAXParseException e) {
        logger.fatal(getLineAddress(e) + e.getMessage());
    }

    private String getLineAddress(SAXParseException e) {
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}