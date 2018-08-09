package ticTacToe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Board {

    private String[][] board = new String[3][3];

    public Board() {

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board.length; j++)
                board[i][j] = "";

    }


    public String[][] getBoard() {
        return board;
    }


    public void setBoard(String[][] board) {
        this.board = board;
    }


    public boolean betField(int row, int col, String sign) {

        if (row > 2 || col > 2 || (!sign.equals("X") && !sign.equals("O"))) {
            log.info("We play in TicTacToe add value 0 do 2 and pick X or O");
            return false;
        }
        if (board[row][col].equals("")) {
            board[row][col] = sign;
            return true;
        } else
            log.info("The field is not empty have to bet in other place ");
        return false;
    }


    public String getField(int row, int col) throws Exception {

        String ret = "";
        try {
            ret = board[row][col];
        } catch (Exception e) {
            log.info("In correct place");
        }
        return ret;
    }


}
