package example.parser.parserFactory;

import example.parser.Parser;
import example.parser.SaxParser;

public class SaxParserFactory extends ParserFactory{
    @Override
    public Parser createParser() {
        return new SaxParser();
    }
}
