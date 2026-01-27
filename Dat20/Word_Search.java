package Dat20;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean exist(char[][] arr, String word) {
	        int n= arr.length;
	        int m = arr[0].length;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(arr[i][j]== word.charAt(0)){
	                    boolean f= false;
	                   f= dfs(arr, i , j, word, 0);
	                   if(f){
	                    return true;
	                   }
	                }
	            }
	        }

	        return false;
	    }

	    boolean dfs(char[][] board, int r, int  c ,String word, int idx){
	        if(idx== word.length()){
	            return true;
	        }
	        int row = board.length;
	        int col= board[0].length;
	        if(r<0|| c<0|| r>= row|| c>= col){
	            return false;
	        }

	        if(board[r][c]==' '|| board[r][c]!= word.charAt(idx)){
	            return false;
	        }

	        char ch= board[r][c];
	        board[r][c]= '$';
	        if(dfs( board, r+1,   c , word,  idx+1)||
	         dfs( board, r-1,   c , word,  idx+1)||
	         dfs( board, r,   c-1 , word,  idx+1) ||
	         dfs( board, r,   c+1, word,  idx+1) ){
	            return true;
	         }

	         board[r][c]= ch;
	         return false;
	    }

}
