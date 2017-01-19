public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        int[] res = new int[a.size()];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.size(); i++) {
            int height = a.get(i);
            while (!stack.isEmpty() && height > a.get(stack.peek())) {
                res[stack.pop()] = height;
            }
            stack.push(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }
        return result;
    }

}
