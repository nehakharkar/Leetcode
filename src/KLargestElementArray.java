import java.util.PriorityQueue;

class KLargestElementArray {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n : nums)
        {
            pq.add(n);
            
            if(pq.size()>k)
            {
                 pq.remove();    
            }
        }
        return pq.remove();
    }
}




