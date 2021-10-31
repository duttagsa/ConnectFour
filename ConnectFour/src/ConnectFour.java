 
import java.util.Scanner;

public class ConnectFour {
	
	// board method
	public String[][] board(){
		String[][] grid = new String[7][15];
		// row
		for (int r = 0; r < grid.length; r++) {
			// column
			for (int c = 0; c < grid[r].length; c++) {
				
			
				if (c%2 == 0) {
					grid[r][c] = "|";
				}
				else {
					grid[r][c] = " ";
				}
				
				if (r == 6) {
					grid[r][c] = "_";
				}
			}
		}
		return grid;
	}
	
	// A player
	public void aPlayer(String[][] grid) {
		System.out.println("Player A - Choose a column (0-6):  ");
		Scanner in = new Scanner(System.in);
		
		int aReply = in.nextInt(); 
		int ac = 2*aReply +1;
		
		for (int r = 5; r>= 0; r--) {
			if (grid[r][ac] == " ") {
				grid[r][ac] = "A";
				break;
			}
		}
	}
	
	// B player
		public void bPlayer(String[][] grid) {
			System.out.println("Player B - Choose a column (0-6):  ");
			Scanner in = new Scanner(System.in);
			
			int bReply = in.nextInt(); 
			int bc = 2*bReply +1;
			
			for (int r = 5; r>= 0; r--) {
				if (grid[r][bc] == " ") {
					grid[r][bc] = "B";
					break;
				}
			}
		}
	
	// declare winner
		public String decWinner(String[][]grid) {
			
			
			// horizontal
			for (int r = 0; r<6; r++) {
				for (int c = 0; c < 7; c+=2) {
					if ((grid[r][c+1] != " ") && (grid[r][c+3] != " ") && (grid[r][c+5] != " ")&& (grid[r][c+7] != " ")
						 && ((grid[r][c+1] == grid[r][c+3])
					     && (grid[r][c+3] == grid[r][c+5])
					     && (grid[r][c+5] == grid[r][c+7]))) {
						 return grid[r][c+1]; 
					}
						
				}
			}
			
			// vertical
			for (int r = 1; r <15; r +=2) {
				for (int c = 0; c <3; c++) {
					if ((grid[c][r] != " ") && (grid[c+1][r] != " ") && (grid[c+2][r] != " ")&& (grid[c+3][r] != " ")
							 && ((grid[c][r] == grid[c+1][r])
						     && (grid[c+1][r] == grid[c+2][r])
						     && (grid[c+2][r] == grid[c+3][r]))) {
						return grid[c][r]; 
					}		  
				}
			}
				
			// diagonal
			for(int r = 0; r < 3; r++) {
				for (int c = 1; c<9; c+=2) {
					if ((grid[r][c] != " ") && (grid[r + 1][c+2] != " ") && (grid[r+2][c+4] != " ")&& (grid[r+3][c+6] != " ")
							 && ((grid[r][c] == grid[r+1][c+2])
						     && (grid[r+1][c+2] == grid[r+2][c+4])
						     && (grid[r+2][c+4] == grid[r+3][c+6]))) {
						return grid[r][c];  
					}
				}
			}
			
			//diagonal
			for(int r = 0; r < 3; r++) {
				for (int c = 7; c<15; c+=2) {
					if ((grid[r][c] != " ") && (grid[r + 1][c-2] != " ") && (grid[r+2][c-4] != " ")&& (grid[r+3][c-6] != " ")
							 && ((grid[r][c] == grid[r+1][c-2])
						     && (grid[r+1][c-2] == grid[r+2][c-4])
						     && (grid[r+2][c-4] == grid[r+3][c-6]))) {
						return grid[r][c];  
					}
				}
			}
			
			// no winner
			return null;
		}
		
		// build board
		public void boardShow(String[][]grid) {
			for(int r = 0; r<grid.length; r++) {
				for(int c = 0; c<grid[r].length; c++) {
					System.out.print(grid[r][c]);	
				}
				System.out.println();
			}
		}
		
	}
