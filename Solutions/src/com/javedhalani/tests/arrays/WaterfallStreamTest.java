package com.javedhalani.tests.arrays;

import com.javedhalani.arrays.WaterfallStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WaterfallStreamTest {

    @Test
    void test1() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 3;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{0, 0, 0, 25, 25, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        double[][] obstacleArray = {
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 0}
        };
        int source = 0;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{100};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        double[][] obstacleArray = {
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 1},
                { 0}
        };
        int source = 0;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 3;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test5() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 3;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{0, 0, 0, 0, 25, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test6() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 3;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{25.0, 6.25, 0.0, 0.0, 0.0, 6.25, 0.0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test7() {
        double[][] obstacleArray = {
                   {0, 0, 0, 0, 0, 0, 0},
                   {1, 0, 0, 0, 0, 0, 0},
                   {0, 0, 1, 1, 1, 0, 0},
                   {0, 0, 1, 0, 0, 0, 1},
                   {0, 0, 1, 0, 1, 1, 0},
                   {0, 1, 0, 0, 0, 0, 0},
                   {0, 0, 0, 1, 0, 0, 0},
                   {1, 1, 1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0, 0, 0}
        };
        int source = 6;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{0,0,0,0,0,0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test8() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int source = 8;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{25, 0, 12.5, 0, 4.6875, 0, 0, 0, 0, 7.8125, 0, 0, 3.125, 37.5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test9() {
        double[][] obstacleArray = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int source = 8;

        double[] actual = WaterfallStream.waterfallStreams(obstacleArray, source);
        double[] expected = new double[]{25, 0, 12.5, 0, 0, 0, 12.5, 6.25, 0, 3.125, 0, 0, 3.125, 37.5};
        assertArrayEquals(expected, actual);
    }



}
