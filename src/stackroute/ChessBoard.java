package stackroute;

public class ChessBoard {
	public static String[][] makeChessBoard(int n){
		String[][] board = new String[n][n];
		for(int i = 0; i<n ;i++) {
			for(int j = 1; j<n ; j++) {
				if((i+j)%2==0)
					board[i][j] = "WW|";
				else
					board[i][j] = "BB|";
			}
		}
		return board;
	}
}
