package Day28;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int g=0;
	        int c=0;
	        for(int i=0;i<gas.length;i++){
	            g+= gas[i];
	            c+=cost[i];
	        }
	        if(c>g){
	            return -1;
	        }
	        int idx=0;
	        int cval=0;
	        for(int i=0;i<gas.length;i++){
	            
	            cval+= gas[i]-cost[i];
	            if(cval<0){
	                idx=i+1;
	                cval=0;
	            }
	        }
	        return idx;
	    }
}
