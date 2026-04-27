package com.java.Beg.stack;

public class Action {

	
	private String value;
	
	public Action(String value) {
		this.value = value;
	}
	
	public void execute(StringBuilder editor) {
		editor.append(value);
	}
	
	public void undo(StringBuilder editor) {
		int len = value.length();
		editor.delete(editor.length()-len, editor.length());
	}
	
	
	
}
