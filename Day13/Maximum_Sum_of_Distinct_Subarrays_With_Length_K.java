package Day13;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public long maximumSubarraySum(int[] nums, int k) {
	        long sum=0;
	        long ans=0;
	        Map<Integer, Integer> map= new HashMap<>();
	        int d=0;
	        for(int i=0;i<k;i++){
	            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
	            sum= sum+ nums[i];
	            if(map.get(nums[i])>1){
	                d++;
	            }
	        }

	        if(d==0){
	            ans= sum;
	        }

	        for(int i=k;i<nums.length;i++){
	           int add= nums[i];
	           int remove= nums[i-k];
	           map.put(add, map.getOrDefault(add, 0)+1);
	           if(map.get(add)>1){
	            d++;
	           }
	           if(map.get(remove)>1){
	            d--;
	           }
	           map.put(remove, map.get(remove)-1);
	           sum+= add;
	           sum-=remove;
	           if(d==0){
	            ans= Math.max(sum, ans);
	           }
	        }


	        return ans;
	    }
}
