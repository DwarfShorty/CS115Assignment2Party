
public class BSTMain {

	public static void main(String[] args) {
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
		
		//break placed here to check variables in debug mode
		//BST bin correctly places in tree as seen below
		/*
		 * 1								Charlie
		 * 								 /			  \
		 * 2						Bob					Drew
		 * 						 /					 /		  \
		 * 3				Amy					Dave			Felix
		 * 				 /									   /
		 * 4		Amy										Emma
		 */
		System.out.println();
		

	}

}
