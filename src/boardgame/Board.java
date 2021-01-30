package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: There must be at least 1 row and 1 column.");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    /**
     * Retorna a mat
     * 
     * @return [PT-BR]A matriz de Pieces, dado linha[row] e coluna[column]
     * @return [ENG]The hue of parts given the row and column
     */
    public Piece piece(int row, int colum) {
        if (!possitionExists(row, colum)) {
            throw new BoardException("Possition not on the board");
        }

        return pieces[row][colum];
    }

    /**
     * 
     * @param position
     * @return A peça apatir da possição
     */
    public Piece piece(Position position) {
        if (!possitionExists(position)) {
            throw new BoardException("Possition not on the board");
        }

        return pieces[position.getRow()][position.getColumn()];
    }

    /**
     * Funcao resposavel por posicionar uma peça no tabulheiro
     */
    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on positon " + position);
        }

        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;// Seta a posição atual da peça

    }
    /**
     * Dado uma Position remove a Piece que estiver lá, caso não haja Piece
     *  retorna null
     * @param position
     * @return a Piece caso haja uma na possição, caso contrario null
     */
    public Piece removePiece(Position position) {
        if (!possitionExists(position)) {
            throw new BoardException("Possition not on the board");
        }

        if (piece(position) == null) {
            return null;
        }
        // Removendo a peça e suas referencia do tabulheiro
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    /**
     * Dado uma row e um column verifica se a mesma é uma posição valida em relação
     * a rows and columns respectivamente
     * 
     * @return caso a condição seja antedida retorna true
     */
    private boolean possitionExists(int row, int column) {
        return row >= 0 && row < this.rows && column >= 0 && column < this.columns;

    }

    /**
     * Recebe uma position e caso seja valida retorna TRUE
     * 
     * @param position possição a ser validada
     * @return caso a posição seja valida retorna TRUE
     */
    public boolean possitionExists(Position position) {
        return possitionExists(position.getRow(), position.getColumn());

    }

    /**
     * Dado uma posição verifica-se se existe alguma peça
     */
    public boolean thereIsAPiece(Position position) {
        if (!possitionExists(position)) {
            throw new BoardException("Possition not on the board");
        }

        return piece(position) != null;
    }

}
