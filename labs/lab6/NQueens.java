package lab6;

public class NQueens {

	
	/**
	 * Be sure to read the assignment first, before looking at this code
	 * 
	 *   
	 *   Also, to call the code you wrote to detect if anything
	 *   captures a given (row,col), you write:
	 *   
	 *       Capture.whoCaptures(board, row, col)
	 *       
	 *   and that returns either null if nothing captures (row,col)
	 *   or it returns an int array of the row and column of a captor
	 *   of (row,col)
	 */
	
	 /**
	 * Return a solution to the n queens problem in 
	 * the form of a boolean array, where a true cell has a queen
	 * and a false cell is empty
	 * 
	 * You would be wise to watch the videos and read the instructions
	 *   about writing a helper method.
	 *   
	 * @param n, which is at least 4, so there is a solution
	 * @return the solution
	 */
	public static boolean[][] findSoln(int n) {
		QViz.setup(n);
		boolean[][] ans = new boolean[n][n];
		QViz.drawBoard(ans);
		//
		// FIXME
		//
		
		helper(0, n, ans);
		
		return ans;
	}
	
	public static boolean helper(int row, int n, boolean[][] board) {
		
		
		 // End case
		 //stop when our row is >= n
		 if(row >= n) {
			return true;
		 }
		 // put down a queen and check if valid
		 
		for(int col=0;col<board.length;col++) {
			
			if(Capture.whoCaptures(board, row, col) == null) {
				board[row][col] = true;
				
				if(helper(row+1, n, board) == true) { 
					return true;
				}
				
				 //move queen if can't get solution
				else{
					board[row][col] = false;
					
				}
				//move to next row
			}
			
			
		}
		
		 
		 
		
		return false;
	}
	
	public static void nqueens(int n) {
		boolean[][] board = findSoln(n);
		if (board != null) {
			System.out.println("Solution for " +n);
			System.out.println(Utils.boardToString(board, -1, -1));
			QViz.success(board);
		}
		else 
			System.out.println("No solution for " + n);
	}
	
	public static void main(String[] args0) {
		for (int i=4; i < 11; ++i) {
			nqueens(i);
		}
	}

}
