public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
		    
   int pos=0;
		   int count =0;
		   boolean addZero = false;	 
		   boolean notZero = false; 
		    
		   for ( int item : a )  
		   {
			   if (item == 0  )
				   count++;
			   else{
			       notZero =true;
				   break;
			       
			   }
		   }
		   if (! notZero){
		        a.set(0,1);
		        return a;
		   }
		  for (int i = 0 ; i <  count ; i++){
			   a.remove(0);
		   }
		   Collections.reverse(a);  
		   
		  
		 for ( int item : a)  
		 {
		   if ( item < 9 ){
			   	a.set( pos, item + 1 );
		    	break;
		    }
		    else if (item == 9){
		    	a.set(pos, 0);
		    	if (pos == a.size()-1  || a.get(a.size()-1)==0){
		    		a.set( pos, 1 );
		    		addZero = true;
		    	}
		    }
		    pos++;
		 }
		   Collections.reverse(a);
		   if (addZero)
			   a.add(0);
			   
	    return a;
	}
}
