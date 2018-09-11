package ticTacToe.game;

public class PrintBoard {

    public static void printBoard(Board board) {


        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.println("-----------");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {

                System.out.print(board.getBoard()[i][j] + " ");
                System.out.print("| ");
            }
        }
        System.out.println();
        System.out.println("-----------");


    }

    public static String printBoardNetwork(Board board) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            stringBuilder.append(" @");
            stringBuilder.append("----------@");
            stringBuilder.append("| ");
            for (int j = 0; j < 3; j++) {

                stringBuilder.append(board.getBoard()[i][j] + " ");
                stringBuilder.append("| ");
            }
        }
        stringBuilder.append("@");
        stringBuilder.append("----------@");

        return stringBuilder.toString();
    }

}
