package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TriangleOfPascal2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 0; i < rowIndex; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j < i; j++){
                curr.add(row.get(j-1) + row.get(j));
            }
            curr.add(1);
            row = curr;
        }
        return row;
    }
    public static void main(String[] args) {
        TriangleOfPascal2 t = new TriangleOfPascal2();
        System.out.println(t.getRow(5));
    }
}
