package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {

        return "k";
    }

    public String line() {

        if (super.getColor() == Color.WHITE) {
            return "♔";

        } else {
            return "♚";

        }
    }

    /**
     * Verifica se o rei pode execultar o movimento
     * 
     * @param position Dada a possição verifica se ela atende ao requisitos de
     *                 movimentação da Piece KING
     * @return true seja possivel ou caso não false
     */
    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != getColor();
    }

    /**
     * [nao foram inplementado todos os movimentos]
     * 
     */

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return mat;

    }

}
