package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/16 15:22
 */
public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void groupAnagrams() {
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList("ate", "eat", "tea")));
        lists.add(new ArrayList<>(Arrays.asList("nat","tan")));
        lists.add(new ArrayList<>(Arrays.asList("bat")));

        assertThat(lists, is(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }
}