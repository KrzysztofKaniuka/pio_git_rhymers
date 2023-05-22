package edu.kis.vh.nursery.list;

/**
 * Implements simple doubly linked list with the node type of int
 */
public class IntLinkedList {

    /**
     * Implements a node structure of given mentioned list
     */
    private static class Node
    {

        public final int value;
        public Node prev, next;

        /**
         * @param i value to set to node
         * Defines node value
         */
        public Node(int i) {
            value = i;
        }

    }

    public static final int EMPTY = -1;
    Node last;
    int i;

    /**
     * @param i value we want to add to the list
     * Inserts new element to the list, by creating new node
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * @return true - list empty / false - list not empty
     * Checks if list is empty or not.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return false (there's no limitation for list size)
     * Checks if list reached its maximum capacity.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return lastly added value (int) / -1 if list is empty
     * Gives back lastly added value not removing it from the list
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.value;
    }

    /**
     * @return lastly added value (int) / -1 if list is empty
     * Gives back lastly added value and removes it from the list
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
