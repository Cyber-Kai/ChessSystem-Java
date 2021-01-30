package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Definido como null indicado que a peça não foi posicionada
    }

    protected Board getBoard() {
        return board;
    }

    /**
     * Funcao verifica qual movimentos são possivel em relação a Board e retona uma
     * matiz de boolean estando em true os possivel movimentos
     * 
     * @return
     */
    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    /**
     * Verifica se existem qualquer movimento possivel caso sim
     * 
     * @return true, caso se esgote todas as possibilidade retorna false
     * 
     */
    public boolean isThereanyPossibleMove() {
        boolean[][] mat = possibleMoves();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                // Caso exista qualquer movimento possivel
                // o loop vai ser interrompido e retornar true
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        // caso todas as possibilidade forem esgotada
        // vai retorna True
        return false;
    }
}
