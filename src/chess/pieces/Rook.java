package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {

        if (super.getColor() == Color.WHITE) {

            return "♖";
        }
        return "♜";
    }

    /**
     * [nao foram inplementado todos os movimentos]
     * 
     */
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position auxPosition = new Position(0, 0);

        // above
        auxPosition.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;
            auxPosition.setRow(auxPosition.getRow() - 1);

        }
        // Verifica se a ultima possição é uma peace inimiga
        if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;

        }

        // Left
        auxPosition.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;
            auxPosition.setColumn(auxPosition.getColumn() - 1);

        }
        // Verifica se a ultima possição é uma peace inimiga
        if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;

        }

        // Right
        auxPosition.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;
            auxPosition.setColumn(auxPosition.getColumn() + 1);

        }
        // Verifica se a ultima possição é uma peace inimiga
        if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;

        }

        // Bellow
        auxPosition.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;
            auxPosition.setRow(auxPosition.getRow() + 1);

        }
        // Verifica se a ultima possição é uma peace inimiga
        if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
            mat[auxPosition.getRow()][auxPosition.getColumn()] = true;

        }

        return mat;
    }

}
