package example.parser;

import example.model.XmlElement;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomParser implements Parser {

    @Override
    public XmlElement parse(File xmlFile) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlFile);
        Node rootOfNodes = document.getDocumentElement();

        XmlElement rootOfXmlElements = readNode(rootOfNodes);
        return rootOfXmlElements;
    }


    private XmlElement readNode(Node node) {
        XmlElement xmlElement = new XmlElement(node.getNodeName());
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() != Node.TEXT_NODE)
                xmlElement.addChild(readNode(item));
        }
        return xmlElement;
    }
}
