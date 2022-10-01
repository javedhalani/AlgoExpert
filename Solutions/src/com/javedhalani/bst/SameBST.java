package com.javedhalani.bst;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SameBST {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (arrayOne.size() != arrayTwo.size())
            return false;
        if (arrayOne.isEmpty())
            return true;
        if (!Objects.equals(arrayOne.get(0), arrayTwo.get(0)))
            return false;

        Integer root = arrayOne.get(0);
        List<Integer> array1left = arrayOne.subList(1, arrayOne.size())
                .stream()
                .filter(x -> x < root)
                .toList();
        List<Integer> array2left = arrayTwo.subList(1, arrayTwo.size())
                .stream()
                .filter(x -> x < root)
                .toList();
        List<Integer> array1Right = arrayOne.subList(1, arrayOne.size())
                .stream()
                .filter(x -> x >= root)
                .toList();
        List<Integer> array2Right = arrayTwo.subList(1, arrayTwo.size())
                .stream()
                .filter(x -> x >= root)
                .collect(Collectors.toList());
        return sameBsts(array1left, array2left) && sameBsts(array1Right, array2Right) ;
    }


}
