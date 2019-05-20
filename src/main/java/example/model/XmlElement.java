package example.model;

import java.util.ArrayList;
import java.util.List;

public class XmlElement {
    private String name;
    private List<XmlElement> children;

    public XmlElement(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void addChild(XmlElement xmlElement) {
        children.add(xmlElement);
    }

    public List<XmlElement> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

}
