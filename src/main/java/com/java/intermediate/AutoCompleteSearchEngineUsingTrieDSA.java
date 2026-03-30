package com.java.intermediate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode{
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isEndofWord = false;
}

class Trie{
	private TrieNode root = new TrieNode();
	
//	Insert the Word 
	
	public void insert(String word) {
		TrieNode node = root;
		for(char c : word.toCharArray()) {
			node = node.children.computeIfAbsent(c, k->new TrieNode());
		}
		node.isEndofWord = true;
	}
	
//	Search prefix 
	
	private TrieNode searchNode(String prefix) {
		TrieNode node = root;
		for(char c : prefix.toCharArray()) {
			node = node.children.get(c);
			if(node==null) {
				return null;
			}
		}
		return node;	
	}
	
	public List<String> autocomplete(String prefix){
		List<String> results = new ArrayList<String>();
		TrieNode node = searchNode(prefix);
		if(node==null) {
			return results;
		}else {
			dfs(node, new StringBuilder(prefix),results);
			return results;
		}
	}

	private void dfs(TrieNode node, StringBuilder prefix, List<String> results) {
		if (node.isEndofWord) results.add(prefix.toString());
        for (char c : node.children.keySet()) {
            dfs(node.children.get(c), prefix.append(c), results);
            prefix.deleteCharAt(prefix.length() - 1);
        }
		
	}
}


public class AutoCompleteSearchEngineUsingTrieDSA {
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the Auto complete Search Engine Using Trie DSA");
	}

}
