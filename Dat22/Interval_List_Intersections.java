package Dat22;

public class Interval_List_Intersections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
	        List<int[] > ll= new ArrayList<>();
	        int i=0;
	        int j =0;
	        int n = firstList.length;
	        int m = secondList.length;
	        while(i<n&&j<m){
	            int e1=firstList[i][1];
	            int e2= secondList[j][1];
	            int s1=firstList[i][0];
	            int s2=secondList[j][0];

	            if(e1>=s2&& e2>=s1){
	                ll.add(new  int[]{
	                    Math.max(s1,s2),
	                    Math.min(e1,e2)
	                });
	            }

	            if(e1<e2){
	                i++;
	            }else{
	                j++;
	            }
	        }

	        int[][] ans=new int[ll.size()][2];
	        for(int k= 0;k<ll.size();k++){
	            ans[k]= ll.get(k);
	        }
	        return ans;
	    }
}
