package Day3;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public void merge(int[] arr1, int m, int[] arr2, int n) {
	        int k= m+n-1;
	        int i= m-1;
	        int j= n-1;
	        while(j>=0&&i>=0){
	            if(arr1[i]>arr2[j]){
	                arr1[k]= arr1[i];
	                k--;
	                i--;
	            }else{
	                arr1[k]= arr2[j];
	                k--;
	                j--;
	            }
	        }
	        while(j>=0){
	            arr1[k]= arr2[j];
	            k--;
	            j--;
	        }
	    }
}
