package ticTacToe.game;

public class Logic {


    public String isWinGame(Board board) {

        for (int i = 0; i < board.getBoard().length; i++) {

            // ROW
            if (board.getBoard()[i][0].equals(board.getBoard()[i][1])
                    && board.getBoard()[i][1].equals(board.getBoard()[i][2])
                    && !board.getBoard()[i][0].equals(""))
                return board.getBoard()[i][0];
            //COL
            if (board.getBoard()[0][i].equals(board.getBoard()[1][i])
                    && board.getBoard()[1][i].equals(board.getBoard()[2][i])
                    && !board.getBoard()[0][i].equals(""))
                return board.getBoard()[0][i];
            }

        if (board.getBoard()[0][0].equals(board.getBoard()[1][1])
                && board.getBoard()[1][1].equals(board.getBoard()[2][2])
                && !board.getBoard()[0][0].equals(""))
            return board.getBoard()[0][0];

        if (board.getBoard()[2][0].equals(board.getBoard()[1][1])
                && board.getBoard()[1][1].equals(board.getBoard()[0][2])
                && !board.getBoard()[2][0].equals(""))
            return board.getBoard()[2][0];

        return  "No winner";
    }

    //toDo czesc 5

}