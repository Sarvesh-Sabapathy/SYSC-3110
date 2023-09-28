public class BuddyInfo {

    /**variables*/
    private String name;
    private String address;
    private String phoneNumber;

    /**getters*/
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**default constructor*/
    public BuddyInfo() {
        name = "";
        address = "";
        phoneNumber = "";
    }

    /**overloaded constructor*/
    public BuddyInfo(String phoneNumber,String name, String address ) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        BuddyInfo newBuddy = new BuddyInfo("","Homer","");
        System.out.println("Hello, " + newBuddy.getName());
    }
}
