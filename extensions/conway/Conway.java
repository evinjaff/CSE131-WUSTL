package conway;

import java.util.Arrays;

/**
 * 
 *
 */
public class Conway {

	
	//Instance Variables
	private int row, col;
	private boolean board [] [];

	public Conway(int rows, int cols){
		this.row = rows;
		this.col = cols;
		this.board = new boolean [this.row+1][this.col+1];
	}

	private Conway(int rows, int cols, boolean[][] board){
		this.row = rows;
		this.col = cols;
		this.board = board;
	}
	
	
	public int getRows(){
		return this.row;             // FIXME
	}

	public int getColumns(){
		return this.col;             // FIXME
	}

	/**
	 * Sets the current status of the cell at (row, col)
	 * @param b if true, the cell is alive; if false, the cell is dead 
	 * @param row
	 * @param col
	 */
	public void setLiveness(boolean b, int row, int col){
		
		
			if(b) {
				this.board[row][col] = true;
			}
			else {
				this.board[row][col] = false;
			}
	}


	/**
	 *  
	 * @param row
	 * @param col
	 * @return whether or not a cell at a specific row and column is alive. 
	 *    If row or col is out of bounds, you must return false.
	 */
	
	public boolean isAlive(int row, int col){
		try {
			for (int i=0; i< this.board.length;i++ ) {
				for (int j=0; j< this.board.length;j++ ) {
					//System.out.println("Board at [" + i + "][" + j + "] is " + this.board[i][j]);
					if(this.board[row][col]) {
						return true;
					}

				}
			}
		}
		catch(Exception ArrayIndexOutOfBoundsException){
			return false;
		}

		return false;
	}
		
		/*
		for (int i=0; i< this.board.length;i++ ) {
			for (int j=0; j< this.board.length;j++ ) {
				System.out.println("Board at [" + i + "][" + j + "] is " + this.board[i][j]);
			}
		}
		*/
		//return this.board[col][row];
		
	


	/**
	 * Make every cell not alive
	 */
	public void clear(){
		
		
		for (int i=0; i < this.board.length-1;i++ ) {
		    Arrays.fill(this.board[i], false);
		}
		
	}


	/**
	 * Consider the 3x3 cell array that has the cell at (row, col) at its center.
	 * Let's call all cells but that center cell the neighbors of that center cell.
	 * This method returns the number of neighbors that are alive.
	 * 
	 *   n  n  n
	 *   n  c  n
	 *   n  n  n
	 *   
	 *  Above, if c represents the cell at (row, col), each n is
	 *  a neighbor of c, according to the above definition.
	 *  The result is at most 8 and at least 0.
	 * 
	 * @param row
	 * @param col
	 * @return the number of living neighbors
	 */
	public int countLivingNeighbors(int row, int col){
		int livingCount = 0;
		
		
		
		
		
		//System.out.println("Original coord: [" + row + " , " +  col + "] ");
		
		for(int i=-1;i <= 1;i++) {
			for(int j=-1;j <= 1;j++) {
				int colNew = col+i;
				int rowNew = row+j;
				
					try {
						//System.out.println("[" + rowNew + " , " +  colNew + "] = " + this.board[rowNew][colNew]);
						
						if(this.board[rowNew][colNew] == true) {
							livingCount++;
							//System.out.println("livingCount = " + livingCount);
						}
					}
					catch(Exception ArrayIndexOutOfBoundsException){
						//System.out.println("out of bounds exception!");
					}
				
			}
			
			
		}
		
		if(this.board[row][col] == true) {
			livingCount--;
		}
		
		//System.out.println("\nEnd of Test\n");
		
		
		return livingCount;    
	}

	/**
	 * Executes a generation of life.  Be sure to read the specification
	 * for this assignment, because it points out a common mistake students
	 * make when implementing this method.
	 * 
	 */
	public void step(){
		Conway next = new Conway(this.row, this.col, this.board);
		
		
		
		boolean [][] boardNew = new boolean [this.board.length][this.board.length];
				
				
				
		
		for(int i=0;i < this.board.length;i++) {
			for(int j=0;j < this.board.length;j++) {
				boardNew [i][j] = this.board[i][j];
			}
		}
		//System.out.println("\n\n");
		
		for(int i=0;i<this.board.length;i++) {
			for(int k=0;k<this.board.length;k++) {
				
				/*
				if(this.board[i][k] && next.countLivingNeighbors(i, k) == 2) {
					boardNew[i][k] = true;
				}
				if(this.board[i][k] && next.countLivingNeighbors(i, k) == 3) {
					boardNew[i][k] = true;
				}
				*/
				//Works \/
				if(this.board[i][k] == false && this.countLivingNeighbors(i, k) == 3) {
					//System.out.println("\nFound living neighbors for [" + i + " , " + k + "] = " + this.countLivingNeighbors(i, k) + "\n");
					/*
					for(int p=0;p<this.board.length;p++) {
						for(int q=0;q<this.board.length;q++) {
							System.out.println("board at [ " + p + ", " + q + " ] = " + this.board[p][q]);
						}
						}
					*/
					boardNew[i][k] = true;
					
				}
				/*
				if(next.countLivingNeighbors(k, i) < 2) {
					boardNew[i][k] = false;
				}
				*/
				
				if(this.board[i][k] == true && this.countLivingNeighbors(i, k) > 3) {
					boardNew[i][k] = false;
				}
				
				if(this.board[i][k] == false && this.countLivingNeighbors(k, i) == 1) {
					//System.out.println("1 neighbor!");
					boardNew[k][i] = false;
				}
				
				System.out.println("\n\n");
			}
		}
		
		this.board = boardNew;
		
		
		
	}

	/**
	 * creates a blinker
	 */
	public void blinker() {

		if (this.getRows() < 3 || this.getColumns() < 3) {
			System.out.println("Grid is too small for premade pattern Blinker. " +
					"Conway must be at least 3x3");
		}
		else {
			this.setLiveness(true, 1, 0);
			this.setLiveness(true, 1, 1);
			this.setLiveness(true, 1, 2);
		}
	}

	public void fourBlinkers() {
		clear();
		if (this.getRows() < 9 || this.getColumns() < 9) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 9x9");
		}
		else {
			for (int i = 3; i < 6; i++) {
				for (int j = 3; j < 6; j++) {
					this.setLiveness(true, i, j);
				}
			}
		}
	}


	public void gosperGliderGun() {
		clear();
		if (this.getRows() < 50 || this.getColumns() < 50) {
			System.out.println("Grid is too small for premade pattern Gosper Glider Gun. " +
					"Conway must be at least 50x50");
		}
		else {
			this.setLiveness(true,0,27);
			this.setLiveness(true,1,25);
			this.setLiveness(true,1,27);
			this.setLiveness(true,2,15);
			this.setLiveness(true,2,16);
			this.setLiveness(true,2,23);
			this.setLiveness(true,2,24);
			this.setLiveness(true,2,37);
			this.setLiveness(true,2,38);
			this.setLiveness(true,3,14);
			this.setLiveness(true,3,18);
			this.setLiveness(true,3,23);
			this.setLiveness(true,3,24);
			this.setLiveness(true,3,37);
			this.setLiveness(true,3,38);
			this.setLiveness(true,4,3);
			this.setLiveness(true,4,4);
			this.setLiveness(true,4,13);
			this.setLiveness(true,4,19);
			this.setLiveness(true,4,23);
			this.setLiveness(true,4,24);
			this.setLiveness(true,5,3);
			this.setLiveness(true,5,4);
			this.setLiveness(true,5,13);
			this.setLiveness(true,5,17);
			this.setLiveness(true,5,19);
			this.setLiveness(true,5,20);
			this.setLiveness(true,5,25);
			this.setLiveness(true,5,27);
			this.setLiveness(true,6,13);
			this.setLiveness(true,6,19);
			this.setLiveness(true,6,27);
			this.setLiveness(true,7,14);
			this.setLiveness(true,7,18);
			this.setLiveness(true,8,15);
			this.setLiveness(true,8,16);


		}
	}

	public void glider() {
		clear();
		if (this.getRows() < 10 || this.getColumns() < 10) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 10x10");
		}
		else {

			this.setLiveness(true,1,1);
			this.setLiveness(true,1,3);
			this.setLiveness(true,2,2);
			this.setLiveness(true,2,3);
			this.setLiveness(true,3,2);

		}
	}

	public void yourDesignOne() {
		if(this.getRows() < 4 || this.getColumns() < 4) {
			System.out.println("grid too small for Arrow Design");
		}
		else {
			this.setLiveness(true,0,1);
			this.setLiveness(true,1,0);
			this.setLiveness(true,1,1);
			this.setLiveness(true,2,1);
			this.setLiveness(true,1,2);
			this.setLiveness(true,2,3);
			this.setLiveness(true,3,2);
			this.setLiveness(true,3,3);
		}
	}

	public void yourDesignTwo() {
		this.setLiveness(true,0,38);
		this.setLiveness(true,1,38);
		this.setLiveness(true,2,38);
		this.setLiveness(true,2,41);
		this.setLiveness(true,2,42);
		this.setLiveness(true,2,45);
		this.setLiveness(true,2,46);
		this.setLiveness(true,3,38);
		this.setLiveness(true,3,41);
		this.setLiveness(true,3,42);
		this.setLiveness(true,3,45);
		this.setLiveness(true,3,46);
		this.setLiveness(true,4,38);
		this.setLiveness(true,5,5);
		this.setLiveness(true,5,11);
		this.setLiveness(true,5,13);
		this.setLiveness(true,5,14);
		this.setLiveness(true,5,15);
		this.setLiveness(true,5,16);
		this.setLiveness(true,5,19);
		this.setLiveness(true,5,25);
		this.setLiveness(true,5,27);
		this.setLiveness(true,5,28);
		this.setLiveness(true,5,29);
		this.setLiveness(true,5,30);
		this.setLiveness(true,5,32);
		this.setLiveness(true,5,33);
		this.setLiveness(true,5,34);
		this.setLiveness(true,5,35);
		this.setLiveness(true,5,38);
		this.setLiveness(true,6,5);
		this.setLiveness(true,6,6);
		this.setLiveness(true,6,10);
		this.setLiveness(true,6,11);
		this.setLiveness(true,6,13);
		this.setLiveness(true,6,19);
		this.setLiveness(true,6,20);
		this.setLiveness(true,6,24);
		this.setLiveness(true,6,25);
		this.setLiveness(true,6,27);
		this.setLiveness(true,6,32);
		this.setLiveness(true,6,38);
		this.setLiveness(true,6,42);
		this.setLiveness(true,6,43);
		this.setLiveness(true,6,44);
		this.setLiveness(true,6,45);
		this.setLiveness(true,7,5);
		this.setLiveness(true,7,7);
		this.setLiveness(true,7,9);
		this.setLiveness(true,7,11);
		this.setLiveness(true,7,13);
		this.setLiveness(true,7,14);
		this.setLiveness(true,7,15);
		this.setLiveness(true,7,19);
		this.setLiveness(true,7,21);
		this.setLiveness(true,7,23);
		this.setLiveness(true,7,25);
		this.setLiveness(true,7,27);
		this.setLiveness(true,7,28);
		this.setLiveness(true,7,29);
		this.setLiveness(true,7,32);
		this.setLiveness(true,7,33);
		this.setLiveness(true,7,34);
		this.setLiveness(true,7,35);
		this.setLiveness(true,7,38);
		this.setLiveness(true,7,41);
		this.setLiveness(true,7,46);
		this.setLiveness(true,8,5);
		this.setLiveness(true,8,8);
		this.setLiveness(true,8,11);
		this.setLiveness(true,8,13);
		this.setLiveness(true,8,19);
		this.setLiveness(true,8,22);
		this.setLiveness(true,8,25);
		this.setLiveness(true,8,27);
		this.setLiveness(true,8,35);
		this.setLiveness(true,8,38);
		this.setLiveness(true,8,40);
		this.setLiveness(true,8,47);
		this.setLiveness(true,9,5);
		this.setLiveness(true,9,11);
		this.setLiveness(true,9,13);
		this.setLiveness(true,9,14);
		this.setLiveness(true,9,15);
		this.setLiveness(true,9,16);
		this.setLiveness(true,9,19);
		this.setLiveness(true,9,25);
		this.setLiveness(true,9,27);
		this.setLiveness(true,9,28);
		this.setLiveness(true,9,29);
		this.setLiveness(true,9,30);
		this.setLiveness(true,9,32);
		this.setLiveness(true,9,33);
		this.setLiveness(true,9,34);
		this.setLiveness(true,9,35);
		this.setLiveness(true,9,38);
		this.setLiveness(true,10,38);
		this.setLiveness(true,11,38);
		this.setLiveness(true,12,38);
		this.setLiveness(true,13,5);
		this.setLiveness(true,13,6);
		this.setLiveness(true,13,7);
		this.setLiveness(true,13,8);
		this.setLiveness(true,13,9);
		this.setLiveness(true,13,10);
		this.setLiveness(true,13,11);
		this.setLiveness(true,13,12);
		this.setLiveness(true,13,13);
		this.setLiveness(true,13,14);
		this.setLiveness(true,13,15);
		this.setLiveness(true,13,16);
		this.setLiveness(true,13,17);
		this.setLiveness(true,13,18);
		this.setLiveness(true,13,19);
		this.setLiveness(true,13,20);
		this.setLiveness(true,13,21);
		this.setLiveness(true,13,22);
		this.setLiveness(true,13,23);
		this.setLiveness(true,13,24);
		this.setLiveness(true,13,25);
		this.setLiveness(true,13,26);
		this.setLiveness(true,13,27);
		this.setLiveness(true,13,28);
		this.setLiveness(true,13,29);
		this.setLiveness(true,13,30);
		this.setLiveness(true,13,31);
		this.setLiveness(true,13,32);
		this.setLiveness(true,13,33);
		this.setLiveness(true,13,34);
		this.setLiveness(true,13,35);
		this.setLiveness(true,13,36);
		this.setLiveness(true,13,37);
		this.setLiveness(true,13,38);
		this.setLiveness(true,13,39);
		this.setLiveness(true,13,40);
		this.setLiveness(true,13,41);
		this.setLiveness(true,13,42);
		this.setLiveness(true,13,43);
		this.setLiveness(true,13,44);
		this.setLiveness(true,13,45);
		this.setLiveness(true,13,46);
		this.setLiveness(true,13,47);
		this.setLiveness(true,13,48);
		this.setLiveness(true,13,49);
		this.setLiveness(true,14,38);
		this.setLiveness(true,15,38);
		this.setLiveness(true,16,38);
		this.setLiveness(true,17,5);
		this.setLiveness(true,17,11);
		this.setLiveness(true,17,13);
		this.setLiveness(true,17,14);
		this.setLiveness(true,17,15);
		this.setLiveness(true,17,16);
		this.setLiveness(true,17,19);
		this.setLiveness(true,17,25);
		this.setLiveness(true,17,27);
		this.setLiveness(true,17,28);
		this.setLiveness(true,17,29);
		this.setLiveness(true,17,30);
		this.setLiveness(true,17,32);
		this.setLiveness(true,17,33);
		this.setLiveness(true,17,34);
		this.setLiveness(true,17,35);
		this.setLiveness(true,17,38);
		this.setLiveness(true,17,41);
		this.setLiveness(true,17,42);
		this.setLiveness(true,17,45);
		this.setLiveness(true,17,46);
		this.setLiveness(true,18,5);
		this.setLiveness(true,18,6);
		this.setLiveness(true,18,10);
		this.setLiveness(true,18,11);
		this.setLiveness(true,18,13);
		this.setLiveness(true,18,19);
		this.setLiveness(true,18,20);
		this.setLiveness(true,18,24);
		this.setLiveness(true,18,25);
		this.setLiveness(true,18,27);
		this.setLiveness(true,18,32);
		this.setLiveness(true,18,38);
		this.setLiveness(true,18,41);
		this.setLiveness(true,18,42);
		this.setLiveness(true,18,45);
		this.setLiveness(true,18,46);
		this.setLiveness(true,19,5);
		this.setLiveness(true,19,7);
		this.setLiveness(true,19,9);
		this.setLiveness(true,19,11);
		this.setLiveness(true,19,13);
		this.setLiveness(true,19,14);
		this.setLiveness(true,19,15);
		this.setLiveness(true,19,19);
		this.setLiveness(true,19,21);
		this.setLiveness(true,19,23);
		this.setLiveness(true,19,25);
		this.setLiveness(true,19,27);
		this.setLiveness(true,19,28);
		this.setLiveness(true,19,29);
		this.setLiveness(true,19,32);
		this.setLiveness(true,19,33);
		this.setLiveness(true,19,34);
		this.setLiveness(true,19,35);
		this.setLiveness(true,19,38);
		this.setLiveness(true,20,5);
		this.setLiveness(true,20,8);
		this.setLiveness(true,20,11);
		this.setLiveness(true,20,13);
		this.setLiveness(true,20,19);
		this.setLiveness(true,20,22);
		this.setLiveness(true,20,25);
		this.setLiveness(true,20,27);
		this.setLiveness(true,20,35);
		this.setLiveness(true,20,38);
		this.setLiveness(true,20,40);
		this.setLiveness(true,20,47);
		this.setLiveness(true,21,5);
		this.setLiveness(true,21,11);
		this.setLiveness(true,21,13);
		this.setLiveness(true,21,14);
		this.setLiveness(true,21,15);
		this.setLiveness(true,21,16);
		this.setLiveness(true,21,19);
		this.setLiveness(true,21,25);
		this.setLiveness(true,21,27);
		this.setLiveness(true,21,28);
		this.setLiveness(true,21,29);
		this.setLiveness(true,21,30);
		this.setLiveness(true,21,32);
		this.setLiveness(true,21,33);
		this.setLiveness(true,21,34);
		this.setLiveness(true,21,35);
		this.setLiveness(true,21,38);
		this.setLiveness(true,21,41);
		this.setLiveness(true,21,46);
		this.setLiveness(true,22,38);
		this.setLiveness(true,22,42);
		this.setLiveness(true,22,43);
		this.setLiveness(true,22,44);
		this.setLiveness(true,22,45);
		this.setLiveness(true,23,38);
		this.setLiveness(true,24,5);
		this.setLiveness(true,24,7);
		this.setLiveness(true,24,31);
		this.setLiveness(true,24,32);
		this.setLiveness(true,24,33);
		this.setLiveness(true,24,38);
		this.setLiveness(true,25,7);
		this.setLiveness(true,25,8);
		this.setLiveness(true,25,9);
		this.setLiveness(true,25,12);
		this.setLiveness(true,25,13);
		this.setLiveness(true,25,15);
		this.setLiveness(true,25,16);
		this.setLiveness(true,25,17);
		this.setLiveness(true,25,19);
		this.setLiveness(true,25,23);
		this.setLiveness(true,25,29);
		this.setLiveness(true,25,31);
		this.setLiveness(true,25,33);
		this.setLiveness(true,25,38);
		this.setLiveness(true,26,5);
		this.setLiveness(true,26,7);
		this.setLiveness(true,26,9);
		this.setLiveness(true,26,12);
		this.setLiveness(true,26,15);
		this.setLiveness(true,26,17);
		this.setLiveness(true,26,19);
		this.setLiveness(true,26,20);
		this.setLiveness(true,26,21);
		this.setLiveness(true,26,24);
		this.setLiveness(true,26,26);
		this.setLiveness(true,26,28);
		this.setLiveness(true,26,31);
		this.setLiveness(true,26,32);
		this.setLiveness(true,26,33);
		this.setLiveness(true,26,35);
		this.setLiveness(true,26,36);
		this.setLiveness(true,26,38);
		this.setLiveness(true,27,5);
		this.setLiveness(true,27,7);
		this.setLiveness(true,27,9);
		this.setLiveness(true,27,12);
		this.setLiveness(true,27,13);
		this.setLiveness(true,27,15);
		this.setLiveness(true,27,16);
		this.setLiveness(true,27,17);
		this.setLiveness(true,27,19);
		this.setLiveness(true,27,21);
		this.setLiveness(true,27,25);
		this.setLiveness(true,27,27);
		this.setLiveness(true,27,31);
		this.setLiveness(true,27,33);
		this.setLiveness(true,27,38);
		this.setLiveness(true,28,38);
		this.setLiveness(true,29,11);
		this.setLiveness(true,29,38);
		this.setLiveness(true,30,5);
		this.setLiveness(true,30,9);
		this.setLiveness(true,30,12);
		this.setLiveness(true,30,13);
		this.setLiveness(true,30,14);
		this.setLiveness(true,30,18);
		this.setLiveness(true,30,19);
		this.setLiveness(true,30,20);
		this.setLiveness(true,30,38);
		this.setLiveness(true,31,6);
		this.setLiveness(true,31,8);
		this.setLiveness(true,31,12);
		this.setLiveness(true,31,18);
		this.setLiveness(true,31,23);
		this.setLiveness(true,31,24);
		this.setLiveness(true,31,25);
		this.setLiveness(true,31,27);
		this.setLiveness(true,31,34);
		this.setLiveness(true,31,35);
		this.setLiveness(true,31,36);
		this.setLiveness(true,31,38);
		this.setLiveness(true,32,7);
		this.setLiveness(true,32,12);
		this.setLiveness(true,32,13);
		this.setLiveness(true,32,14);
		this.setLiveness(true,32,18);
		this.setLiveness(true,32,20);
		this.setLiveness(true,32,21);
		this.setLiveness(true,32,23);
		this.setLiveness(true,32,25);
		this.setLiveness(true,32,27);
		this.setLiveness(true,32,28);
		this.setLiveness(true,32,29);
		this.setLiveness(true,32,30);
		this.setLiveness(true,32,31);
		this.setLiveness(true,32,33);
		this.setLiveness(true,32,36);
		this.setLiveness(true,32,38);
		this.setLiveness(true,33,6);
		this.setLiveness(true,33,14);
		this.setLiveness(true,33,18);
		this.setLiveness(true,33,21);
		this.setLiveness(true,33,23);
		this.setLiveness(true,33,24);
		this.setLiveness(true,33,25);
		this.setLiveness(true,33,27);
		this.setLiveness(true,33,29);
		this.setLiveness(true,33,31);
		this.setLiveness(true,33,33);
		this.setLiveness(true,33,34);
		this.setLiveness(true,33,35);
		this.setLiveness(true,33,36);
		this.setLiveness(true,33,38);
		this.setLiveness(true,34,5);
		this.setLiveness(true,34,12);
		this.setLiveness(true,34,13);
		this.setLiveness(true,34,14);
		this.setLiveness(true,34,18);
		this.setLiveness(true,34,19);
		this.setLiveness(true,34,20);
		this.setLiveness(true,34,21);
		this.setLiveness(true,34,23);
		this.setLiveness(true,34,25);
		this.setLiveness(true,34,27);
		this.setLiveness(true,34,29);
		this.setLiveness(true,34,31);
		this.setLiveness(true,34,33);
		this.setLiveness(true,34,38);
		this.setLiveness(true,35,34);
		this.setLiveness(true,35,35);
		this.setLiveness(true,35,38);
		this.setLiveness(true,36,9);
		this.setLiveness(true,36,12);
		this.setLiveness(true,36,17);
		this.setLiveness(true,36,19);
		this.setLiveness(true,36,20);
		this.setLiveness(true,36,21);
		this.setLiveness(true,36,38);
		this.setLiveness(true,37,8);
		this.setLiveness(true,37,12);
		this.setLiveness(true,37,14);
		this.setLiveness(true,37,16);
		this.setLiveness(true,37,19);
		this.setLiveness(true,37,21);
		this.setLiveness(true,37,38);
		this.setLiveness(true,38,4);
		this.setLiveness(true,38,5);
		this.setLiveness(true,38,6);
		this.setLiveness(true,38,8);
		this.setLiveness(true,38,9);
		this.setLiveness(true,38,12);
		this.setLiveness(true,38,16);
		this.setLiveness(true,38,17);
		this.setLiveness(true,38,19);
		this.setLiveness(true,38,20);
		this.setLiveness(true,38,21);
		this.setLiveness(true,38,38);
		this.setLiveness(true,39,4);
		this.setLiveness(true,39,6);
		this.setLiveness(true,39,8);
		this.setLiveness(true,39,12);
		this.setLiveness(true,39,14);
		this.setLiveness(true,39,16);
		this.setLiveness(true,39,19);
		this.setLiveness(true,39,38);
		this.setLiveness(true,40,4);
		this.setLiveness(true,40,5);
		this.setLiveness(true,40,6);
		this.setLiveness(true,40,8);
		this.setLiveness(true,40,12);
		this.setLiveness(true,40,14);
		this.setLiveness(true,40,16);
		this.setLiveness(true,40,20);
		this.setLiveness(true,40,21);
		this.setLiveness(true,40,38);
		this.setLiveness(true,41,38);
		this.setLiveness(true,42,38);
		this.setLiveness(true,43,38);
		this.setLiveness(true,44,38);
		this.setLiveness(true,45,38);
		this.setLiveness(true,50,18);
		this.setLiveness(true,50,23);
		this.setLiveness(true,50,30);
		this.setLiveness(true,50,33);
	}


	public void logAndCapture() {
		
		System.out.println("\n\n Saved Configuration:\n\n");
		
		for(int i=0;i<this.board.length;i++) {
			for(int j=0;j<this.board.length;j++) {
				if(this.board[i][j]) {
					System.out.println("this.setLiveness(" + this.board[i][j] + "," + i + "," + j + ");");
				}
			}
		}
	}
	/*
	 * 
	 * 
this.setLiveness(true,5,5)
this.setLiveness(true,5,11)
this.setLiveness(true,5,13)
this.setLiveness(true,5,14)
this.setLiveness(true,5,15)
this.setLiveness(true,5,16)
this.setLiveness(true,5,19)
this.setLiveness(true,5,25)
this.setLiveness(true,5,27)
this.setLiveness(true,5,28)
this.setLiveness(true,5,29)
this.setLiveness(true,5,30)
this.setLiveness(true,5,32)
this.setLiveness(true,5,33)
this.setLiveness(true,5,34)
this.setLiveness(true,5,35)
this.setLiveness(true,6,5)
this.setLiveness(true,6,6)
this.setLiveness(true,6,10)
this.setLiveness(true,6,11)
this.setLiveness(true,6,13)
this.setLiveness(true,6,19)
this.setLiveness(true,6,20)
this.setLiveness(true,6,24)
this.setLiveness(true,6,25)
this.setLiveness(true,6,27)
this.setLiveness(true,6,32)
this.setLiveness(true,7,5)
this.setLiveness(true,7,7)
this.setLiveness(true,7,9)
this.setLiveness(true,7,11)
this.setLiveness(true,7,13)
this.setLiveness(true,7,14)
this.setLiveness(true,7,15)
this.setLiveness(true,7,19)
this.setLiveness(true,7,21)
this.setLiveness(true,7,23)
this.setLiveness(true,7,25)
this.setLiveness(true,7,27)
this.setLiveness(true,7,28)
this.setLiveness(true,7,29)
this.setLiveness(true,7,32)
this.setLiveness(true,7,33)
this.setLiveness(true,7,34)
this.setLiveness(true,7,35)
this.setLiveness(true,8,5)
this.setLiveness(true,8,8)
this.setLiveness(true,8,11)
this.setLiveness(true,8,13)
this.setLiveness(true,8,19)
this.setLiveness(true,8,22)
this.setLiveness(true,8,25)
this.setLiveness(true,8,27)
this.setLiveness(true,8,35)
this.setLiveness(true,9,5)
this.setLiveness(true,9,11)
this.setLiveness(true,9,13)
this.setLiveness(true,9,14)
this.setLiveness(true,9,15)
this.setLiveness(true,9,16)
this.setLiveness(true,9,19)
this.setLiveness(true,9,25)
this.setLiveness(true,9,27)
this.setLiveness(true,9,28)
this.setLiveness(true,9,29)
this.setLiveness(true,9,30)
this.setLiveness(true,9,32)
this.setLiveness(true,9,33)
this.setLiveness(true,9,34)
this.setLiveness(true,9,35)
this.setLiveness(true,50,18)
this.setLiveness(true,50,23)
this.setLiveness(true,50,30)
this.setLiveness(true,50,33)
*/

	 /*

this.setLiveness(true,5,5)
this.setLiveness(true,5,11)
this.setLiveness(true,5,13)
this.setLiveness(true,5,14)
this.setLiveness(true,5,15)
this.setLiveness(true,5,16)
this.setLiveness(true,5,19)
this.setLiveness(true,5,25)
this.setLiveness(true,5,27)
this.setLiveness(true,5,28)
this.setLiveness(true,5,29)
this.setLiveness(true,5,30)
this.setLiveness(true,5,32)
this.setLiveness(true,5,33)
this.setLiveness(true,5,34)
this.setLiveness(true,5,35)
this.setLiveness(true,6,5)
this.setLiveness(true,6,6)
this.setLiveness(true,6,10)
this.setLiveness(true,6,11)
this.setLiveness(true,6,13)
this.setLiveness(true,6,19)
this.setLiveness(true,6,20)
this.setLiveness(true,6,24)
this.setLiveness(true,6,25)
this.setLiveness(true,6,27)
this.setLiveness(true,6,32)
this.setLiveness(true,7,5)
this.setLiveness(true,7,7)
this.setLiveness(true,7,9)
this.setLiveness(true,7,11)
this.setLiveness(true,7,13)
this.setLiveness(true,7,14)
this.setLiveness(true,7,15)
this.setLiveness(true,7,19)
this.setLiveness(true,7,21)
this.setLiveness(true,7,23)
this.setLiveness(true,7,25)
this.setLiveness(true,7,27)
this.setLiveness(true,7,28)
this.setLiveness(true,7,29)
this.setLiveness(true,7,32)
this.setLiveness(true,7,33)
this.setLiveness(true,7,34)
this.setLiveness(true,7,35)
this.setLiveness(true,8,5)
this.setLiveness(true,8,8)
this.setLiveness(true,8,11)
this.setLiveness(true,8,13)
this.setLiveness(true,8,19)
this.setLiveness(true,8,22)
this.setLiveness(true,8,25)
this.setLiveness(true,8,27)
this.setLiveness(true,8,35)
this.setLiveness(true,9,5)
this.setLiveness(true,9,11)
this.setLiveness(true,9,13)
this.setLiveness(true,9,14)
this.setLiveness(true,9,15)
this.setLiveness(true,9,16)
this.setLiveness(true,9,19)
this.setLiveness(true,9,25)
this.setLiveness(true,9,27)
this.setLiveness(true,9,28)
this.setLiveness(true,9,29)
this.setLiveness(true,9,30)
this.setLiveness(true,9,32)
this.setLiveness(true,9,33)
this.setLiveness(true,9,34)
this.setLiveness(true,9,35)
this.setLiveness(true,50,18)
this.setLiveness(true,50,23)
this.setLiveness(true,50,30)
this.setLiveness(true,50,33)

	*/

}