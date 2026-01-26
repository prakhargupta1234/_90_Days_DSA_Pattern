package Day19;

public class Minimum_Absolute_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        int mindiff= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mindiff= Math.min(mindiff, arr[i]- arr[i-1]);
        }

        for(int i=1;i<arr.length;i++){
            List<Integer> ll = new ArrayList<>();
            if(arr[i]-arr[i-1]== mindiff){
                ll.add(arr[i-1]);
                ll.add(arr[i]);
                ans.add(ll);
            }
        }
        return ans;
        
    }
}
