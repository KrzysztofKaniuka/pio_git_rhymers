package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFifoRhymer(), factory.getHanoiRhymer()};

        for (int externalIterator = 1; externalIterator < 15; externalIterator++)
            for (int internalIterator = 0; internalIterator < 3; internalIterator++)
                rhymers[internalIterator].countIn(externalIterator);

        java.util.Random rn = new java.util.Random();
        for (int iterator = 1; iterator < 15; iterator++)
            rhymers[3].countIn(rn.nextInt(20));

        for (int iterator = 0; iterator < rhymers.length; iterator++) {
            while (!rhymers[iterator].callCheck())
                System.out.print(rhymers[iterator].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

}