package Factory_Method_Example;

import java.io.File;

public class XMLBatchProcessor extends BatchProcessor {
	
	@Override
	public Parser createParser(File file) {
		System.out.println("XML Batch Processor created.");
		return null;
	}
	
}
