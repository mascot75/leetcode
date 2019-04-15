package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> array = new ArrayList<>();
//            array.add(1);
//            for (int j = 1; j < i; j++) {
//                array.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
//            }
//            if (i != 0) {
//                array.add(1);
//            }
//            result.add(array);
//        }
//        return result;
//    }

    public List getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> array = new ArrayList<>();
            array.add(1);
            for (int j = 1; j < i; j++) {
                result.add(array.get(j - 1) + array.get(j));
            }
            if (i != 0) {
                array.add(1);
            }


            if (i == rowIndex) {
                return array;
            }
        }
        return Collections.EMPTY_LIST;
    }
}