package Day31;

public class Minimum_Deletions_to_Make_String_Balanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minimumDeletions(String s) {
        int n= s.length();
        int[] a= new int [n];
        int [] b= new int[n];
        b[0]=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='b'){
                b[i]= b[i-1]+1;
            }else{
                b[i]= b[i-1];
            }
        }
        a[n-1]=0;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i+1)=='a'){
                a[i]= a[i+1]+1;
            }else{
                a[i]= a[i+1];
            }
        }

        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max= Math.min(max, a[i]+b[i]);
        }
        return max;

    }

}
