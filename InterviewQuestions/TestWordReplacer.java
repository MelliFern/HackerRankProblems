package InterviewQuestions;

import java.io.File;

public class TestWordReplacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File textFile = new File("test1.txt");
		WordReplacer wordReplacer = new WordReplacer(textFile);
		System.out.println(wordReplacer.getCountOfOccurrences("word"));
		System.out.println(wordReplacer.replaceAllOccurrences("word", "newWord"));
		System.out.println(wordReplacer.inputFileContents);
		wordReplacer.writeUpdatedTextToFile(textFile);
	}

}
