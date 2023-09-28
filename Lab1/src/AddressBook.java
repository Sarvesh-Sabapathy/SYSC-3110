import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public AddressBook(List buddyList){}

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyList.remove(buddy);
    }

    public static void main(String[] args) {
        //System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("613","Tom","Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
//new text 
