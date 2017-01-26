public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	   
			ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> al = new ArrayList<>();	
			List<String> strings = new ArrayList<>();
			HashMap<String,ArrayList<Integer>> hm = new HashMap<>();
			
			//strings = a;
			
			for ( int i=0 ; i < a.size(); i++){
				String s = a.get(i);
				char[] c = s.toCharArray();        //Convert to array of chars 
				java.util.Arrays.sort(c);          //Sort
				String newString = new String(c);  //Convert back to String
				//System.out.println(newString);  
				strings.add(i,newString );
			}
			
			for (int i=0 ; i < strings.size(); i++ ){
				String str = strings.get(i);
				if ( ! hm.containsKey(str) ){
					al = new ArrayList<>();
				}
				else{
					al = hm.get(strings.get(i));					
				}
				al.add(i+1);
				hm.put(str,al);
			}
			
			
			
			for (Map.Entry<String, ArrayList<Integer>> entry : hm.entrySet()) {
			//	System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
				all.add((ArrayList<Integer>) entry.getValue());
			}

			return all;	
	    
	}
}
