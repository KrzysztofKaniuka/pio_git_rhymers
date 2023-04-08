package edu.kis.vh.nursery;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
        
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