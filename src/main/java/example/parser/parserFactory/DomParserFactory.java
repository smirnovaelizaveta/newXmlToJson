package example.parser.parserFactory;

import example.parser.DomParser;
import example.parser.Parser;

public class DomParserFactory extends ParserFactory {
    @Override
    public Parser createParser() {
        return new DomParser();
    }
}
