package com.javedhalani.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagTraverse {

    public static void main(String[] args) {

        List<List<Integer>> input1 = Arrays.asList(
                Arrays.asList(1,3,4,10),
                Arrays.asList(2,5,9,11),
                Arrays.asList(6,8,12,15),
                Arrays.asList(7,13,14,16)
        );

        List<List<Integer>> input2 = Arrays.asList(
                Arrays.asList(1,2,3,4,5)

        );
        List<List<Integer>> input3 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(5)


        );
        List<Integer> output = zigzagtraverse3(input1);
        System.out.println("Arrays List" + Arrays.toString(output.toArray()));
    }

    private static List<Integer> zigzagtraverse(List<List<Integer>> input) {
        List<Integer> output = new ArrayList<>();
        int rowMax = input.size();
        int colMax = input.get(0).size(); // Number of columns
        if (rowMax == 1) {
            return input.get(0);
        }
        if (colMax == 1) {
            input.stream().forEach(x -> output.add(x.get(0)));
            return output;
        }
        int partitions = rowMax + colMax - 1 ;
        int i = 0;
        int j = 0;
        for (int p = 0 ; p < partitions ; p++) {
            if ( p % 2 == 0 ) {
                // start with col Index
                i = p < rowMax ? 0 : p - (rowMax - 1);
                j = Math.min(p, colMax - 1);
                while ((i+j) <= p && i < rowMax && j >= 0 ) {
                    output.add(input.get(i++).get(j--));
                }
            } else {
                // start with row index
                i = Math.min(p, rowMax - 1);
                j = p < colMax ? 0 : p - (colMax - 1);
                while ((i+j) <= p && j < colMax && i >= 0 ) {
                    output.add(input.get(i--).get(j++));
                }
            }
        }
        return output;
    }

    private static List<Integer> zigzagtraverse2(List<List<Integer>> input) {
        List<Integer> output = new ArrayList<>();
        int rowMax = input.size();
        int colMax = input.get(0).size(); // Number of columns
        boolean isGoingDown = true;
        int i = 0;
        int j = 0;
        while ( i < (rowMax - 1) || j < (colMax - 1)) {
            output.add(input.get(i).get(j));
            if(isGoingDown) {
                i++;
                j--;
                if(isWithinBounds(i , j , rowMax, colMax)) {
                    j++;
                    isGoingDown = false;
                }
            } else {
                i--;
                j++;
                if(isWithinBounds(i , j , rowMax, colMax)) {
                    i++;
                    isGoingDown = true;
                }
            }
        }
        return output;
    }

    private static List<Integer> zigzagtraverse3(List<List<Integer>> input) {
        List<Integer> output = new ArrayList<>();
        int height = input.size() - 1;
        int width = input.get(0).size() - 1; // Number of columns
        boolean isGoingDown = true;
        int i = 0;
        int j = 0;
        while (isWithinBounds(i,j, height, width)) {
            output.add(input.get(i).get(j));
            if(isGoingDown) {
                if(j == 0 || i == height) {
                    isGoingDown = false;
                    if (i == height) {
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                    j--;
                }
            } else {
                if(i == 0 || j == width) {
                    isGoingDown = true;
                    if (j == width) {
                        i++;
                    } else {
                        j++;
                    }
                } else {
                    i--;
                    j++;
                }
            }
        }
        return output;
    }
    private static boolean isWithinBounds(int i, int j, int rowMax, int colMax) {
        return !(i < 0 || i > rowMax || j < 0 || j > colMax );

    }
}
