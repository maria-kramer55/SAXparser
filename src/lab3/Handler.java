package lab3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.HashMap;
import java.util.Map;

public class Handler extends DefaultHandler {

    private Map<Integer, String> data = new HashMap<Integer, String>();
    private int id;
    private String element;

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
       element = qName;
       if(element.equals("material")){
           id = Integer.parseInt(attr.getValue(0));
           if(element.equals("type")) element = qName;
       }
    }

    @Override
    public void endElement(String namespace, String localName, String qName) throws SAXException {
       element = "";
       id = -1;
    }

    @Override
    public void characters(char [] ch, int start, int end) {
        if (element.equals("type")) {
        String typeStr = new String(ch, start, end);
        data.put(id,typeStr);

    }


}

    public Map<Integer, String> getData() {
        return data;
    }
}

