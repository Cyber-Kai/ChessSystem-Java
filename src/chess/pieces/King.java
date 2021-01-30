package chess.pieces;

import boardgame.Board;
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

    public String toString2() {

        if (super.getColor() == Color.WHITE) {
            return "♔";

        } else {
            return "♚";

        }
    }

}
