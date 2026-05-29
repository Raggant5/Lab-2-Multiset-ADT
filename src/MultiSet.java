/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);
    // How to say the equivalent of "Raise not Implemented error"

    /**
     * Remove the given item from this multiset.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);
    /**
     * Check if item is in this multiset.
     *
     * @param item the item we are looking for in multiset
     */
    abstract boolean contains(Integer item);

    /**
     * Check if the multiset is empty.
     */
    abstract boolean is_empty();

    /**
     * return number of item in this multiset
     *
     * @param item the item to count
     */
    abstract int count(Integer item);

    /**
     * Return how many items are in the entire multiset.
     */
    abstract int size();
}
