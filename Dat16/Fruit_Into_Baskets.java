package Dat16;

public class Fruit_Into_Baskets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int totalFruit(int[] arr) {
	        Map<Integer, Integer> map= new HashMap<>();
	        int i=0;
	        int j=0;
	        int ans=0;
	        int n= arr.length;
	        while(i<n){
	            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

	            while(map.size()>2){
	                if(map.get(arr[j])>1){
	                    map.put(arr[j], map.get(arr[j])-1);
	                    j++;
	                }else{
	                    map.remove(arr[j]);
	                    j++;
	                }
	            }

	            ans=Math.max(ans, i-j+1); 
	            i++;
	        }

	        return ans;
	    }

}
