package lab3;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler extends DefaultHandler {
    private Map<Integer, String> data = new HashMap<>();

    public Handler() {
        //list = new ArrayList<>();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start parsing...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end parsing...");
    }

    @Override
    public void startElement(String namespace, String localName, String qName, Attributes attr) {
        System.out.print(qName + " ");
    }
    @Override
    public void endElement(String namespace, String localName, String qName) throws SAXException {
/*if (qName.equalsIgnoreCase("material")){

}*/
    }

    @Override
    public void characters(char[] ch, int start, int end) {
        System.out.print(new java.lang.String(ch, start, end));
    }

    public Map<Integer, String> getData() {
        return data;
    }
}