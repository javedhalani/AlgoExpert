package com.javedhalani.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class LargestRange {

    public static void main(String[] args) {

        int[] array1 = new int[]{1,11,3,0,15,5,2,4,10,7,12,6};
        int[] array3 = new int[]{1,2};
        int[] array7 = new int[]{19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14};
        int[] array11 = new int[]{1, 1, 1, 3, 4};
        System.out.println(Arrays.toString(largestRange2(array7)));

    }

    public static int[] largestRange(int[] array) {

        int[] output = new int[2];
        Arrays.sort(array);
        List<Integer> range = new ArrayList<>();
        List<List<Integer>> rangeList = new ArrayList<>();
        range.add(array[0]);
        for(int i = 1; i < array.length ; i++) {
            int diff = array[i] - array[i-1];
            if (diff != 0) {
                if (diff == 1 ) {
                    range.add(array[i]);
                } else {
                    rangeList.add(new ArrayList<>(range));
                    range.clear();
                    range.add(array[i]);
                }
            }
        }
        rangeList.add(new ArrayList<>(range));
        List<Integer> lengths = rangeList
                .stream()
                .map(List::size)
                .collect(Collectors.toList());

        int maxLength = lengths
                .stream()
                .max(Comparator.naturalOrder())
                .get();

        int maxIndex = lengths.indexOf(maxLength);

        range = rangeList.get(maxIndex);

        output[0] = range.get(0);
        output[1] = range.get(range.size() -1);
        return output;

    }

    public static int[] largestRange2(int[] array) {
        List<Integer> range = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int[] output = new int[2];
        Map<Integer, Boolean> arrayMap = Arrays.stream(array)
                .boxed()
                .collect(toMap(Function.identity(), k-> true, (a, b) -> true ));

        int min = array[0];
        int max = array[array.length -1];
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            if (Boolean.FALSE.equals(arrayMap.get(num))) {
                continue;
            }
            while (arrayMap.containsKey(num)) {
                range.add(num);
                arrayMap.put(num,false);
                num--;
            }
            min = num + 1;
            num = array[i] + 1 ;
            while (arrayMap.containsKey(num)) {
                range.add(num);
                arrayMap.put(num++,false);
            }
            max = num - 1;
            if (tempList.size() < range.size()) {
                tempList = new ArrayList<>(range);
                output = new int[]{min, max};
                range.clear();
            }
        }
//        tempList.sort(Comparator.naturalOrder());
        return output;
    }
}
