package com.javedhalani.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinRewards {

    public static void main(String[] args) {
        int[] test = new int[]{8,4,2,1,3,6,7,9,5};
        System.out.println("Total Rewards -> " + minRewards(test));
    }

    public static int minRewards(int[] scores) {
        // Write your code here.
        Map<Integer, Integer> rewardMap = new LinkedHashMap<>();
        int minRewards = 0;
        for(int score : scores) {
            rewardMap.put(score, 1);
        }
        for(int i = 0; i< scores.length; i++) {
            if((i != scores.length - 1) && scores[i] > scores[i+1]) {
                rewardMap.put(scores[i], rewardMap.get(scores[i+1]) + 1);
            }

            if ((i != 0) && scores[i] > scores[i - 1]) {
                rewardMap.put(scores[i], rewardMap.get(scores[i-1]) + 1);
            }
        }

        for(int i = scores.length -2; i >= 0 ; i--) {
            if(scores[i] > scores[i+1] && rewardMap.get(scores[i]) <= rewardMap.get(scores[i+1]) ) {
                rewardMap.put(scores[i], rewardMap.get(scores[i+1]) + 1);
            }

//            if ((i != 0) && scores[i] > scores[i - 1]) {
//                rewardMap.put(i, rewardMap.get(i-1) + 1);
//            }
        }
        minRewards = rewardMap
                .values()
                .stream()
                .mapToInt(v -> v)
                .sum();

        return minRewards;
    }

    private static int reward(int num) {
        if (num == 1) {
            return 1;
        } else {
            return 1 + reward(num);
        }
    }
}
