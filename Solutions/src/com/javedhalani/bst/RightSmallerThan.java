package com.javedhalani.bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RightSmallerThan {

    public static List<Integer> rightSmallerThan(List<Integer> array) {
        // Write your code here.
        Map<Integer, List<Integer>> temp = new HashMap<>();
        for (int i = array.size() - 1; i >= 0 ; i--) {
            int input = array.get(i);
            temp.put(input, new ArrayList<>());
            if (i == (array.size() -1)) {
                continue;
            }
            if (array.get(i) > array.get(i+1)) {
                temp.get(input).add(array.get(i+1));
                temp.get(input).addAll(temp.get(array.get(i+1)));
            } else {
                for (Integer item : temp.get(array.get(i+1))) {
                    if (input > item) {
                        temp.get(input).add(item);
                        temp.get(input).addAll(temp.get(item));
                        break;
                    }
                }
            }

        }
        return array.stream()
                .map(x -> temp.get(x).size())
                .collect(Collectors.toList());
    }
}
