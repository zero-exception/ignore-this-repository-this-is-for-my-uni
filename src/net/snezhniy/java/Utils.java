/*
 * MIT License
 *
 * Copyright (c) 2021 snezhniy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.snezhniy.java;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static <T, E extends List<T>> String joinTwoDimArray(ArrayList<E> arr) {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < arr.size(); i++) {
            result.append("[");

            var row = arr.get(i);
            for (int j = 0; j < row.size(); j++) {
                result.append(arr.get(i).get(j));
                if (j != row.size() - 1) {
                    result.append(", ");
                }
            }

            result.append("]");
            if (i != arr.size() - 1) {
                result.append(", ");
            }
        }

        result.append("]");
        return result.toString();
    }

    public static <T, E extends List<T>> ArrayList<T> getColumn(List<E> arr, int colIndex) {
        var col = new ArrayList<T>();

        for (int i = 0; i < arr.size(); i++) {
            col.add(i, arr.get(i).get(colIndex));
        }

        return col;
    }

}
