package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TriangleOfPascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(1)));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        TriangleOfPascal triangle = new TriangleOfPascal();
        triangle.generate(6).forEach(System.out::println);
    }
}
