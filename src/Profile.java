import java.util.ArrayList;

/**
 * Profile.java
 * @author benfr
 * @version 1.0
 */
public class Profile {
	private String lastName;
	private String firstName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private String email;
	private String[] interests;
	private String[] activitiesAndGroups;
	private ArrayList<Profile> friends = new ArrayList<Profile>();
	
	/**
	 * Constructor
	 * @param lastName
	 * @param firstName
	 * @param birthDay
	 * @param birthMonth
	 * @param birthYear
	 * @param email
	 * @param interests
	 * @param activitiesAndGroups
	 */
	public Profile(String lastName, String firstName, int birthDay, int birthMonth, int birthYear,
			String email, String[] interests, String[] activitiesAndGroups) {
		
	}
	
	//SETTERS
	/**
	 * setter for lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * setter for firstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * setter for birthDay
	 * @param birthDay
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	/**
	 * setter for birthMonth
	 * @param birthMonth
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	/**
	 * setter for birthYear
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * setter for email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * setter for array interests
	 * @param interests
	 */
	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	
	/**
	 * setter for array activitiesAndGroups
	 * @param activitiesAndGroups
	 */
	public void setActivitiesAndGroups(String[] activitiesAndGroups) {
		this.activitiesAndGroups = activitiesAndGroups;
	}

	//GETTERS
	/**
	 * getter for lastName
	 * @return this.lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * getter for firstName
	 * @return this.firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * getter for birthDay
	 * @return this.birthDay
	 */
	public int getBirthDay() {
		return this.birthDay;
	}
	
	/**
	 * getter for birthMonth
	 * @return this.birthMonth
	 */
	public int getBirthMonth() {
		return this.birthMonth;
	}
	
	/**
	 * getter for birthYear
	 * @return this.birthYear
	 */
	public int getBirthYear() {
		return this.birthYear;
	}
	
	/**
	 * getter for email
	 * @return this.email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * getter for array interests
	 * @return this.interests
	 */
	public String[] getInterests() {
		return this.interests;
	}
	
	/**
	 * getter for array activitiesAndGroups
	 * @return this.activitiesAndGroups
	 */
	public String[] getActivitiesAndGroups() {
		return this.activitiesAndGroups;
	}
	
	/**
	 * getter for DoB as a String
	 * format dd/MM/YYYY
	 * @return "this.birthDay/this.birthMonth/this.birthYear"
	 */
	public String getDateOfBirth() {
		return String.format("%d/%d/%d", this.birthDay, this.birthMonth, this.birthYear);
	}
	
	//NON-GETSET METHODS
		//METHODS FOR ARRAYLIST FRIENDS
	/**
	 * add a Profile to the ArrayList friends
	 * @param p
	 */
	public void addFriend(Profile p) {
		friends.add(p);
	}
	
	/**
	 * gets a Profile from ArrayList friends at position i
	 * @param i
	 * @return friends.get(i)
	 */
	public Profile getFriend(int i) {
		return friends.get(i);
	}
	
	/**
	 * gets the number of Profiles in the ArrayList friends
	 * @return friends.size()
	 */
	public int numOfFriends() {
		return friends.size();
	}
	
	//DEBUGGNG METHODS (NOT FOR USE IN FINAL PROGRAM)
	public String toString() {
		String s;
		
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
