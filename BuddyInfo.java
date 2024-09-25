/**
 * Lab 1
 * Kareem Kaddoura (101140255)
 * Sep. 12, 2024
 */

public class BuddyInfo {

    private String name; // Buddy name
    private String address; // Buddy address
    private int phone; // Buddy #

    private static final String DEFAULT_NAME = "John"; // Default buddy name
    private static final String DEFAULT_ADDRESS = "123 County Rd."; // Default buddy address
    private static final int DEFAULT_PHONE = 1234567890; // Default buddy #

    /**
     * Create default buddy.
     */
    public BuddyInfo() {
        this.name = DEFAULT_NAME;
        this.address = DEFAULT_ADDRESS;
        this.phone = DEFAULT_PHONE;
    }

    /**
     * Create buddy.
     *
     * @param name
     * @param address
     * @param phone
     */
    public BuddyInfo(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get address.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get phone.
     *
     * @return phone
     */
    public int getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Baseline Rd.", 1234567890);
        System.out.println("Hello " + buddy.getName() + "!");
    }
}