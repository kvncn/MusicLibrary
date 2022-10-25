/*
* AUTHOR: Kevin Nisterenko
* FILE: User.java
* ASSIGNMENT: Programming Assignment 4 - Spitify
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program defines the User class to be used in Spitify. 
* It defines the constructor and required methods according to the spec 
* to create an User object, which is used to login/create a new user account. 
* It also contains information about any playlists created by that user. 
*
* USAGE: 
* java PA4Main - Spitify uses this class for the Songs
*/

import java.util.*;

public class User {
	
	// Instance variables
	private String name;
	private String password;
	private List<Playlist> playlists;
	
	/*
	* A constructor that initializes an User object with the given user name and 
	* password. It also initializes a List of the user's playlists.
	*
	* @param name, is the string representing an username
	* @param password, is the string representing an user password
	*/
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.playlists = new ArrayList<Playlist>();
	}
	
	/*
	* A getter method that returns the user's name.
	*
	* @return name, is the string representing username
	*/
	public String getName() {
		return this.name;
	}
	
	/*
	* A getter method of sorts that returns true if the given password 
	* is the same as the user's password (successful login) and false 
	* otherwise. 
	* 
	* @param password, is the string representing a attempted password
	* @return boolean, true if the login is successful, false otherwise
	*/
	public boolean attemptLogin(String password) {
		return password.equals(this.password);
	}
	
	/*
	* A setter method of sorts that adds a Playlist object to the user list of 
	* playlists.
	*
	* @param newPlaylist, is the Playlist object that represents a new playlist 
	*/
	public void addPlaylist(Playlist newPlaylist) {
		this.playlists.add(newPlaylist);
	}
	
	/*
	* A getter method that returns the list of playlists a user has. 
	* 
	* @return playlists, is the List of Playlist objects a user has
	*/
	public List<Playlist> getPlaylists() {
		return this.playlists;
	}
	
	/*
	* A method that iterates over the user's playlists and plays the 
	* playlist specified by the name param.  
	* 
	* @param name, is the string representing the name of a playlist
	*/
	public void selectPlaylist(String name) {
		for (Playlist playlist : this.playlists) {
			if (playlist.getName().equals(name)) {
				playlist.play();
			}
		}
	}
	
	/*
	* A method that returns the string representation of an user, that is, the user's 
	* name and the number of playlists they currently have. 
	* 
	* @return string representing an User object
	*/
	public String toString() {
		int numPlaylists = this.playlists.size();
		
		return this.name + ", " + numPlaylists + " playlists";
	}

}
