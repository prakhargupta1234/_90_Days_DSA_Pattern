package Dat23;

public class Count_Ways_to_Group_Overlapping_Ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int countWays(int[][] arr) {
        int MOD = 1_000_000_007;
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int c=1;
        int st= arr[0][0];
        int et= arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<= et){
              
                et= Math.max(et, arr[i][1]);
            }else{
                c++;
                et= arr[i][1];
                st= arr[i][0];
            }
        }
        long ans= 1;
        for(int i=0;i<c;i++){
            ans= (ans*2)%MOD;
        }
        return (int)ans;

    }
}
