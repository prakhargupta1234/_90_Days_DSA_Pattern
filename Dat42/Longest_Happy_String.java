package Dat42;

public class Longest_Happy_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<store> pq= new PriorityQueue<>(
            (x,y)->y.val- x.val
        );

        if(a>0){
            pq.add(new store(a,'a'));
        }

        if(b>0){
            pq.add(new store(b,'b'));
        }


        if(c>0){
            pq.add(new store(c,'c'));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            store first= pq.poll();
            int n= first.val;
            char cha= first.ch;
            if(sb.length()>=2&&sb.charAt(sb.length()-1)==cha &&sb.charAt(sb.length()-2)==cha){
                if(pq.isEmpty()){
                    break;
                }
                store sec= pq.poll();
                sb.append(sec.ch);
                sec.val--;
                if(sec.val>0){
                    pq.add(sec);
                }
                pq.add(first);


            }else{
                sb.append(cha);
                first.val--;
                if(first.val>0){
                    pq.add(first);
                }

            }
        }

        return sb.toString();
    }
}

class store{
    int val;
    char ch;
    public store(int val, char ch){
        this.val= val;
        this.ch= ch;
    }
}
