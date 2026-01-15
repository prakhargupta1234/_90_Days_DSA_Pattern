package Day7;

public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public boolean isHappy(int n) {
        
        Set<Integer> set= new HashSet<>();
        while(true){
            int sum =0;
            while(n>0){
                int rem = n%10;
                sum = sum + rem*rem;
                n= n/10;
            }

            if(sum ==1){
                return true;
            }
            n= sum;
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
        }
    }
}
