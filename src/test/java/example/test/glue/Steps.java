package example.test.glue;

import cucumber.api.java.ru.*;
import example.XmlToJson;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Steps {
    String pathToXml;

    @Пусть("^на вход конвертера подан файл \"([^\"]*)\"$")
    public void на_вход_конвертера_подан_файл(String arg1) throws Throwable {
        pathToXml = arg1;
    }

    @Тогда("^результат содержит подстроку \"([^\"]*)\"$")
    public void результат_содержит_подстроку(String arg1) throws Throwable {
        String json = new String(Files.readAllBytes(Paths.get(arg1)));
        Assert.assertEquals(json, XmlToJson.xmlToJson(pathToXml));
    }

}
