public class Solution {
	public int longestConsecutive(final List<Integer> a) {
    	    	
    	if ( a.size() == 0) {
    		return 0;
    	}
     
    	Set<Integer> set = new HashSet<Integer>();
    	int max = 1;
     
    	for (int e : a )
    		set.add(e);
     
    	for (int e : a) {
    		int left = e - 1;
    		int right = e + 1;
    		int count = 1;
     
    		while (set.contains(left)) {
    			count++;
    			set.remove(left);
    			left--;
    		}
     
    		while (set.contains(right)) {
    			count++;
    			set.remove(right);
    			right++;
    		}
     
    		max = Math.max(count, max);
    	}
     
    	return max;
	}
}
