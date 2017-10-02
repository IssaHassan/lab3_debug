import java.util.ArrayList;
import java.util.List;
public class AddressBook {

	private List<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	public AddressBook(ArrayList<BuddyInfo> buddyList) {
		this.buddyList = buddyList;
	}
	
	public void addBuddy(BuddyInfo b) {
		if(b!=null)
			this.buddyList.add(b);
	}
	
	public BuddyInfo removeBuddy(int index) {

		if(index>=0&&index<this.buddyList.size()) {
			return this.buddyList.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		BuddyInfo i = new BuddyInfo("ABC","XYZ","613");
		AddressBook a = new AddressBook(new ArrayList<BuddyInfo>());
		a.addBuddy(i);
		a.removeBuddy(0);
		
	}
	
}
