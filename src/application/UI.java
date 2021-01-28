package application;

import chess.ChessPiece;

public class UI {

    private final static String ALPHABET = "    A B C D E F G H";
    private final static String TOPLINE = "  ╔═════════════════╗";
    private final static String BOTLINE = "  ╚═════════════════╝";

    public static void printBoard(ChessPiece[][] pieces) {

        System.out.println(ALPHABET);
        System.out.println(TOPLINE);

        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ║ ");

            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }

            System.out.print("║ " + (8 - i) + "\n");
        }
        System.out.println(BOTLINE);
        System.out.println(ALPHABET);
    }

    /**
     * Print de uma unica peça
     * 
     * @param piece
     */
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print(".");
        } else {
            System.out.print(piece);
        }
        System.out.print (' ');
    }
}
