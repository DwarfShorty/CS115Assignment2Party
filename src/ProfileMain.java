
public class ProfileMain {

	public static void main(String[] args) {
		String[] interests = {"Golf", "Birdwatching"};
		String[] activitiesAndGroups = {"Golfing For Old Farts", "Birdspotting Guide", "Birdwatchers Local"};
		Profile p = new Profile("Doe", "John", 0, 0, 0, "address@email.com", interests, activitiesAndGroups);
		
		//DoB testing
		p.setBirthYear(1997);
		p.setBirthMonth(1);
		p.setBirthDay(31);
		System.out.println(p.getDateOfBirth());
		try {
			p.setBirthDay(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e + "\nException correctly thrown");
			
		}
		p.setBirthMonth(2);
		System.out.println(p.getDateOfBirth());
		try {
			p.setBirthDay(29);
		} catch (IllegalArgumentException e) {
			System.out.println(e + "\nException correctly thrown");
		}
		p.setBirthDay(28);
		System.out.println(p.getDateOfBirth());
		p.setBirthYear(2020);
		System.out.println(p.getDateOfBirth());
		p.setBirthDay(29);
		System.out.println(p.getDateOfBirth());
		try {
			p.setBirthDay(30);
		} catch (IllegalArgumentException e) {
			System.out.println(e + "\nException correctly thrown");
		}
		System.out.println(p.getDateOfBirth());
		
		//email testing
		p.setEmail("address@email.com");
		System.out.println(p.getEmail());
		p.setEmail("address@email.co.uk");
		System.out.println(p.getEmail());
		try {
			p.setEmail("notAnEmail");
		} catch (IllegalArgumentException e) {
			System.out.println(e + "\nException correctly thrown");
		}
		

	}

}
