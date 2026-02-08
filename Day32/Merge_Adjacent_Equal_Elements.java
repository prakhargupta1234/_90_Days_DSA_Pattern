package Day32;

public class Merge_Adjacent_Equal_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st= new Stack<>();
        for(int val: nums){
            long curr= val;
            while(!st.isEmpty()&& st.peek()== curr){
                curr= curr+st.pop();
            }
            st.push(curr);
        }
        List<Long> ll= new ArrayList<>(st);
        return ll;
        
    }
}
