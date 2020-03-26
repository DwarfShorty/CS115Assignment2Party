
public class BSTNodeMain {

	public static void main(String[] args) {
		String[] interests = {"Golf", "Birdwatching"};
		String[] activitiesAndGroups = {"Golfing For Old Farts", "Birdspotting Guide", "Birdwatchers Local"};
		Profile p = new Profile("Doe", "John", 19, 1, 2012, "john@email.com", interests, activitiesAndGroups);
		Profile q = new Profile("Doe", "Jane", 1, 1, 2000, "jane@email.com", interests, activitiesAndGroups);
		Profile r = new Profile("Smith", "Jack", 31, 12, 1997, "jack@email.com", interests, activitiesAndGroups);
		
		BSTNode n = new BSTNode(p);
		BSTNode o = new BSTNode(q);
		BSTNode l = new BSTNode(r);
		
		n.setL(o);
		n.setR(l);
		
		if(n.getL() == o) {
			System.out.println("left node correctly set and retrieved");
		}
		if(n.getR() == l) {
			System.out.println("right node correctly set and retrieved");
		}
		if(n.getProfile() == p) {
			System.out.println("profile correctly set and retrieved");
		}

	}

}
