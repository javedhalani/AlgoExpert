package com.javedhalani.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MinAreaRectangle {
    public static int minAreaRectangle(int[][] points) {
        // Map with key as x-coordinate and values as the y-coordinates so that we get the straight lines parallel to y-axis
        Map<Integer, SortedSet<Integer>> xyMap= new HashMap<>();
        for (int i = 0; i < points.length ; i++) {
            if (!xyMap.containsKey(points[i][0])) {
                SortedSet<Integer> yPoints = new TreeSet<>();
                xyMap.put(points[i][0], yPoints);
            }
            xyMap.get(points[i][0]).add(points[i][1]);
        }

        Set<Point> yPoints = new HashSet<>(); // Map to Point objects
        Map<Integer, List<Point>> valid = xyMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> {
                   List<Point> ypoints = getPoints(entry.getValue());
                    for (Point point: ypoints) {
                        yPoints.add(point);
                    }
                    Map.Entry<Integer, List<Point>> newEntry = new AbstractMap.SimpleImmutableEntry<>(entry.getKey(), ypoints);
                    return newEntry;
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       return yPoints.stream()
                .map(point -> {
                    List<Integer> xPoints = valid.entrySet().stream()
                            .filter(entry -> entry.getValue().contains(point))
                            .map(entry -> entry.getKey())
                            .collect(Collectors.toList());
                    if ( xPoints.size() < 2) {
                        return null;
                    }
                    int minDiff = Integer.MAX_VALUE;
                    for (int i = 0; i < xPoints.size() - 1; i++) {
                        int diff = Math.abs(xPoints.get(i+1) - xPoints.get(i));
                        if(diff < minDiff) {
                            minDiff = diff;
                        }
                    }
                    return Math.abs(point.y2 - point.y1) * minDiff;
                })
                .filter(Objects::nonNull)
                .sorted()
                .findFirst()
                .orElse(0);
    }

    private static List<Point> getPoints(SortedSet<Integer> values) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < values.size() - 1; i++) {
            for (int j = i+1; j < values.size(); j++) {
                Point point = new Point((int)values.toArray()[i], (int)values.toArray()[j] );
                points.add(point);
            }
        }
        return  points;
    }

    static class Point{
        int y1;
        int y2;

        public Point(int y1, int y2) {
            this.y1 = y1;
            this.y2 = y2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return y1 == point.y1 && y2 == point.y2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(y1, y2);
        }
    }
}
