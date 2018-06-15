package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// N is [2..100,000];
// A_i [−1,000..1,000].
class SolutionTest {

    @Test
    public void small() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void twoElements() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{3, 4}));
    }


}