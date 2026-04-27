package com.java.Beg.SongCircularLinkedList;

public class MusicPlaylist {
	
	private SongNode current;
	
//	Add Song to the play List Okay 
	public void addSong(String songName) {
		System.out.println(" I am Adding song to our Play List ...");
		SongNode newSong = new SongNode(songName);
		if(current ==null) {
			newSong.next = newSong;
			newSong.prev = newSong;
			current=newSong;
		}else {
			SongNode last = current.prev;
			last.next = newSong;
			newSong.prev = last;
			newSong.next = current;
			current.prev = newSong;
		}
		System.out.println("Added Song is: "+songName);
	}
	
//	now play the Current Songs 
	public void playCurrentSong() {
		if(current==null) {
			System.out.println("NO SONGS ARE AVAILABLE ...");
		}else {
			System.out.println("PLAYING ...."+current.songName);
		}
	}
	
//	Play the Next Songs Okay 
	
	public void playNextSong() {
		if(current==null) {
			System.out.println("No Next Songs Are Available ...");
		}else {
			current = current.next;
			playCurrentSong();
		}
	}
	
//	Play the previous Songs 
	public void playPrevSong() {
		if(current==null) {
			System.out.println("NO PREVIOUS SONGS ARE AVAILABLE ..");  
		}else {
			current = current.prev;
			playCurrentSong();
		}
	}
	
//	Display the playList once
	public void displayPlayList() {
		if(current==null) {
			return ;
		}else {
			SongNode temp = current;
			do {
				System.out.println(temp.songName);
				temp = temp.next;
			}while(temp!=current);
			
		}
	}
	

}
