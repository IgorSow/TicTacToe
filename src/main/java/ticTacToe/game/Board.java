package ticTacToe.game;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

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

        if (row > 2 || col > 2 || (!sign.equalsIgnoreCase("X") && !sign.equalsIgnoreCase("O"))) {
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
    public String betFieldNetwork(int row, int col, String sign) {

        if (row > 2 || col > 2 || (!sign.equalsIgnoreCase("X") && !sign.equalsIgnoreCase("O"))) {
            return "We play in TicTacToe add value 0 do 2 and pick X or O";

        }
        if (board[row][col].equals("")) {
            board[row][col] = sign;
            return "Correct Move";
        } else
            return"The field is not empty have to bet in other place ";

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board1 = (Board) o;

        return Arrays.deepEquals(board, board1.board);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(board);
    }
}
