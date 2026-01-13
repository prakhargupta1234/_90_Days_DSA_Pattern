package Day5;

public class Lowest_Common_Ancestor_of_a_Binary_Tree_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public Node lowestCommonAncestor(Node p, Node q) {
	        //Approach 1
	    //     Set<Node> set= new HashSet<>();
	    //     while(p!= null){
	    //         set.add(p);
	    //         p= p.parent;
	    //     }

	    //     while(q!= null){
	    //         if(set.contains(q)){
	    //             return q;
	    //         }
	    //         q= q.parent;
	    //     }
	    //    return null;

	        Node p1=p;
	        Node q1= q;
	        while(p1!= q1){
	            if(p1==null){
	                p1= q;
	            }else{
	                 p1= p1.parent;
	            }
	            if(q1== null){
	                q1= p;
	            }else{
	                  q1= q1.parent;
	            } 
	          
	        }
	        return p1;
	    }

}
