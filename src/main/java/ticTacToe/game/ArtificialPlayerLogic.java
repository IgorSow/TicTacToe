package ticTacToe.game;

import java.util.Random;

public class ArtificialPlayerLogic {

    //MUSI COS RETURNOWAC
    public static String computerMove(Board board, String signPlayer, String signComputer) {

        for (int i = 0; i <= 2; i++) {

            //CHECK ROW
            if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][1])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")
                    && board.getBoard()[i][2].equalsIgnoreCase("")
                    && !board.getBoard()[i][2].equalsIgnoreCase(signPlayer)) {
                board.betField(i, 2, signComputer);
                return null;

            } else if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")
                    && board.getBoard()[i][1].equalsIgnoreCase("")
                    && !board.getBoard()[i][1].equalsIgnoreCase(signPlayer)) {
                board.betField(i, 1, signComputer);
                return null;
            } else if (board.getBoard()[i][1].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][1].equalsIgnoreCase("")
                    && board.getBoard()[i][0].equalsIgnoreCase("")
                    && !board.getBoard()[i][0].equalsIgnoreCase(signPlayer)) {
                board.betField(i, 0, signComputer);
                return null;


                //CHECK COL
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[1][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")
                    && board.getBoard()[2][i].equalsIgnoreCase("")
                    && !board.getBoard()[2][i].equalsIgnoreCase(signPlayer)) {
                board.betField(2, i, signComputer);
                return null;
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")
                    && board.getBoard()[1][i].equalsIgnoreCase("")
                    && !board.getBoard()[1][i].equalsIgnoreCase(signPlayer)) {
                board.betField(1, i, signComputer);
                return null;
            } else if (board.getBoard()[1][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[1][i].equalsIgnoreCase("")
                    && board.getBoard()[0][i].equalsIgnoreCase("")
                    && !board.getBoard()[0][i].equalsIgnoreCase(signPlayer)) {
                board.betField(0, i, signComputer);
                return null;
            }
        }
        //CHECK CROSS
        if (board.getBoard()[0][0].equalsIgnoreCase(board.getBoard()[1][1])
                && !board.getBoard()[0][0].equalsIgnoreCase("")
                && board.getBoard()[2][2].equalsIgnoreCase("")
                && !board.getBoard()[2][2].equalsIgnoreCase(signPlayer)) {
            board.betField(2, 2, signComputer);
            return null;
        } else if (board.getBoard()[1][1].equalsIgnoreCase(board.getBoard()[2][2])
                && board.getBoard()[0][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[0][0].equalsIgnoreCase(signPlayer)) {
            board.betField(0, 0, signComputer);
            return null;

        } else if (board.getBoard()[0][0].equalsIgnoreCase(board.getBoard()[2][2])
                && board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[0][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase(signPlayer)) {
            board.betField(1, 1, signComputer);
            return null;

        } else if (board.getBoard()[2][0].equalsIgnoreCase(board.getBoard()[1][1])
                && board.getBoard()[0][2].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[0][2].equalsIgnoreCase(signPlayer)) {
            board.betField(0, 2, signComputer);
            return null;

        } else if (board.getBoard()[2][0].equalsIgnoreCase(board.getBoard()[0][2])
                && board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[2][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase(signPlayer)) {
            board.betField(1, 1, signComputer);
            return null;

        } else if (board.getBoard()[1][1].equalsIgnoreCase(board.getBoard()[0][2])
                && board.getBoard()[2][0].equalsIgnoreCase("")
                && !board.getBoard()[1][1].equalsIgnoreCase("")
                && !board.getBoard()[2][0].equalsIgnoreCase(signPlayer)) {
            board.betField(2, 0, signComputer);
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
                    board.betField(x, y, signComputer);
                    ret = false;
                    break;
                }
            }
        }
        return null;


    }
}
