package Day28;

public class Car_Pooling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean carPooling(int[][] trips, int capacity) {
	        TreeMap<Integer, Integer> map= new TreeMap<>();
	        for(int i=0;i<trips.length;i++){
	            int st= trips[i][1];
	            int et= trips[i][2];
	            int pass= trips[i][0];
	            map.put(st, map.getOrDefault(st,0)+pass);
	            map.put(et, map.getOrDefault(et,0)-pass);
	        }
	        int c=0;
	        for(int key:map.keySet()){
	            c= c+(map.get(key));
	            if(c>capacity){
	                return false;
	            }
	        }
	        return true;
	    }

}
