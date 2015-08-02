public class Solution {
    public boolean exist(char[][] board, String word) {
  		char[] w = word.toCharArray(); 
  		for (int i = 0; i < board.length; i++){
  			for (int j = 0; j < board[0].length; j++){
  				if (exist(board, w, i, j, 0)){
  					return true; 
  				}
  			}
  		}
  		return false; 
  	}

  	private boolean exist(char[][] board, char[] word, int i, int j, int len){
  		if (len == word.length){
  			return true; 
  		}
  		if ( i < 0 || i >= board.length || j <0 || j >= board[0].length){
  			return false; 
  		}
  		if (boar[i][j] != word[len]){
  			return false; 
  		}

  		board[i][j] ^= 256; 

  		boolean exist = exist(board, word, i+1, j, len+1)
  					  || exist(board, word, i-1, j, len+1)
  					  || exist(board, word, i, j+1, len+1)
  					  || exist(board, word, i, j-1, len+1);
  		board[i][j] ^= 256; 

  		return exist;
  	}
}