package org.example.parser;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class SaxCompsParser {
    private static final String path="data\\comps.xml";
    public static void main(String[] args) {

        try {
            XMLReader reader= XMLReaderFactory.createXMLReader();
            ConsoleCompsHandler handler=new ConsoleCompsHandler();
            reader.setContentHandler(handler);
            reader.parse(path);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
