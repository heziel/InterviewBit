public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int sum = 0 ;
        int maxTillHere=0;
        int singleMax =0; 
        int max=0;
        if (a.size()>1)
            singleMax = a.get(0);
   
        for ( int item : a){
            if (a.size()==1)
                return item;
            singleMax = Math.max(singleMax,item);
            maxTillHere = Math.max (0 , maxTillHere + item );
            max = Math.max( max, maxTillHere);
        }
        if (max !=0 ) return max;
        return singleMax;
	    
	}
}
