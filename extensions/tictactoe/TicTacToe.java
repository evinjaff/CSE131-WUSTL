package tictactoe;

public class TicTacToe  {
	
	// avoids Javdoc entry: all methods for this work are static
	private TicTacToe() {
		
	}

	/**
	 * Generate an initial board
	 * @return a 3x3 String[][] array with each element set to a single blank string (" ").
	 */
	public static String[][] genBoard() {
		String [][] board = new String [3][3];
		
		for(int rw = 0; rw<board.length;rw++) { 
			for(int cl = 0;cl<board.length;cl++) {
				board [rw] [cl] = " ";
			}
		}
		
		return board; 
	}

	/**
	 * Check that the specified player is "x" or "o" and throw an
	 *   IllegalArgumentException if it is not.
	 * @param player should be "x" or "o"
	 */
	public static void verifyValidPlayer(String player) {
		if (player.equals("x") || player.equals("o")) {
			return; // all is well
		}
		else {
			throw new IllegalArgumentException("Player must be a single x or o, but was instead " + player);
		}
	}

	/**
	 * Check that the row is between 0 and 2, inclusively, throwing IllegalArgumentException if not.
	 * @param row should be between 0 and 2, inclusively
	 */
	public static void verifyValidRow(int row) {
		
		if(row > 2 || row < 0) {
			throw new IllegalArgumentException("Error: Row must be between 1 and 2");
		}
		
		
	}

	/**
	 * Check that the col is between 0 and 2, inclusively, throwing IllegalArgumentException if not.
	 * @param col should be between 0 and 2, inclusively
	 */
	public static void verifyValidCol(int col) {
		if(col > 2 || col < 0) {
			throw new IllegalArgumentException("Error: Column must be between 1 and 2");
		}
	
	}


	/**
	 * Returns a standard view of the current board
	 * @param board the current 3x3 tic tac toe board
	 * @return a String that looks like a tic tac toe board
	 */
	public static String prettyString(String[][] board) {
		String ans = "";
		for (int r=0; r < board.length; ++r) {
			for (int c=0; c < board[r].length; ++c) {
				ans += "| " + board[r][c] + " ";
			}
			ans += "|\n";
		}
		return ans;
	}

	/**
	 * Record a move of the player at the row and column.  You must
	 * <UL>
	 *   <LI> Make sure the player is valid (call {@link #verifyValidPlayer(java.lang.String)})
	 *   <LI> Make sure the row and column are valid (call {@link #verifyValidRow(int)} and {@link #verifyValidCol(int)})
	 *   <LI> Make sure the board has no move at the row and column.  In other words,
	 *     it should have just a single space there.  If the board already
	 *     has a move there, return false.
	 *   <LI> Record the move at the row and column by storing the player
	 *     String at board[row][col], and return true.
	 * </UL>
	 * 
	 * @param player an "x" or an "o"
	 * @param board a 3x3 String[][] array
	 * @param row an integer between 0 and 2 inclusively
	 * @param col an integer between 0 and 2 inclusively
	 * @return true iff the move was successful
	 */
	public static boolean makeMove(String player, String[][] board, int row, int col) {
		verifyValidPlayer(player);
		verifyValidRow(row);
		verifyValidCol(col);

		if(board[row][col] == " ") {
			board[row][col] = player;
			return true;
		}

		if(board[row][col] == "x" || board[row][col] == "o") {
			return false;
		}
		return false;



	}

	/**
	 * Is the board completely full of x and o moves?
	 * @param board a 3x3 String[][] array
	 * @return true iff the board is full
	 */
	public static boolean boardFull(String[][] board) {
		int fullcount = 0;
		for(int rw=0;rw<board.length;rw++) {
			for(int cl=0;cl<board.length;cl++) {
				if(board[rw][cl] == "x" || board[rw][cl] == "o") {
					fullcount++;
				}
			}
		}
		if(fullcount > 8) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Does the board contain a win for the player?  If it does, this method must return true 
	 *   even if the board also contains a win for the other player.
	 * @param player An "x" or "o". Any other input should throw an IllegalArgumentException
	 * @param board A 3x3 String[][] array
	 * @return true iff the board contains some win for the specified player
	 */
	public static boolean winFor(String player, String[][] board) {
		verifyValidPlayer(player);
		
		int rookTally = 0;
		
		for(int i=0;i<board.length;i++){
			if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
		
		for(int i=0;i<board.length;i++){
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}
		
		
		/*
		 * Works for:
		 *   O $ $
		 *   $ O $
		 *   $ $ O
		 * 
		 */
			
				if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
					return true;
				}
			
		
		
		/*
		 * Works for:
		 * $ $ O
		 * $ O $
		 * O $ $
		 */
		
		
			
			if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
					return true;
			}

		
		
		
		//check rows
		/*
		for(int k=0;k<board.length;k++) { // goes for every row
			boolean [] cases = new boolean [board.length+1];
			for(int i=0;i < board.length; i++) { // goes for every column
				if(board[i][k] == player) {
					cases[i] = true;
				}
			}
			//For loop that checks the Array
			
			if(cases[1] == true && cases[2] == true && cases[3] == true) {
				return true;
			}
		}
		
		for(int i = 0; i < 3; i++){
            if(board[i][0] != s)
                break;
            if(i == 2){
                //report win for s
            }
        }
		*/
		//horizontal case
		
		//diagonal case
		
		
		return false; // FIXME
	}

}
