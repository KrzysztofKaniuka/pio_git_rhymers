package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static class node
    {

        public final int value;
        public node prev, next;

        public node(int i) {
            value = i;
        }

    }

    public static final int EMPTY = -1;
    node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new node(i);
        else {
            last.next = new node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
