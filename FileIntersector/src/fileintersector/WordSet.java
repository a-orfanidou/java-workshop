package fileintersector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordSet {
	String filePath;
	Set<String> words = new HashSet<String>();
	
	public String getFilePath() {
		return filePath;
	}
	
	public Set<String> getSet() {
		return words;
	}
	
	public WordSet(String _filePath) {
		filePath = _filePath;
		
		Load();
	}
	
	public WordSet(Set<String> original) {
		words = new HashSet<String>(original);
	}
	
	public WordSet Intersection(WordSet comparedSet) {
		Set<String> intersection = new HashSet<String>(words);
		intersection.retainAll(comparedSet.getSet());
		
		WordSet result = new WordSet(intersection);
		
		return result;
	}	
	
	public void Sort() {
		
	}
	
	public void PersistToFile(String destination_path) {
		
	}
	
	
	private void Load() {
		BufferedReader inputStream;
		
		try {
			inputStream = new BufferedReader(new FileReader(filePath));
			
			String curr_word = inputStream.readLine();
			
			while (curr_word != null) {
				words.add(curr_word);
						
				curr_word = inputStream.readLine();
			}
			
			inputStream.close();
		}
		catch (FileNotFoundException e){
			
		}
		catch (IOException e) {
		
		}
		
	}
	
	

}
