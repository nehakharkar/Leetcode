import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        findAllsubsets( result , new ArrayList<>(),nums, 0);
        return result;
    }

    private void findAllsubsets(List<List<Integer>> result , List<Integer> subset,int[] nums, int start) 
    {
        result.add(new ArrayList<>(subset));      
        for(int i = start; i < nums.length; i++)
        {
            subset.add(nums[i]);
            findAllsubsets(result ,subset,nums, i+1);
            subset.remove(subset.size() - 1);
        }
       
    }
}
    


