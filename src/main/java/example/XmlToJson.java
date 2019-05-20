package example;

import example.parser.Parser;
import example.parser.parserFactory.ParserFactory;
import example.parser.parserFactory.SaxParserFactory;
import example.model.XmlElement;

import java.io.File;


import com.fasterxml.jackson.databind.ObjectMapper;


public class XmlToJson {

    public static String xmlToJson(String pathToXmlFile) {
        String result;
        ParserFactory parserFactory = new SaxParserFactory();
        Parser parser = parserFactory.createParser();
        try {
            XmlElement rootOfXmlElements = parser.parse(new File(pathToXmlFile));

            String JsonString = new ObjectMapper().writeValueAsString(rootOfXmlElements);
            result = JsonString;
        } catch (Exception e) {
            result = "Invalid input";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xmlToJson("pom.xml"));

    }


}
