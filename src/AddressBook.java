/*
 * Lab 2
 * Author: Amandeep Singh
 * SYSC 3110 L2
 * 101039656
 */
import java.util.*;
//new one


public class AddressBook {
	
	private ArrayList <BuddyInfo> buddyInfo = new ArrayList<BuddyInfo>(); //Arraylist that stores the buddy fields
	
	/*
	 * Add method to add the buddy fields
	 * Passing in a Buddyinfo object as parameter
	 */
	public void addBuddy(BuddyInfo aBuddyInfo) { 
		if(aBuddyInfo != null) { //if the object is not null add the add it in the arraylist
			buddyInfo.add(aBuddyInfo);//add the buddy fields
		}
	}
	
	/*
	 * Remove method to remove the buddy fields
	 * takes in the index as parameter
	 */
	
	public void removeBuddy(int index) { 
			if(index >=0 && index < buddyInfo.size()) { //if the object is in the Arraylist then remove it
				buddyInfo.remove(index);//remove the particular index
			}
	}
	
	public static void main(String args) { //Main method
		
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");//create a new buddy object
		AddressBook addressBook = new AddressBook();// creates a new addressBook object
		addressBook.addBuddy(buddy);// testing the add function
		addressBook.removeBuddy(0);//testing the remove function
	}
	
	
	}


