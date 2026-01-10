package Day3;

import java.awt.List;
import java.util.*;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i=0;
        int j= nums.size()-1;
        int c=0;
        while(i<j){
            if(nums.get(i)+nums.get(j)<target){
                c= c+(j-i);
                i++;
            }else{
                j--;
            }
        }
        return c;
    }
}
