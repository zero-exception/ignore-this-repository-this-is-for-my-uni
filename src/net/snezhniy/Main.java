package net.snezhniy;

import net.snezhniy.java.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            var rnd = new Random();
            var innerList = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                var n = rnd.nextInt(65536) - 32768;
                innerList.add(j, n);
            }
            arr.add(innerList);
        }

        var joined = Utils.joinTwoDimArray(arr);
        System.out.printf("%s\n", joined);

        var col = Utils.getColumn(arr, 1);
        var joined2 = col
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.printf("%s", joined2);
    }
}
