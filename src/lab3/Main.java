package lab3;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	 SAXParserFactory parserF = SAXParserFactory.newInstance();
	 Handler handler = new Handler();
	 try {

	     SAXParser saxparser = parserF.newSAXParser();
	     saxparser.parse(new File("src/file.xml"), handler);
     } catch (ParserConfigurationException | SAXException e) {
	     e.printStackTrace();
     } catch (IOException e) {
	     e.printStackTrace();
     }

     Map<Integer, String> data = handler.getData();
	 for(Map.Entry<Integer,String> dMap: data.entrySet()) {
	 	System.out.println(dMap.getKey() + " - " + dMap.getValue());
	 }
    }
}
