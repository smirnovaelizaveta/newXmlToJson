package example.parser;

import example.model.XmlElement;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser implements Parser {


    @Override
    public XmlElement parse(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        Handler handler = new Handler();
        parser.parse(xmlFile, handler);
        return handler.root;
    }


    private class Handler extends DefaultHandler {
        private XmlElement root;
        XmlElement xmlElement;
        LinkedList<XmlElement> parents = new LinkedList<>();

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            xmlElement = new XmlElement(qName);
            parents.add(xmlElement);

        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            XmlElement xmlElement = parents.pollLast();
            if (parents.isEmpty()) {
                root = xmlElement;
            } else {
                parents.peekLast().addChild(xmlElement);
            }
        }

    }


}
