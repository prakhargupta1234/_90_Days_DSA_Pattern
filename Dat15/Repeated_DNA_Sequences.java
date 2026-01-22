package Dat15;

public class Repeated_DNA_Sequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans= new ArrayList<>();
        Set<String> set= new HashSet<>();
        Set<String> a= new HashSet<>();
        if(s.length()<=10){
            return ans;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
        }
        set.add(sb.toString());
        for(int i=10;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(set.contains(sb.toString())){
                a.add(sb.toString());
            }else{
                set.add(sb.toString());
            }
        }
        for(String str:a){
            ans.add(str);
        }
        return ans;
    }
}
