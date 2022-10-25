/*
* AUTHOR: Kevin Nisterenko
* FILE: Playlist.java
* ASSIGNMENT: Programming Assignment 4 - Spitify
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program defines the Playlist class to be used in Spitify. 
* It defines the constructors and required methods according to the spec 
* to create a Playlist object, that contains information about the songs 
* in a playlist, a list of Songs. 
*
* USAGE: 
* java PA4Main - Spitify uses this class for the Songs
*/

import java.util.*;

public class Playlist {
	
	// Instance variables
	private String name;
	private List<Song> contents;
	
	/*
	* A constructor that initializes a Playlist object with the given playlist 
	* name. It also initializes the content of the playlist (a list of song objects).
	*
	* @param name, is the string representing the name of a playlist
	*/
	public Playlist(String name) {
		this.name = name;
		this.contents = new ArrayList<Song>();
	}
	
	/*
	* A constructor that initializes a Playlist object with the given playlist 
	* name and also initial song list. 
	* 
	* @param name, is the string representing the name of a playlist
	* @param contents, is a List of Song objects, representing the contents of a 
	* playlist
	*/
	public Playlist(String name, List<Song> contents) {
		this.name = name;
		this.contents = contents;
	}
	
	/*
	* A getter method that returns the playlist's name.
	*
	* @return name, is the string representing the name of the playlist
	*/
	public String getName() {
		return this.name;
	}
	
	/*
	* A setter method of sorts that adds a given song object to the playlist.
	*
	* @param song, is the Song object that is to be added to the playlist
	*/
	public void addSong(Song song) {
		this.contents.add(song);
	}
	
	/*
	* A method that iterates over the songs in the playlist and plays them all.
	* It calls the play method of each song in the playlist to do so.
	*/
	public void play() {
		for (Song song : this.contents) {
			song.play();
		}
	}
	
	/*
	* A setter method of sorts that removes a given song object from the playlist.
	*
	* @param song, is the Song object that is to be removed from the playlist
	*/
	public void removeSong(Song song) {
		this.contents.remove(song);
	}

}
