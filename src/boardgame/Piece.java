package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//A posição é iniciada nula, indicando que a peça ainda não esta no tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
}
