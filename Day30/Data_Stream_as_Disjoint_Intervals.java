package Day30;

public class Data_Stream_as_Disjoint_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	class SummaryRanges {
	    TreeSet<Integer> set;
	    public SummaryRanges() {
	        set= new TreeSet<>();
	    }
	    
	    public void addNum(int value) {
	        set.add(value);
	    }
	    
	    public int[][] getIntervals() {
	        if(set.size()==0){
	            return new int[][]{};
	        }
	        List<int[] > ans= new  ArrayList<>();
	        Integer left= null;
	        Integer right=null;
	        for(int val: set){
	            if(left==null&& right==null){
	                left= val;
	                right=val;
	            }else if(val== right+1){
	                right= val;
	            }else{
	                ans.add(new int[]{
	                    left, right
	                });
	                left= val;
	                right= val;
	            }

	        }
	         ans.add(new int[]{
	                    left, right
	                });

	        int[][] arr= new int[ans.size()][2];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]= ans.get(i);
	        }
	        return arr;
	    }
	}

	/**
	 * Your SummaryRanges object will be instantiated and called as such:
	 * SummaryRanges obj = new SummaryRanges();
	 * obj.addNum(value);
	 * int[][] param_2 = obj.getIntervals();
	 */
}
