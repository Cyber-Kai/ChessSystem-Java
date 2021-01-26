package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Definido como null indicado que a peça não foi posicionada 
    }

    protected Board getBoard() {
        return board;
    }




}
