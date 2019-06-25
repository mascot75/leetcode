package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/6/25 16:20
 */
public class JumpGameTest {

    private JumpGame game = new JumpGame();

    @Test(timeout = 1000)
    public void canJump() {
        assertTrue(game.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(game.canJump(new int[]{3, 2, 1, 0, 4}));
        assertTrue(game.canJump(new int[]{3, 2, 1, 0}));
        assertFalse(game.canJump(new int[]{0, 4}));
        assertTrue(game.canJump(new int[]{0}));
        assertFalse(game.canJump(new int[]{2, 0, 1, 0, 1}));
    }
}