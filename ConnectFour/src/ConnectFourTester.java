
public class ConnectFourTester{

	public static void main(String[] args) {
		ConnectFour game = new ConnectFour();
		String[][] grid = game.board();
		boolean x = true;
				
			int cnt = 0;
			game.boardShow(grid);
				
			while (x = true) {
					
				if (cnt %2 == 0) {
					game.aPlayer(grid);
					}
				else {
					game.bPlayer(grid);
					}
					
				cnt++;
				game.boardShow(grid);
					
				if (game.decWinner(grid) != null) {
					if (game.decWinner(grid) == "A") {
						System.out.println("A wins!!");
						x = false;
						System.exit(cnt);
					}
						
					else if (game.decWinner(grid) == "B") {
						System.out.println("B wins!!");
						x = false;
						System.exit(cnt);
					}
				}
			}
		}
}
