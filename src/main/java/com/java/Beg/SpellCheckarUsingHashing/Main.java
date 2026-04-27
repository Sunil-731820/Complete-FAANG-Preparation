package com.java.Beg.SpellCheckarUsingHashing;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the Spell Checking using hash");
		
		SpellCheckar checker = new SpellCheckar();
		
		String[] words = {
				"JAVA",
				"PYTHON",
				"SPRING",
				"Software"
		};
		
		for(String word : words) {
			if(checker.checkWord(word)) {
				System.out.println("word : "+word + "CORRECT ..");
			}else {
				System.out.println("Word :"+word + "MISSPELLED ..");
			}
		}
	}

}
