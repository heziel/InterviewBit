public class Solution {
    public static HashMap<Integer, Integer> hm = new HashMap<>();
    
    public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		int n = (a*2)-1;
		int dicResultRow, dicResultCol;
		
		buildDictionary(a);
		
		ArrayList<ArrayList<Integer>> myArr = new ArrayList<>();
		
		for ( int i=0; i < n; i++){
			ArrayList<Integer> curArr = new ArrayList<>();
			for ( int j=0; j < n; j++){
				dicResultRow = hm.get(i);
				dicResultCol =hm.get(j);
				curArr.add(Math.max(dicResultRow,dicResultCol));				
			}
			myArr.add(curArr);
		}		
		
		
		return myArr;
	}
	
	public static void buildDictionary ( int a ){
		
		int n = (a*2)-1;
		int pivotf = 0;
		int pivote = n-1;
		
		while ( a != 0 ){
			hm.put(pivotf, a);
			hm.put(pivote, a);
			a--;
			pivotf++;
			pivote--;
		}		
    }
}
