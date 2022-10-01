package com.javedhalani.bst.tests;

import com.javedhalani.bst.SameBST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SameBSTTests {

    @Test
    void test1() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2, 11);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 12, 11, 94, 81);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test2() {
        List<Integer> array1 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> array2 = List.of(1, 2, 3, 4, 5, 6, 7);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test3() {
        List<Integer> array1 = List.of(7, 6, 5, 4, 3, 2, 1);
        List<Integer> array2 = List.of(7, 6, 5, 4, 3, 2, 1);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test4() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 12, 94, 81);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test5() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2);
        List<Integer> array2 = List.of(11, 8, 5, 15, 2, 12, 94, 81);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test6() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2, -1, 100, 45, 12, 8, -1, 8, 2, -34);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test7() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2, -1, 101, 45, 12, 8, -1, 8, 2, -34);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }


    @Test
    void test8() {
        List<Integer> array1 = List.of(5, 2, -1, 100, 45, 12, 8, -1, 8, 10, 15, 8, 12, 94, 81, 2, -34);
        List<Integer> array2 = List.of(5, 8, 10, 15, 2, 8, 12, 45, 100, 2, 12, 94, 81, -1, -1, -34, 8);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test9() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2, -1, 100, 45, 12, 9, -1, 8, 2, -34);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 9, 12, 45, 100);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test10() {
        List<Integer> array1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> array2 = List.of(1, 2, 3, 4, 5, 6, 7);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test11() {
        List<Integer> array1 = List.of(7, 6, 5, 4, 3, 2, 1);
        List<Integer> array2 = List.of(7, 6, 5, 4, 3, 2, 1, 0);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test12() {
        List<Integer> array1 = List.of(10, 15, 8, 12, 94, 81, 5, 2, 10);
        List<Integer> array2 = List.of(10, 8, 5, 15, 2, 10, 12, 94, 81);
        Assertions.assertFalse(SameBST.sameBsts(array1, array2));
    }

    @Test
    void test13() {
        List<Integer> array1 = List.of(50, 76, 81, 23, 23, 23, 100, 56, 12, -1, 3);
        List<Integer> array2 = List.of(50, 76, 81, 23, 23, 23, 100, 56, 12, -1, 3);
        Assertions.assertTrue(SameBST.sameBsts(array1, array2));
    }



}
