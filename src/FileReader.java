import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * FileReader.java
 * @author benfr
 * @version 1.0
 */
public class FileReader {
	/**
	 * from a file reads in a list of profiles to return a 
	 * binary search tree sorted by name, 
	 * each line of the file must conform to:
	 * <Surname>,<First Name>,<DD>,<MM>,<YYYY>,<email>,
	 * <interest 1>;<interest n>,<activity 1>;<activity n>
	 * @param filename
	 * @return profilesTree
	 */
	public static BST readProfileSet(String filename) {
		//open file
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println(filename + " not found.");
			System.exit(0);
		}
		BST profilesTree = new BST();
		//get profile
		String stringProfile;
		Profile p;
		while(in.hasNextLine()){
			stringProfile = in.nextLine();
			p = readProfile(stringProfile);
			profilesTree.insertProfile(p);
		}
		in.close();
		return profilesTree;
	}
	
	/**
	 * turns a string into a profile. the string must conform to: 
	 * <Surname>,<First Name>,<DD>,<MM>,<YYYY>,<email>,
	 * <interest 1>;<interest n>,<activity 1>;<activity n>
	 * @param profile
	 * @return new Profile()
	 */
	private static Profile readProfile(String profile) {
		Scanner in = new Scanner(profile);
		in.useDelimiter(",");
		String surname = in.next();
		String firstName = in.next();
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		String email = in.next();
		String[] interests = readList(in.next());
		String[] activities = readList(in.next());
		in.close();
		return new Profile(surname, firstName, day, month, year, email, interests, activities);
	}
	
	/**
	 * turns a string into a list of strings using ";" delimiter
	 * @param l
	 * @return array
	 */
	private static String[] readList(String l) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(l);
		in.useDelimiter(";");
		int counter = 0;
		while(in.hasNext()) {
			list.add(in.next());
			counter++;
		}
		String[] array = new String[counter];
		list.toArray(array);
		in.close();
		return array;
	}
}
