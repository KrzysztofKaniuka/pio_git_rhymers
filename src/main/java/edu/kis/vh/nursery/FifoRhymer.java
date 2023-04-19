package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {


    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
