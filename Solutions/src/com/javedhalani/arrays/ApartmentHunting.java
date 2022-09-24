package com.javedhalani.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ApartmentHunting {

    public static void main(String[] args) {
        Map<String, Boolean> block1 =  Map.of(
                "gym", false,
                "school", true,
                "store", false
        );
        Map<String, Boolean> block2 =  Map.of(
               "gym", true,
                "school", false,
                "store", false
        );

        Map<String, Boolean> block3 = Map.of(
                "gym", true,
                "school", true,
                "store", false
        );
        Map<String, Boolean> block4 = Map.of(
                "gym", false,
                "school", true,
                "store", false
        );
        Map<String, Boolean> block5 = Map.of(
                "gym", false,
                "school", true,
                "store", true);


        List<Map<String, Boolean>> blocks = Arrays.asList(block1, block2, block3, block4, block5);
        String[] reqs = {"gym", "school", "store"};

        System.out.println("Optimized Block => "+ apartmentHunting(blocks, reqs));

    }

    private static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {

        int[][] reqDistance = new int[blocks.size()][reqs.length];
        Integer[] maxDistance = new Integer[blocks.size()];
        for (int i = 0; i < blocks.size() ; i++) {
            for (int j = 0; j < reqs.length ; j++) {
                reqDistance[i][j] = blocks.get(i).get(reqs[j]) ? 0 : findDistanceToNearestReq(reqs[j], blocks, i);
            }
            maxDistance[i] = Arrays.stream(reqDistance[i]).max().getAsInt();
        }
        return List.of(maxDistance).indexOf(Arrays.stream(maxDistance).mapToInt(Integer::intValue).min().getAsInt());
    }

    private static int findDistanceToNearestReq(String req, List<Map<String, Boolean>> blocks, int blockIndex) {
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.size(); i++) {
            Map<String, Boolean> entry = blocks.get(i);
            if(entry.containsKey(req) && entry.get(req)) {
                if ( Math.abs(i - blockIndex) <= diff) {
                    diff = Math.abs(i - blockIndex);

                }
            }
        }
        return diff;
    }
}
