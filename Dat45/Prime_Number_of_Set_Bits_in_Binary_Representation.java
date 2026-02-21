package Dat45;

public class Prime_Number_of_Set_Bits_in_Binary_Representation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<= right;i++){
            int c=0;
            int num=i;
            while (num != 0) {
                if ((num & 1) == 1) {
                    c++;
                }
                num = num >> 1;
           }
            if(prime(c)){
                ans++;
            }
        }
        return ans;
    }
    boolean prime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
