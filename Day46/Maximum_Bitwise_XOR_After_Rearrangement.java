package Day46;

public class Maximum_Bitwise_XOR_After_Rearrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String maximumXor(String s, String t) {
        int n = s.length();
        int one=0;
        int zero=0;
        for(char ch: t.toCharArray()){
            if(ch=='1'){
                one++;
            }else{
                zero++;
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            if(c=='0'){
                if(one>0){
                    sb.append('1');
                    one--;
                }else{
                    sb.append('0');
                    zero--;
                }
            }
            else{
                if(zero>0){
                    sb.append('1');
                    zero--;
                }else{
                    sb.append('0');
                    one--;
                }
            }
        }
        return sb.toString();
            
    }

}
