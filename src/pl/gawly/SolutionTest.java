package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(new int[]{1}));
    }

    @Test
    public void testEx1() {
        Assert.assertEquals(1, s.solution(new int[]{-10, -10}));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(0, s.solution(new int[]{-10, 10}));
    }

    @Test
    public void testEx3() {
        Assert.assertEquals(2, s.solution(new int[]{4, 3, 4, 4, 4, 2}));
    }

    @Test
    public void testEx4() {
        Assert.assertEquals(3, s.solution(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testEx5() {
        Assert.assertEquals(4, s.solution(new int[]{1, 1, 1, 1, 1}));
    }

}
