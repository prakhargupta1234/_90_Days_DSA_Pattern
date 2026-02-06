package Day30;

public class Minimum_Common_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int getCommon(int[] nums1, int[] nums2) {
	        
	        int n=-1;
	        for(int  i=0;i<nums1.length;i++){
	            if(find( nums2, nums1[i])){
	                return nums1[i];
	            }
	        }
	        return n;
	    }
	    boolean find(int [] arr, int n){
	        int l=0;
	        int h=arr.length-1;
	        while(l<=h){
	            int mid= l+(h-l)/2;
	            if(arr[mid]==n){
	                return true;
	            }else if(arr[mid]>n){
	                h= mid-1;
	            }else{
	                l= mid+1;
	            }
	        }

	        return false;
	    }

}
