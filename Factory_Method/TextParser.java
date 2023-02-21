package Factory_Method_Example;

import java.io.File;
import java.util.List;

class TextParser implements Parser {
	
	public TextParser() {
		
	}
	
	public TextParser(File file) {
		System.out.println("Creating a text parser.");
	}
	
	public List<Record> parse() {
		System.out.println("Parsing text and creating a record list.");
		return null;
	}

}
