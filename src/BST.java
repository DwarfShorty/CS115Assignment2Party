/**
 * BST.java
 * @author benfr
 * @version 1.0
 */
public class BST {
	//DO NOT ADD A getRoot() METHOD
	private BSTNode root;
	
	/**
	 * Constructor
	 */
	public BST() {
		root = null;
	}
	
	/**
	 * inserts a Profile according to a binary search tree
	 * @param p
	 */
	public void insertProfile(Profile p) {
		BSTNode temp = new BSTNode(p);
		if(root == null) {
			root = temp;
		} else {
			recInsertProfile(root, temp);
		}
	}
	
	/**
	 * recursive method to insert a profile to the binary search tree
	 * @param node
	 * @param temp
	 */
	private void recInsertProfile(BSTNode node, BSTNode temp) {
		//is node last name lower alphabetically to temp last name
		if(node.getProfile().getLastName().compareTo(temp.getProfile().getLastName()) > 0) {
			if(node.getL() == null) {
				node.setL(temp);
			} else {
				recInsertProfile(node.getL(), temp);
			}
		//is node last name equal alphabetically to temp last name
		} else if(node.getProfile().getLastName().compareTo(temp.getProfile().getLastName()) == 0) {
			//is node first name lower or equal alphabetically to temp first name
			if (node.getProfile().getFirstName().compareTo(temp.getProfile().getFirstName()) >= 0) {
				if(node.getL() == null) {
					node.setL(temp);
				} else {
					recInsertProfile(node.getL(), temp);
				}
			//is node first name higher alphabetically to temp first name
			} else {
				if(node.getR() == null) {
					node.setR(temp);
				} else {
					recInsertProfile(node.getR(), temp);
				}
			}
		//is node last name higher alphabetically to temp last name
		} else {
			if(node.getR() == null) {
				node.setR(temp);
			} else {
				recInsertProfile(node.getR(), temp);
			}
		}
	}
	

}
