public class Solution {
	int[] unionSet; 
	boolean[] hasEdge; 

	private void union(int x, int y){
		int rootX = findSet(x); 
		int rootY = findSet(y); 
		this.unionSet[rootX] = rootY; 
		this.hasEdge[rootY] = this.hasEdge[rootX] || this.hasEdge[rootY]; 
	} 
	private void findSet(int x){
		if (unionSet[x] == x){
			return x; 
		}
		unionSet[x] = findSet(unionSet[x]); 
		return unionSet[x]; 
	}

	public void solve(char[][] board) {
		if (board.length == 0 || board[0].length == 0){
			return; 
		}	
		int height = board.length, width = board[0].length; 
		unionSet = new int[height * width]; 
		hasEdge = new boolean[height * width]; 
		for (int i = 0; i < unionSet.length; i++){
			unionSet[i] = i; 
		}
		for (int i = 0; i < hasEdge.length; i++){
			int x = i / width, y = i % width; 
			hasEdge[i] = (board[x][y] == 'O' && (x == 0 || x == height -1|| y == 0 || y == width-1)); 
		}
		for (int i = 0; i < unionSet.length; i++){
			int x = i / width, y = i % width, up = x - 1, right = y + 1; 
			if (up >= 0 && board[x][y] == board[up][y]){
				union(i, i - width); 
			}
			if (right < width && board[x][y] == board[x][right]){
				union(i, i+1); 
			}
		}
		for (int i = 0; i < unionSet.length; i++){
			int x = i / width, y = i % width; 
			if (board[x][y] == 'O' && !hasEdge[findSet(i)]){
				board[x][y] = 'X'; 
			}
		}
	}
}