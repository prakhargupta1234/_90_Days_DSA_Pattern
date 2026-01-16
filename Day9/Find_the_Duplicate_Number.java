package Day9;

public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        slow= nums[slow];
        fast= nums[nums[fast]];
        while(fast!= slow){
            slow= nums[slow];
            fast= nums[nums[fast]];
        }
        slow=0;
        while(fast!= slow){
            slow= nums[slow];
            fast= nums[fast];
        }
        return slow;
    }
}
