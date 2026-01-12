package Day5;

import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character , Character> map= new HashMap<Character, Character>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');
		
		String s="192861";
		System.out.println(Strobogrammatic_numbers(map, s));
	}

	private static boolean Strobogrammatic_numbers(Map<Character, Character> map, String s) {
		int i=0;
		int j=s.length()-1;
		while (i<=j) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))==s.charAt(j)) {
					i++;
					j--;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}

}
