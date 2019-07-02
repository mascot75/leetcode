package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/1 19:23
 */
public class PermutationSequenceTest {

    private PermutationSequence sequence = new PermutationSequence();

    @Test
    public void getPermutation() {
        assertEquals("213", sequence.getPermutation2(3, 3));
        assertEquals("2314", sequence.getPermutation(4, 9));
    }
}