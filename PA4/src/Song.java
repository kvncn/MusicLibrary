/*
* AUTHOR: Kevin Nisterenko
* FILE: Song.java
* ASSIGNMENT: Programming Assignment 4 - Spitify
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program defines the Song class to be used in Spitify. 
* It defines the constructor and required methods according to the spec 
* to create a Song object, containing information about times played, name 
* of the artist and also title of the song. 
*
* USAGE: 
* java PA4Main - Spitify uses this class for the Songs
*/

public class Song {
	
	// Instance variables 
	private String title;
	private String artist;
	private int timesPlayed;
	
	/*
	* A constructor that initializes a Song object with the given title and 
	* artist. It also initializes the times the song has been played (always begins 
	* at 0).
	*
	* @param title, is the string representing the title of a song in the file
	* @param artist, is the string representing the name of an artist in the file
	*/ 
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		this.timesPlayed = 0;
	}
	
	/*
	* A getter method that returns the Song title.
	*
	* @return title, is the string representing the title of the song object
	*/
	public String getTitle() {
		return this.title;
	}
	
	/*
	* A getter method that returns the Song's artist.
	*
	* @return artist, is the string representing the artist of the song object
	*/
	public String getArtist() {
		return this.artist;
	}
	
	/*
	* A getter method that returns the number of times the song has been played.
	*
	* @return timesPlayed, is the integer representing number of times a song has 
	* been played
	*/
	public int getTimesPlayed() {
		return this.timesPlayed;
	}
	
	/*
	* A method that increments the number of times a song has been played and prints 
	* out the information of the song. 
	*/
	public void play() {
		System.out.println(this.toString());
		this.timesPlayed += 1;
	}
	
	/*
	* A method that returns the string representation of a song object, it includes 
	* the title, artist and also times played. 
	* 
	* @return string representation of the song
	*/
	public String toString() {
		return this.title + " by " + this.artist + ", " + this.timesPlayed + " play(s)";
	}
}
