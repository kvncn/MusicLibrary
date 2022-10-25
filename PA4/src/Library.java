/*
* AUTHOR: Kevin Nisterenko
* FILE: Library.java
* ASSIGNMENT: Programming Assignment 4 - Spitify
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program defines the Library class to be used in Spitify. 
* It defines the constructor and required methods according to the spec 
* to create a Library object, that contains information about all songs 
* that are used in Spitify main run, regardless of playlists. 
*
* USAGE: 
* java PA4Main - Spitify uses this class for the Songs
*/

import java.util.*;

public class Library {
	
	// Instance variables
	private Set<Song> library;
	
	/*
	* A constructor that initializes an empty Library object using a set. 
	*/
	public Library() {
		this.library = new HashSet<Song>();
	}
	
	/*
	* A getter method that returns the Song object of a song in the 
	* library given its title. If the song is not in the library it returns null.
	*
	* @param title, is the string representing the title of a song
	* @return retSong, is null if the song is not in the library, or it is the Song 
	* object of a song that has the given title
	*/
	public Song getSong(String title) {
		Song retSong = null;
		
		// For each loop to check the title of song and return the song of matching title
		for (Song song : this.library) {
			if (song.getTitle().equals(title)) {
				retSong = song;
			}
		}
		return retSong;
	}
	
	/*
	* A setter method of sorts that adds a given song object to the library.
	*
	* @param song, is the Song object that is to be added to the library
	*/
	public void addSong(Song song) {
		this.library.add(song);
	} 
	
	/*
	* A setter method of sorts that removes a given song object from the library if 
	* it is in the library.
	*
	* @param song, is the Song object that is to be removed from the library
	*/
	public void removeSong(Song song) {
		if (this.library.contains(song)) {
			this.library.remove(song);
		}
	}
	
	/*
	* A method that returns the string representation of the library, that is, all the songs 
	* in the library in alphabetical order. For this, the song titles are passed to a List,
	* where they are sorted, then the return string is built using another loop 
	* for the alphabetical order. 
	* 
	* @return strRep, string representation of the song library
	*/
	public String toString() {
		String strRep = "";
		
		// Sorts the songs by title in a List, the loop iterates over 
		// the set and adds the title to the list. Sort method used 
		// to sort alphabetically.
		List<String> songList = new ArrayList<String>();
		for (Song song : this.library) {
			songList.add(song.getTitle()); 
			}
		Collections.sort(songList);
		
		// Iterates over the song titles list, for each song title 
		// it uses the getSong method to get the song object and 
		// then concatenate the string. 
		for (String songTitle : songList) {
			Song song = this.getSong(songTitle);
			strRep += song.toString() + "\n";
		}
		
		return strRep;
	}

}
