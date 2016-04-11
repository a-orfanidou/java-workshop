package fileintersector;

public class FileIntersector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile1;
		String inputFile2;
		String outputFile;
				
		if (args.length < 3) {
			System.out.println("Please supply three arguments");
			return;
		}
		
		inputFile1 = args[0];
		inputFile2 = args[1];
		outputFile = args[2];
		
		WordSet words1 = new WordSet(inputFile1);
		WordSet words2 = new WordSet(inputFile2);
		
		WordSet result = words1.Intersection(words2);
		result.Sort();
		result.PersistToFile(outputFile);
	}
	
}
