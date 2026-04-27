package com.java.Beg.SpellCheckarUsingHashing;

import java.util.HashSet;
import java.util.Set;

public class SpellCheckar {
	
	private Set<String> dictionary;
	
//	Load New Words In Dictionary
	public SpellCheckar() {
		dictionary = new HashSet<String>();
		
		dictionary.add("JAVA");
		dictionary.add("PYTHON");
		dictionary.add("C++");
		dictionary.add("Software");
		
	}
	
	
//	Checking the Spelling of the word
	
	public boolean checkWord(String word) {
		return dictionary.contains(word.toLowerCase());
	}

}
