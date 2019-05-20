package example.parser;

import example.model.XmlElement;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public interface Parser {

    XmlElement parse(File xmlFile) throws ParserConfigurationException, SAXException, IOException;
}
