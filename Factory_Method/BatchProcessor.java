package Factory_Method_Example;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	
	public void processBatch(String fileName) {
		File file = openFile(fileName);
		Parser parser = createParser(file); // factory method
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}
	//FACTORY METHOD
	public abstract Parser createParser(File file);
	
	private File openFile(String fileName) {
		System.out.println("File openend.");
		return null;
	}
	
	private void processRecords(List<Record> records) {
		System.out.println("Processing each db record, calls, etc.");
	}

	private void writeSummary() {
		System.out.println("Wrote batch summary.");
		
	}

	private void closeFile(File file) {
		System.out.println("File Closed.");
		
	}

}
