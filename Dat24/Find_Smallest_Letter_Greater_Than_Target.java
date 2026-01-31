package Dat24;

public class Find_Smallest_Letter_Greater_Than_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public char nextGreatestLetter(char[] letters, char target) {
        char ans= letters[0];
        for(int i=0;i<letters.length;i++){
            char ch= letters[i];
            if(ch-target>0){
                return ch;
            }
        }        
        return ans;
    }
}
