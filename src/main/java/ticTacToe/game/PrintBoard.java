package ticTacToe.game;

public class PrintBoard {

    public static void printBoard(Board board){


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

}
