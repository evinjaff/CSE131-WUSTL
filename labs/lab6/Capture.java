package lab6;

public class Capture {

	/**
	 * Be sure to read the assignment first, before looking at this code
	 * 
	 * Given the current board, find any queen on the board now
	 *     that could capture
	 *     a piece located at (row, col)
	 *     If no such queen  exists, return null
	 *     
	 * Read carefully:  there could be multiple captors present on the 
	 *   board, but you just return ONE such queen in terms of her
	 *   row and column in the return value of this method.
	 *   The row and column you return would correspond to a queen currently
	 *   on the board who could capture a piece at the (row, col) provided
	 *   to this method.
	 *   
	 * @param board The current board
	 * @param row the row of a proposed piece
	 * @param col the column of a proposed piece
	 * @return new int { r, c} where r and c are the row and column of
	 *   a captor of the proposed piece.  If no captors exist, return null
	 */
	public static int[] whoCaptures(boolean[][] board, int row, int col) {
		//
		// If you are looking at this code and have not read the instructions
		//    for this assignment, you are making a mistake.
		//    Go and read the instructions!!
		//
		// The following code always returns (0,0) as the captor
		//   You must replace the code below so that the CaptureTest passes
		//   based on the instructions, comments, and videos about this
		//

		int captorRow = 0;
		int captorCol = 0;
		/*
		for(int rw=-1; rw<board.length;rw++){ 
			for(int cl=-1; cl<board.length;cl++){
				if(board[rw][cl] = true) {
					captorRow = rw;
					captorCol = cl;
				}
			}
		}

		 */
		for(int rw=0; rw<board.length;rw++) { //runs for every row
			for(int cl=0; cl<board.length;cl++) {

					if (board[rw][cl] == true) { 
						if(rw == row) {
							captorRow = rw;
							captorCol = cl;
							return new int[] { captorRow, captorCol };
						}
						// Same Column
						if(cl == col) {
							captorRow = rw;
							captorCol = cl;
							return new int[] { captorRow, captorCol };
						}

						// Diagonal (↗️)
						if(col + row  == rw + cl) {
							captorRow = rw;
							captorCol = cl;
							return new int[] { captorRow, captorCol };

						}
						// Diagonal (↖)

						if(col-cl == row-rw) {
							captorRow = rw;
							captorCol = cl;
							return new int[] { captorRow, captorCol };
						}
					}
				//same Row
				



				//if diagnonally accessible downleft


			}
		}
		/*
		whoCaptures(board, row + 1, col);
		whoCaptures(board, row, col +1);
		whoCaptures(board, row + 1, col + 1);
		*/

		return null;
















	}
}