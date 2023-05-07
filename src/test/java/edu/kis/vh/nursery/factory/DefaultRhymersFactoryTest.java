package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

import org.junit.Assert;
import org.junit.Test;

public class DefaultRhymersFactoryTest {

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertTrue(rhymer.callCheck());
        rhymer.countIn(1);
        Assert.assertFalse(rhymer.callCheck());
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertFalse(rhymer.isFull());
        for (int i = 0; i < 12; i++) {
            rhymer.countIn(i);
        }
        Assert.assertTrue(rhymer.isFull());
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertEquals(-1, rhymer.countOut());
        rhymer.countIn(1);
        rhymer.countIn(2);
        Assert.assertEquals(2, rhymer.countOut());
        Assert.assertEquals(1, rhymer.countOut());
        Assert.assertEquals(-1, rhymer.countOut());
    }

}
