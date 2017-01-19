public class Solution {
	public static int numRange(ArrayList<Integer> a, int b, int c) {
		
		int start = 0, curr = 0, total=0, sum=0, end = a.size() -1;
		
		while ( start <= end ){
			while ( curr <= end ){
				sum += a.get(curr);
				if ( sum > c)
					break;
				else if ( sum < b )
					curr++;
				else if ( sum >= b && sum <= c){
					total++;
					curr++;
				}				
			}
			sum =0;
			start++;
			curr = start;
		}
		
		return total;
	}
}
