/*
* AUTHOR: Kevin Nisterenko
* FILE: UserCollection.java
* ASSIGNMENT: Programming Assignment 4 - Spitify
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program defines the User class to be used in Spitify. 
* It defines the constructor and required methods according to the spec 
* to create an UserCollection object, which is used to store all the users 
* of a Spitify run, their number of playlists and login. 
*
* USAGE: 
* java PA4Main - Spitify uses this class for the Songs
*/


import java.util.*;

public class UserCollection {
	
	// Instance variables 
	private Set<User> users;
	
	/*
	* A constructor that initializes an empty UserCollection object.
	*/
	public UserCollection() {
		this.users = new HashSet<User>();
	}
	
	/*
	* A method that returns true if a given user exists in the collection 
	* and false otherwise. 
	* 
	* @param username, is the string representing a user to find in the collection
	* @return boolean, true if the username points to an existing User object,
	* false otherwise
	*/
	public boolean userExists(String username) {
		// Iterate over the users, if there is a user there with the given name, 
		// return true
		for (User user : users) {
			if (user.getName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	* A method that tries to login the given username account, if the login
	* was successful (user exists in the collection and password is valid), 
	* it returns the User object. Otherwise, the method returns null for invalid 
	* logins. 
	* 
	* @param username, is the string representing a user
	* @param password, is the string representing the password of a user
	* @return user or null, User object of the successful user login or null if the login
	* was not successful
	*/
	public User login(String username, String password) {
		// Iterates over the users, if the user of the given username is found and 
		// if the password matches, return the user/login successful
		for (User user : this.users) {
			if (user.getName().equals(username)) {
				if (user.attemptLogin(password)) {
					return user;
				}
			}
		}
		return null;
	}
	
	/*
	* A setter method of sorts that adds a given user object to the collection.
	*
	* @param add, is the User object that is to be added to the collection
	*/
	public void addUser(User add) {
		this.users.add(add);
	}
	
	/*
	* A method that returns the string representation of the collection, that is, all the 
	* users in the collection in alphabetical order with the number of playlists they have.
	* For this, the collection is passed to a TreeMap, where it is sorted, then the
    * return string is built using another loop for the alphabetical order and playlist number 
    * to be correctly concatenated. 
	* 
	* @return strRep, string representation of the user collection
	*/
	public String toString() {
		String strRep = "{ ";
		
		// Use TreeMap since it sorts automatically
		Map<String, Integer> usersMap = new TreeMap<String, Integer>();
		
		// Add each user object name as key and their playlist size as values in the 
		// TreeMap
		for (User user : this.users) {
			usersMap.put(user.getName(), user.getPlaylists().size());
		}
		
		// Iterate over the TreeMap and builf the return string
		for (String username : usersMap.keySet()) {
			strRep += username + ": " + usersMap.get(username) + " playlists, ";
		}
		
		return strRep + "}"; 
	}

}
