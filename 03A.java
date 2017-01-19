public class Solution {
	public static int kthsmallest( final List<Integer> a, int k) {
	    ArrayList<Integer> al = new ArrayList<>(a);
		return find(0,a.size()-1,k, al);
	}
	

	public static int find(int pivot, int high,int k, ArrayList<Integer> a){
		int kth =0;
		if(pivot <= high){
			int hold = 0;
			int i = pivot;
			for (int j = pivot+1; j <= high ; j ++){

				if(a.get(pivot) >= a.get(j)){

					hold = a.get(i+1);
					a.set(i+1, a.get(j));
					a.set(j,hold);	
					i++;
				}

			}
			hold = a.get(i);
			a.set(i, a.get(pivot));
			a.set(pivot,hold);		

			/*
			 * make recursive calls
			 */
			if(i+1 == k)
				return a.get(i);
			else if(k < i+1)
				kth = find(pivot, i-1,k,a);
			else
				kth = find(i+1,high,k,a);

		}
		return kth;
	}
}
