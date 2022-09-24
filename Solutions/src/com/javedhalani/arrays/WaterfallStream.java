package com.javedhalani.arrays;

import java.util.Arrays;

public class WaterfallStream {

    enum DIRECTION {
        DOWN,
        RIGHT,
        LEFT
    }



    public static void main(String[] args) {
        double[][] obstacleArray1 = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };

        double[][] obstacleArray2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };

        double[][] obstacleArray3 = {
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 0}
        };

        double[][] obstacleArray4 = {
                {0, 0, 0, 0, 0, 0, 0},
        };

        double[][] obstacleArray5 = {
                { 0},
                { 0},
                { 0},
                { 0},
                { 0},
                { 1},
                { 0}
        };

        int source =0;

        System.out.println(Arrays.toString(waterfallStreams(obstacleArray5, source)));
    }

    public static double[] waterfallStreams(double[][] obstacleArray, int source) {

        double[][] waterQtyArray = new double[obstacleArray.length][obstacleArray[0].length];
        double initialQty = 100;
        waterPath(0, source, DIRECTION.DOWN, initialQty, obstacleArray, waterQtyArray);
        return waterQtyArray[waterQtyArray.length - 1];
    }

    private static void waterPath(
            int i, int j,
            DIRECTION direction, double input,
            double[][] obstacleArray, double[][] waterQtyArray) {
        if (j < 0 || j > obstacleArray[0].length - 1) {
            return;
        }
        waterQtyArray[i][j] = input + waterQtyArray[i][j];

        switch (direction) {
            case DOWN :
                if (i == obstacleArray.length - 1) {
                    break;
                }
                if (obstacleArray[i+1][j] == 1) {

                    waterPath(i, j-1, DIRECTION.LEFT, input / 2, obstacleArray, waterQtyArray);
                    waterPath(i, j+1, DIRECTION.RIGHT, input / 2, obstacleArray, waterQtyArray);
                } else {
                    waterPath(i + 1, j, DIRECTION.DOWN, input, obstacleArray, waterQtyArray);
                }
                break;
            case RIGHT:
                if (obstacleArray[i+1][j] == 1 && j == (obstacleArray[0].length - 1)
                        || obstacleArray[i+1][j-1] == 1 && obstacleArray[i][j] == 1
                ) {
                    // do nothing. Stream ended
                } else if (obstacleArray[i+1][j] == 0 ) {
                    // Stream can move down
                    waterPath(i+1, j, DIRECTION.DOWN, input, obstacleArray, waterQtyArray);
                } else {
                    // Stream can move further right since we have not reached the rightmost column
                    waterPath(i, j+1, DIRECTION.RIGHT, input, obstacleArray, waterQtyArray);
                }
                break;
            case LEFT:
                if (obstacleArray[i+1][j] == 1 && j == 0
                        || obstacleArray[i+1][j+1] == 1 && obstacleArray[i][j] == 1
                ) {
                    // do nothing. Stream ended
                } else if (obstacleArray[i+1][j] == 0 ) {
                    // Stream can move down
                    waterPath(i+1, j, DIRECTION.DOWN, input, obstacleArray, waterQtyArray);
                } else {
                    // Stream can move further left since we have not reached the leftmost column
                    waterPath(i, j-1, DIRECTION.LEFT, input, obstacleArray, waterQtyArray);
                }
                break;
        }
    }
}
