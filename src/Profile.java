import java.util.ArrayList;
import java.util.regex.Pattern;

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
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.setBirthMonth(birthMonth);
		this.setBirthDay(birthDay);
		this.setEmail(email);
		this.interests = interests;
		this.activitiesAndGroups = activitiesAndGroups;
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
	public void setBirthDay(int birthDay) throws IllegalArgumentException {
		//is day a natural number
		if(birthDay <= 0) {
			throw new IllegalArgumentException();
		}
		//is the month one with 31 days
		if(this.birthMonth == 1 || this.birthMonth == 3 || this.birthMonth == 5 || this.birthMonth == 7 ||
				this.birthMonth == 8 || this.birthMonth == 10 || this.birthMonth == 12) {
			//is the day in the month
			if(birthDay <= 31) {
				this.birthDay = birthDay;
			} else {
				throw new IllegalArgumentException();
			}
		} else if(this.birthMonth != 2) {	//is the month one with 30 days
			//is the day in the month
			if(birthDay <= 30) {
				this.birthDay = birthDay;
			} else {
				throw new IllegalArgumentException();
			}
		} else {	//the month must be February
			if(birthDay <= 28) {
				this.birthDay = birthDay;
			} else if(birthDay == 29) {
				//is the year a leap year
				if(this.birthYear % 4 == 0) {
					if(this.birthYear % 100 == 0) {
						if(this.birthYear % 400 == 0) {
							this.birthDay = birthDay;
						} else {
							throw new IllegalArgumentException();
						}
					} else {
						this.birthDay = birthDay;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				throw new IllegalArgumentException();
			}
			
		}
	}
	
	/**
	 * setter for birthMonth
	 * @param birthMonth
	 */
	public void setBirthMonth(int birthMonth) throws IllegalArgumentException {
		if(birthMonth > 0 && birthMonth <= 12) {
			this.birthMonth = birthMonth;
		} else {
			throw new IllegalArgumentException();
		}
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
	public void setEmail(String email) throws IllegalArgumentException {
		//regex of at least one letter char, the '@' symbol, least one letter char, the '.' symbol, least one letter char, one or none '.' symbol, none or more letter char
		String regex = "\\w+[@]\\w+[.]\\w+[.]?\\w*";
		if(email.matches(regex)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException();
		}
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
	/**
	 * format profile data to readable string format
	 */
	public String toString() {
		String s = "-----START  REPORT-----";
		s += String.format("Name: %s, %s\n", lastName, firstName);
		s += String.format("DoB: %s\n", getDateOfBirth());
		s += String.format("Email Address: %s\n", email);
		s += "Interests:\n";
		for (String item : interests) {
			s += String.format("  - %s\n", item);
		}
		s += "Activities and Groups:\n";
		for (String item : activitiesAndGroups) {
			s += String.format("  - %s\n", item);
		}
		s += "Friends:\n";
		for (Profile profile : friends) {
			s += String.format("  - Friend Name: %s, %s\n", profile.lastName, profile.firstName);
		}
		s += "-----END OF REPORT-----";
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
