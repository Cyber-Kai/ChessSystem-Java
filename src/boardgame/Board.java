package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Retorna a mat
     * 
     * @return [PT-BR]A matriz de Pieces, dado linha[row] e coluna[column]
     * @return [ENG]The hue of parts given the row and column
     */
    public Piece piece(int row, int colum) {
        return pieces[row][colum];
    }

    /**
     * 
     * @param position
     * @return A peça apatir da possição
     */
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

}
