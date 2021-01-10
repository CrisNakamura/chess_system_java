package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("source: ");
            ChessPosition source = UI.readChessPosition(scan);

            System.out.println();
            System.out.println("target: ");
            ChessPosition target = UI.readChessPosition(scan);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
