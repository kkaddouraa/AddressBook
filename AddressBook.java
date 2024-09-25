/**
 * Lab 2
 * Kareem Kaddoura (101140255)
 * Sep. 19, 2024
 */

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> book;

    /**
     * Create address book.
     */
    public AddressBook() {
        book = new ArrayList<>();
    }

    /**
     * Add buddy to book.
     */
    public void addBuddy(BuddyInfo buddy) {
        book.add(buddy);
        System.out.println(buddy.getName() + " has been added.");}

    /**
     * Remove buddy from book.
     */
    public void removeBuddy(BuddyInfo buddy) {
        book.remove(buddy);
        System.out.println(buddy.getName() + " has been removed.");}

    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook ab = new AddressBook();
        BuddyInfo buddy = new BuddyInfo();

        ab.addBuddy(buddy);
        ab.removeBuddy(buddy);

        // Lab 3 Step 17
    }
}
