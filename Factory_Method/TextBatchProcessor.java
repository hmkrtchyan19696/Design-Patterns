package Factory_Method_Example;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor {
	
	public Parser createParser(File file) {
		return new TextParser(file);
	}

}
