package Factory_Method_Example;

import java.util.List;

public class XMLParser extends TextParser {
	
	public XMLParser() {
		System.out.println("XML Parser Created.");
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing XML file.");
		return null;
	}
	
	

}
