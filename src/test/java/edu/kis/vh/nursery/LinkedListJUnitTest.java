package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Test;
import org.junit.Assert;

public class LinkedListJUnitTest
{
    @Test
    public void testIsEmpty()
    {
        IntLinkedList list=new IntLinkedList();
         final boolean EMPTY=true;
         boolean result=list.isEmpty();
         Assert.assertEquals(EMPTY,result);
         list.push(5);
         result= list.isEmpty();
         Assert.assertEquals(!EMPTY,result);
    }

    @Test
    public void testPush()
    {
        IntLinkedList list = new IntLinkedList();
        int value=5;
        list.push(5);
        int result =list.pop();
        Assert.assertEquals(value,result);
    }

    @Test
    public void testPop()
    {
        IntLinkedList list = new IntLinkedList();
        for(int i=0;i<5;i++)
            list.push(i);
        for(int i=4;i>=0;i--)
            Assert.assertEquals(i,list.pop());
        final int EMPTY=-1;
        Assert.assertEquals(EMPTY,list.pop());
    }

    @Test
    public void testTop()
    {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY = -1;
        Assert.assertEquals(EMPTY,list.top());
        int value=5;
        list.push(value);
        Assert.assertEquals(value,list.top());
        Assert.assertEquals(value,list.top());
    }

    @Test
    public void testIsFull()
    {
        final boolean EXPECTED=false;
        IntLinkedList list = new IntLinkedList();
        boolean result=list.isFull();
        Assert.assertEquals(EXPECTED,result);
        list.push(5);
        result=list.isFull();
        Assert.assertEquals(EXPECTED,result);
        for(int i=0;i<12;i++)
            list.push(i);
        result=list.isFull();
        Assert.assertEquals(EXPECTED,result);
    }


}
