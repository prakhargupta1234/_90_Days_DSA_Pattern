package Day29;

public class Maximum_Meetings_in_One_Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static ArrayList<Integer> maxMeetings(int n, int[] start, int[] end) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
       int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
            arr[i][2] = i + 1;  
        }

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        int lastEnd = arr[0][1];
        ans.add(arr[0][2]);  

        for (int i = 1; i < n; i++) {
            if (arr[i][0] > lastEnd) {
                ans.add(arr[i][2]);
                lastEnd = arr[i][1];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
