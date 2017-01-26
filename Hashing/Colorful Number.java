public class Solution {
	public int colorful(int a) {
			int number = a;
		    int count = 0; 
		    int product=1;
		    int steps;
		    ArrayList<Integer> al = new ArrayList<>();
		    HashSet<Integer> hs = new HashSet<>();
		    
		    int length=0;
	
		    while ( number > 0){
		    	al.add(number%10);
		    	number /= 10;
		    	length++;
		    }
		    
		    steps = length;
		    
		    while ( steps > 0 ){
		    	for ( int i=0; i < steps ; i++){
		    		for ( int j=i; j < count+i+1 ; j++ ){
		    			product *= al.get(j);
		    		}
			    	if ( hs.contains(product) ){
			    		return 0;
			    	}else{
			    		hs.add(product);
			    	}

			    	product = 1;
		    	}
		    	
		      	count++;
		      	steps--;
		    }
			return 1; 
	}
}
