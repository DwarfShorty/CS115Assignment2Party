/**
 * BSTNode.java
 * @author benfr
 * @version 1.0
 */
public class BSTNode {
	private Profile data;
	private BSTNode l = null;
	private BSTNode r = null;
	
	/**
	 * Constructor
	 * @param data
	 */
	public BSTNode(Profile data) {
		this.data = data;
	}
	
	/**
	 * setter for left node l
	 * @param l
	 */
	public void setL(BSTNode l) {
		this.l = l;
	}
	
	/**
	 * setter for right node r
	 * @param r
	 */
	public void setR(BSTNode r) {
		this.r = r;
	}
	
	/**
	 * getter for left node l
	 * @return this.l
	 */
	public BSTNode getL() {
		return this.l;
	}
	
	/**
	 * getter for right node r
	 * @return this.r
	 */
	public BSTNode getR() {
		return this.r;
	}
	
	/**
	 * getter for Profile data
	 * @return data
	 */
	public Profile getProfile() {
		return this.data;
	}
	
	
	
	
	

}
