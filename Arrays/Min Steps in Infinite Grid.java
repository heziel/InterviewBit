public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        
        if (Y.size()==1) return 0;
        
       int x = 0;
       int y = 0;
       int steps = 0;
       
       int pos=0;
       int nextX=0;
      
       
       
       while ( pos < Y.size()-1 ) {
           x = Math.abs( Y.get(pos) - Y.get(pos+1)  );
           y = Math.abs( X.get(pos) - X.get(pos+1) );
           steps += Math.max(x, y);
           pos++;
         
       }
       return steps; 
    }
}
