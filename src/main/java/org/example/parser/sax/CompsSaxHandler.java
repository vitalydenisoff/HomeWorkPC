package org.example.parser.sax;

import org.example.entity.Comps;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;

import static org.example.parser.sax.CompsEnum.*;

public class CompsSaxHandler extends DefaultHandler {

    private LinkedList<Comps> devices;

    private Comps current;
    private CompsEnum currentXmlTag;
    private EnumSet<CompsEnum> withText;
    private static final String ELEMENT_DEVICE = "device";
    public void StudentHandler() {
        devices = new LinkedList<Comps>();
        withText = EnumSet.range(CompsEnum.DEVICES, DEVICE);
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (ELEMENT_DEVICE.equals(qName)) {
            current = new Comps();
            current.setPrice(Integer.valueOf(attrs.getValue(0)));
            if (attrs.getLength() == 2) {
                current.setPrice(Integer.valueOf(attrs.getValue(1)));
            }
        } else {
            CompsEnum temp = CompsEnum.valueOf(qName.toUpperCase());
            if (withText.contains(temp)) {
                currentXmlTag = temp;
            }
        }
    }
    public void endElement(String uri, String localName, String qName) {
        if (ELEMENT_DEVICE.equals(qName)) {
            devices.add(current);
        }
    }
    public void characters(char[] ch, int start, int length) {
        String data = new String(ch, start, length).strip();
        if (currentXmlTag!= null) {
            switch (CompsEnum) {
                case DEVICE -> current.setDevice(data);
                case PRICE -> current.setPrice(Integer.parseInt(data));
                case LOCATION -> current.getLocation(data);
                case POWERCONSUM -> current.getPowerconsum(data);
                case COOLER -> current.getCooler(data)
                case PORT -> current.getPort().setPort(data);
                default -> throw new EnumConstantNotPresentException(
                        currentXmlTag.getDeclaringClass(), currentXmlTag.name());
            }
        }
        CompsEnum = null;
    }
    public List<Comps> getDevices() {
    }
}
