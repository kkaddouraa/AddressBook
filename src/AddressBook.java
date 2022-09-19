// Lab 2
// Kareem Kaddoura (101140255)
// September 19, 2022

import java.util.ArrayList;

public class AddressBook
{
    // The buddies in this address book.
    private ArrayList<BuddyInfo> buddyBook;

    /**
     * Creates an address book containing buddies and their information.
     */
    public AddressBook()
    {
        buddyBook = new ArrayList();
    }

    /**
     * Adds a buddy's info to the address book.
     */
    public void addBuddy(BuddyInfo buddy)
    {
        buddyBook.add(buddy);
    }

    /**
     * Removes a buddy's info from the address book.
     */
    public void removeBuddy(BuddyInfo buddy)
    {
        buddyBook.remove(buddy);
    }

    /**
     * Prints "Address Book".
     */
    public static void main(String[] args)
    {
        System.out.println("Address Book");
        AddressBook book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo();

        book.addBuddy(buddy);
        System.out.println("The buddy has been added.");
        book.removeBuddy(buddy);
        System.out.println("The buddy has been removed.");
    }
}
