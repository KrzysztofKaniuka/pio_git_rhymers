package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int EMPTY = -1;
    public static final int FULL = 11;
    public static final int ERROR = -1;
    private final int[] numbers = new int[SIZE];


    private int total = EMPTY;
    
    public int getTotal() 
    {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
