
import java.util.*;

public class AddressBook {
	
	private ArrayList <Buddyinfo>buddyInfo = new ArrayList<Buddyinfo>(); 
	
	
	public void addBuddy(Buddyinfo aBuddyInfo) {
		
		if(aBuddyInfo != null) {
			buddyInfo.add(aBuddyInfo);
		}
	}
	
	
	public void removeBuddy(int index) {
			
			if(index >=0 && index < buddyInfo.size()) {
				buddyInfo.remove(index);
			}
	}
	
	public static void main(String args) {
		
		Buddyinfo buddy = new Buddyinfo("Tom", "Carleton","613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
	
	
	}


