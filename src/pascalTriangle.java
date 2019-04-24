
import java.util.*;

class pascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new LinkedList();
        for(int i = 0 ; i < n ; i++)
        {
            List<Integer> row = new LinkedList();
            for(int j = 0 ; j<=i ; j++)
            {
                if(j == 0 || i == j)
                {
                    row.add(1);
                }
                else
                {
                    row.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
            }
            list.add(row);
        }
        return list;
    }
}