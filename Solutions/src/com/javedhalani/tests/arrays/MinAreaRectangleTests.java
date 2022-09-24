package com.javedhalani.tests.arrays;

import com.javedhalani.arrays.MinAreaRectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAreaRectangleTests {

    @Test
    void test1() {

        int[][] points = {
                {1, 5},
                {5, 1},
                {4, 2},
                {2, 4},
                {2, 2},
                {1, 2},
                {4, 5},
                {2, 5},
                {-1, -2}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test2() {

        int[][] points = {
                {-4, 4},
                {4, 4},
                {4, -2},
                {-4, -2},
                {0, -2},
                {4, 2},
                {0, 2}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 16;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test3() {

        int[][] points = {
                {-4, 4},
                {4, 4},
                {4, -2},
                {-4, -2},
                {0, -2},
                {4, 2},
                {0, 2},
                {0, 4},
                {2, 3},
                {0, 3},
                {2, 4}

        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test4() {

        int[][] points = {
                {0, 0},
                {4, 4},
                {8, 8},
                {0, 8}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test5() {

        int[][] points = {
                {0, 0},
                {4, 4},
                {8, 8},
                {0, 8},
                {0, 4},
                {6, 0},
                {6, 4}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 24;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test6() {

        int[][] points = {
                {0, 0},
                {4, 4},
                {8, 8},
                {0, 8},
                {0, 4},
                {6, 0},
                {6, 4},
                {8, 0},
                {8, 4},
                {6, 2},
                {2, 4},
                {2, 0}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test7() {

        int[][] points = {
                {0, 0},
                {1, 1},
                {2, 2},
                {-1, -1},
                {-2, -2},
                {-1, 1},
                {-2, 2},
                {1, -1},
                {2, -2}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 4;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test8() {

        int[][] points = {
                {0, 1},
                {0, 0},
                {2, 1},
                {2, 0},
                {4, 0},
                {4, 1},
                {0, 2},
                {2, 2},
                {4, 2},
                {6, 0},
                {6, 1},
                {6, 2},
                {7, 1},
                {7, 0}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test9() {

        int[][] points = {
                {0, 1},
                {0, 0},
                {2, 1},
                {2, 0},
                {4, 0},
                {4, 1},
                {0, 2},
                {2, 2},
                {4, 2},
                {6, 0},
                {6, 1},
                {6, 2},
                {7, 1}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test10() {

        int[][] points = {
                {100, 100},
                {76, 67},
                {-100, 100},
                {65, 76},
                {100, -100},
                {3, 4},
                {-100, -100},
                {5, 6},
                {78, 54},
                {-87, 7},
                {1, 4},
                {4, 1},
                {-1, 5}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 40000;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test11() {

        int[][] points = {};
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test12() {

        int[][] points = {
                {1, 2},
                {4, 2}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test13() {

        int[][] points = {
                {2, 2},
                {3, 2},
                {4, 2}
        };
        int actual = MinAreaRectangle.minAreaRectangle(points);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
