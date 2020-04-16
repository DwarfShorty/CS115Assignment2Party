
public class FileReaderMain {

	public static void main(String[] args) {
		BST tree = new BST();
		FileReader read = new FileReader();
		tree = read.readProfileSet("profilesFRTest.txt");
		
		//break placed here to check variables in debug mode
		//FileReader reads "profilesFRTest.txt" in correctly
		//and places it in the tree as shown below
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
