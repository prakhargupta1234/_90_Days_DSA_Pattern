package Dat22;

public class Count_Days_Without_Meetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int countDays(int days, int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int c=0;
        int st= arr[0][0];
        int et= arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<= et){
                et= Math.max(et, arr[i][1]);
            }else{
                c= c+(et-st+1);
                st= arr[i][0];
                et= arr[i][1];
            }
        }
         c= c+(et-st+1);
         return days-c;
    }

}
