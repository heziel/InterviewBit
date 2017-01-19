public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	   	ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
    	returnList.add(new ArrayList<Integer>());
     
    	for (int i = 0; i < a.size(); i++) {
    		Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
    		for (List<Integer> l : returnList) {
    			for (int j = 0; j < l.size() + 1; j++) {
    				l.add(j, a.get(i));
    				ArrayList<Integer> T = new ArrayList<Integer>(l);
    				l.remove(j);
    				currentSet.add(T);
    			}
    		}
    		returnList = new ArrayList<ArrayList<Integer>>(currentSet);
    	}
     
    	return returnList;
	}
}
