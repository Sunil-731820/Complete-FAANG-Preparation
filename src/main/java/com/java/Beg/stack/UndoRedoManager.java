package com.java.Beg.stack;

import java.util.Stack;

public class UndoRedoManager {

	
	private Stack<Action> undoStack = new Stack<Action>();
	private Stack<Action> redoStack = new Stack<Action>();
	private StringBuilder editor = new StringBuilder();
	
	
//	Perform Actions 
	public void doAction(Action action) {
		action.execute(editor);
		undoStack.push(action);
		redoStack.clear();
		System.out.println("The Value of the Text Editor is :"+editor);
	}
	
	
//	Undo Last Actions
	public void undo() {
		if(!undoStack.isEmpty()) {
			Action action = undoStack.pop();
			System.out.println("The value of the Actions After pop methods:"+action);
			action.undo(editor);
			redoStack.push(action);
			System.out.println("After Undo perform the Editor Value is :"+editor);
		}
	}
	
	
//	Redo Actions 
	
	public void redo() {
		if(!redoStack.isEmpty()) {
			Action action = redoStack.pop();
			action.execute(editor);
			undoStack.push(action);
			System.out.println("After redo Actions is performed .."+editor);
		}
	}
	
	
	
}