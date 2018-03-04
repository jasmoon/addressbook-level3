package seedu.addressbook.data.person;

/**
 * A printable interface for objects that require details to be printed in addressbook.
 * Implementations should guarantee: a printable string
 */
public interface Printable {
    /**
     * Returns a concatenated version of the printable strings of each object.
     */
    public String getPrintableString();
}
