package ticTacToe.game;

import java.util.Random;

public class ArtificalPlayer implements Participant {
    private String name;
    private String sign;

    public ArtificalPlayer(){

    }

    public ArtificalPlayer(String sign) {
        this.name = "Player Computer";
        this.sign = sign;
    }

    public void computerMove(Board board, String sign) {

        for (int i = 0; i < board.getBoard().length; i++) {

            //CHECK ROW
            if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][1])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")) {
                board.betField(i, 2, sign);
            } else if (board.getBoard()[i][0].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][0].equalsIgnoreCase("")) {
                board.betField(i, 1, sign);
            } else if (board.getBoard()[i][1].equalsIgnoreCase(board.getBoard()[i][2])
                    && !board.getBoard()[i][1].equalsIgnoreCase("")) {
                board.betField(i, 0, sign);

                //CHECK COL
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[1][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")) {
                board.betField(2, i, sign);
            } else if (board.getBoard()[0][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[0][i].equalsIgnoreCase("")) {
                board.betField(1, i, sign);
            } else if (board.getBoard()[1][i].equalsIgnoreCase(board.getBoard()[2][i])
                    && !board.getBoard()[1][i].equalsIgnoreCase("")) {
                board.betField(0, i, sign);

                //CHECK CROSS
            } else if (board.getBoard()[0][0].equalsIgnoreCase(board.getBoard()[1][1])
                    && !board.getBoard()[1][1].equalsIgnoreCase("")) {
                board.betField(2, 2, sign);
            } else if (board.getBoard()[2][0].equalsIgnoreCase(board.getBoard()[1][1])
                    && !board.getBoard()[1][1].equalsIgnoreCase("")) {
                board.betField(0, 2, sign);
            }
            // RANDOM

            else {
                boolean ret = true;
                while (ret) {
                    int x;
                    int y;

                    x = new Random().nextInt(2);
                    y = new Random().nextInt(2);
                    if (board.getBoard()[x][y].equalsIgnoreCase("")) {
                        board.betField(x, y, sign);
                        ret = false;
                        break;
                    }
                }
            }


        }
    }

    @Override
    public String getSign() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }
}
