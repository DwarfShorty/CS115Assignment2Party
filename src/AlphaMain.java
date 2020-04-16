
public class AlphaMain {

	public static void main(String[] args) {
		/*
		 * Taken from BSTMain.java
		 */
		String[] interests = {"Golf", "Birdwatching"};
		String[] activitiesAndGroups = {"Golfing For Old Farts", "Birdspotting Guide", "Birdwatchers Local"};
		Profile a = new Profile("Anderson", "Amy", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile b = new Profile("Builder", "Bob", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile c = new Profile("Chocolate", "Charlie", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile d1 = new Profile("Donalds", "Dave", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile d2 = new Profile("Donalds", "Drew", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile e = new Profile("Ellis", "Emma", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		Profile f = new Profile("Francis", "Felix", 10, 10, 2000, "address@email.com", interests, activitiesAndGroups);
		
		
		BST bin = new BST();
		
		bin.insertProfile(c);
		bin.insertProfile(b);
		bin.insertProfile(d2);
		bin.insertProfile(a);
		bin.insertProfile(d1);
		bin.insertProfile(f);
		bin.insertProfile(a);
		bin.insertProfile(e);
		
		/*
		 * Test method result:
		 * 	Anderson, Amy
		 * 	Anderson, Amy
		 * 	Builder, Bob
		 * 	Chocolate, Charlie
		 * 	Donalds, Dave
		 * 	Donalds, Drew
		 * 	Ellis, Emma
		 * 	Francis, Felix
		 */
		bin.printAlphabetical();

	}

}
