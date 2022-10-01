package com.javedhalani.bst.tests;

import com.javedhalani.bst.RightSmallerThan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RightSmallerThanTest {

    @Test
    public void test1() {
        Integer[] array = new Integer[]{8, 5, 11, -1, 3, 4, 2};
        Integer[] expected = new Integer[]{5, 4, 4, 0, 1, 1, 0};
        Integer[] actual = RightSmallerThan.rightSmallerThan(Arrays.stream(array).toList()).toArray(new Integer[0]);
        Assertions.assertArrayEquals(expected, actual);
    }

}
