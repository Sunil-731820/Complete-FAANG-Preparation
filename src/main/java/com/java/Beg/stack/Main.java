package com.java.Beg.stack;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the Undo redo Features ");
		
		UndoRedoManager manager =new UndoRedoManager();
		
		manager.doAction(new Action("A"));
		manager.doAction(new Action("B"));
		manager.doAction(new Action("C"));
		
//		Now Its time to call Methods like Redo or undo okay ...
		
		manager.redo();
		
		manager.undo();
		manager.redo();
		manager.undo();
	}

}
