package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Funcao pára verificar se uma perça no borde e inimiga
     * 
     * @param position
     * @return
     */
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece tmpPiece = (ChessPiece) getBoard().piece(position);
        return tmpPiece != null && tmpPiece.getColor() != color;

    }

}
