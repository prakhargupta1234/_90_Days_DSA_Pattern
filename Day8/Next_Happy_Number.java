package Day8;

public class Next_Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int nextHappy(int n) {
        // code here
        int next= n+1;
        while(true){
            if(isHappy(next)){
                break;
            }else{
                next++;
            }
        }
        return next;
    }
    
    public static  boolean isHappy(int n) {
        int slow= n;
        int fast=n;
        while(fast!=1){
            slow= Sum(slow);
            fast = Sum(Sum(fast));
            if(fast==1){
                return true;
            }

            if(fast == slow){
                return false;
            }
        }
        return true;
    }

   static  int Sum(int n){
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum+(rem*rem);
            n= n/10;
        }
        return sum;
    }
}
