package Factory_Method_Example;

public class Demonstration {

	public static void main(String[] args) {
		BatchProcessor batchprocessor = createBatchProcessor("XML");
		batchprocessor.processBatch("inputFile");
		System.out.println("Done!");
	}

	private static BatchProcessor createBatchProcessor(String format) {
		if (format.equals("text")) {
			return new TextBatchProcessor();
		}
		if (format.equals("XML")) {
			return new XMLBatchProcessor();
		}
		return null;
	}

}
