package InterviewQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordReplacer {
	
	public static String inputFileContents = null;

	/**
	 * Constructor to initiate the input file
	 * @param textFile
	 */
    public WordReplacer(File textFile) {
    	try {
			inputFileContents = readFile(textFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found.");
		}catch (NullPointerException e) {
			throw new RuntimeException("File object not initialized.");
		} catch (IOException e) {
			throw new RuntimeException("IO Exception caught.");
		}   
    }
    
    /**
     * Private method to read the file contents into string
     * @param fileObject
     * @return
     * @throws IOException
     */
    private String readFile(File fileObject) throws IOException {

        StringBuilder fileContents = new StringBuilder((int)fileObject.length());
        Scanner scanner = new Scanner(fileObject);
        String lineSeparator = System.getProperty("line.separator");

        try {
            while(scanner.hasNextLine()) {        
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }

    /**
     * Method to return the count of occurrences of the given word
     * @param word
     * @return
     */
    public int getCountOfOccurrences(String word) {
       int count =0;
       int idx ; 
       String dupicateContents = inputFileContents;
	   while(dupicateContents.indexOf(word) >= 0){
		   idx = dupicateContents.indexOf(word);
		   dupicateContents = dupicateContents.substring(idx+word.length());
		   count++;
	   }
       return count;
    }
    
    /**
     * Method to replace all occurrences of original word in to new word
     * @param originalWord
     * @param newWord
     * @return
     */
    public int replaceAllOccurrences(String originalWord, String newWord) {
    	try{
    		inputFileContents = inputFileContents.replaceAll(originalWord, newWord);
            return 0;
    	}catch (Exception e){
    		throw new RuntimeException("Unexpected Exception caught", e);
    	}
    }

    /**
     * Method to write the updated text to the file
     * @param file
     */
    public void writeUpdatedTextToFile(File file) {
    	FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(inputFileContents);
			fw.close();
		} catch (IOException e) {
			throw new RuntimeException("IO Exception while writing to file.");
		}
    }
}