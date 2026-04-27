package com.java.Beg.SongCircularLinkedList;

public class Main {
	public static void main(String[] args) {
		System.out.println("This is the Example of the Song using Circular linked List");
		
		MusicPlaylist playList = new MusicPlaylist();
		
		playList.addSong("INDIAN SONG");
		playList.addSong("BOLLYWOOD SONG");
		playList.addSong("HOLLYWOOD SONG");
		
		playList.displayPlayList();
		
//		Now Playing the current Songs
		
		playList.playCurrentSong();
		
//		Now Playing the Next Songs 
		playList.playNextSong();
		
//		Now Playing the Previous Songs 
		playList.playPrevSong();
	}

}
