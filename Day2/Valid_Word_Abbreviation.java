package Day2;

public class Valid_Word_Abbreviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;
        while(i<word.length()&& j<abbr.length()){
            char ch1= word.charAt(i);
            char ch2= abbr.charAt(j);
            if(Character.isDigit(ch2)){
                if(ch2=='0'){
                    return false;
                }
                int c=0;
                while(j<abbr.length()&&Character.isDigit(abbr.charAt(j))){
                    c=c*10+(abbr.charAt(j)-'0');
                    j++;
                }
                i= i+c;
            }else{
                if(ch1!= ch2){
                    return false;
                }
                i++;
                j++;
            }
            
        }

        return i==word.length()&&j==abbr.length();
    }

}
