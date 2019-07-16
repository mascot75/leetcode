package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/16 15:57
 */
public class ValidAnagramTest {

    private ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void isAnagram() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}