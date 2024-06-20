package edu.kis.vh.nursery;

/**
 * Resporesent a Rhymer of type Hanoi
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Reports a number of rejected elements
     * @return number of rejected elements
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds element to the stack
     * @param in element to be added to the stack
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}
