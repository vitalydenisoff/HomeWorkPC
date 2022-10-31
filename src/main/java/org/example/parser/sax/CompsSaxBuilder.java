package org.example.parser.sax;

import org.example.entity.Comps;
import org.example.validator.CompsErrorHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class CompsSaxBuilder {
    static final Logger logger = LogManager.getLogger();
    private List<Comps> devices;
    private CompsSaxHandler sh=new CompsSaxHandler();
    private XMLReader reader;

    public void setComps(List<Comps> devices) {
        this.devices = devices;
    }

    public CompsSaxBuilder(List<Comps> devices) {
        this.devices = devices;
    }

    public CompsSaxBuilder() throws IOException {
        SAXParserFactory factory=SAXParserFactory.newInstance();
        try {
            SAXParser saxParser= factory.newSAXParser();
            reader= saxParser.getXMLReader();
        } catch (SAXException | ParserConfigurationException e) {
            logger.log(Level.ERROR, "SAX parser error");
        }
        reader.setErrorHandler(new CompsErrorHandler());
        reader.setContentHandler(sh);
    }

    public List<Comps> getDevices() {
        return devices;
    }

    public void buildSetDevices(String fileName) {
        try {
            reader.parse(fileName);
            devices= sh.getDevices();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void buildSetComps(String s) {
    }

    public boolean getComps() {
    }
}
