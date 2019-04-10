import java.io.*;
import java.util.*;
public class hashMap {

	public static void main(String[] args) {
		
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);          
		hashMap.put(2, 2);         
		hashMap.get(1);            // returns 1
		hashMap.get(3);            // returns -1 (not found)
		hashMap.put(2, 1);          // update the existing value
		hashMap.get(2);            // returns 1 
		hashMap.remove(2);          // remove the mapping for 2
		hashMap.get(2);            // returns -1 (not found) 
		hashMap.display();
}
}

		// TODO Auto-generated method stub
		class MyHashMap {
			 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			    /** Initialize your data structure here. */
			    public MyHashMap() {
			    	
			       
			    }
			    
			    public void display() {
			    	for(Map.Entry e : hm.entrySet()) 
			    	{
			    		System.out.println(e.getKey() + " " + e.getValue());
			    	}
				
			    }
			    /** value will always be non-negative. */
			    public void put(int key, int value) {
			       
			        if(hm.containsKey(key)) 
			        	{
			        		hm.put(key, value);
			        		
			        	}
			        else{
			            hm.put(key,value);
			        }
			       
			        
			    }
			    
			    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
			    public int get(int key) {
			       if(hm.containsKey(key)){
			           return hm.get(key);
			       }
			        else{
			            return -1;
			        }
			       
			    }
			    
			    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
			    public void remove(int key) {
			       if(hm.containsKey(key)){
			           hm.remove(key);
			       }
			       
			    }
			}
			/**
			 * Your MyHashMap object will be instantiated and called as such:
			 * MyHashMap obj = new MyHashMap();
			 * obj.put(key,value);
			 * int param_2 = obj.get(key);
			 * obj.remove(key);
			 */



