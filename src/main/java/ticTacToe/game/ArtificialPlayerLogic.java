package ticTacToe.game;

import java.util.Random;

public class ArtificialPlayerLogic {

    //MUSI COS RETURNOWAC
    public static String computerMove(Board board, String sign) {

        for (int i = 0; i <= 2; i++) {

            //CHECK ROW
            if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][1])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")
                    && board.getBoard()[i][2].equalsIgnoreCase("")) {
                board.betField(i, 2, sign);
                return null;

            } else if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")
                    && board.getBoard()[i][1].equalsIgnoreCase("")) {
                board.betField(i, 1, sign);
                return null;
            } else if (board.getBoard()[i][1].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][1].equalsIgnoreCase("")
                    && board.getBoard()[i][0].equalsIgnoreCase("")) {
                board.betField(i, 0, sign);
                return null;


                //CHECK COL
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[1][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")
                    && board.getBoard()[2][i].equalsIgnoreCase("")) {
                board.betField(2, i, sign);
                return null;
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")
                    && board.getBoard()[1][i].equalsIgnoreCase("")) {
                board.betField(1, i, sign);
                return null;
            } else if (board.getBoard()[1][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[1][i].equalsIgnoreCase("")
                    && board.getBoard()[0][i].equalsIgnoreCase("")) {
                board.betField(0, i, sign);
                return null;
            }
        }
        //CHECK CROSS
        if (board.getBoard()[0][0].equalsIgnoreCase(board.getBoard()[1][1])
                && !board.getBoard()[0][0].equalsIgnoreCase("")
                && board.getBoard()[2][2].equalsIgnoreCase("")) {
            board.betField(2, 2, sign);
            return null;
        } else if (board.getBoard()[1][1].equalsIgnoreCase(board.getBoard()[2][2])
                && board.getBoard()[0][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")) {
            board.betField(0, 0, sign);
            return null;

        } else if (board.getBoard()[0][0].equalsIgnoreCase(board.getBoard()[2][2])
                && board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[0][0].equalsIgnoreCase("")) {
            board.betField(1, 1, sign);
            return null;

        } else if (board.getBoard()[2][0].equalsIgnoreCase(board.getBoard()[1][1])
                && board.getBoard()[0][2].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")) {
            board.betField(0, 2, sign);
            return null;

        } else if (board.getBoard()[2][0].equalsIgnoreCase(board.getBoard()[0][2])
                && board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[2][0].equalsIgnoreCase("")) {
            board.betField(1, 1, sign);
            return null;

        } else if (board.getBoard()[1][1].equalsIgnoreCase(board.getBoard()[0][2])
                && board.getBoard()[2][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")) {
            board.betField(1, 1, sign);
            return null;
        }

        // RANDOM

        else {
            boolean ret = true;
            while (ret) {
                int x;
                int y;

                x = new Random().nextInt(3);
                y = new Random().nextInt(3);
                if (board.getBoard()[x][y].equalsIgnoreCase("")) {
                    board.betField(x, y, sign);
                    ret = false;
                    break;
                }
            }
        }
        return null;


    }
}
