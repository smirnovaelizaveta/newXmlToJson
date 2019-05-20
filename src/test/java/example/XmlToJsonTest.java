package example;

import example.XmlToJson;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RunWith(Parameterized.class)
public class XmlToJsonTest {
    @Parameterized.Parameter(value = 0)
    public String pathToXmlFile;
    @Parameterized.Parameter(value = 1)
    public String pathToJsonFile;


    @Parameterized.Parameters()
    public static Object[] data() {
        return new Object[][]{
                {"src\\test\\resources\\xmlExamples\\Example1.xml", "src\\test\\resources\\jsonExamples\\Example1.json"},
                {"src\\test\\resources\\xmlExamples\\Example2.xml", "src\\test\\resources\\jsonExamples\\Example2.json"},
                {"src\\test\\resources\\xmlExamples\\Example3.xml", "src\\test\\resources\\jsonExamples\\Example3.json"}
        };
    }

    @Test
    public void xmlToJsonTest() throws IOException {
        String json = new String(Files.readAllBytes(Paths.get(pathToJsonFile)));
        Assert.assertEquals(json, XmlToJson.xmlToJson(pathToXmlFile));
    }

}