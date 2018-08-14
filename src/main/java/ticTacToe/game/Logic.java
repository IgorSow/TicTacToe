package ticTacToe.game;

public class  Logic {
    private String winningLine = "No Winner";

    public String getWinningLine() {
        return winningLine;
    }

    public String isWinGame(Board board) {

        for (int i = 0; i < board.getBoard().length; i++) {

            // ROW
            if (board.getBoard()[i][0].equals(board.getBoard()[i][1])
                    && board.getBoard()[i][1].equals(board.getBoard()[i][2])
                    && !board.getBoard()[i][0].equals("")){
                winningLine = "ROW_" + i;
                return board.getBoard()[i][0];
            }


            //COL
            if (board.getBoard()[0][i].equals(board.getBoard()[1][i])
                    && board.getBoard()[1][i].equals(board.getBoard()[2][i])
                    && !board.getBoard()[0][i].equals("")){
                winningLine = "COL_" + i;
                return board.getBoard()[0][i];
            }


        }

        if (board.getBoard()[0][0].equals(board.getBoard()[1][1])
                && board.getBoard()[1][1].equals(board.getBoard()[2][2])
                && !board.getBoard()[0][0].equals("")){
            winningLine = "CROSS_1";
            return board.getBoard()[0][0];
        }


        if (board.getBoard()[2][0].equals(board.getBoard()[1][1])
                && board.getBoard()[1][1].equals(board.getBoard()[0][2])
                && !board.getBoard()[2][0].equals("")){
            winningLine = "CROSS_2";
            return board.getBoard()[2][0];
        }

        winningLine = "No Winner";
        return "No winner";
    }

    public boolean gameEnded(Board board) {

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {

                if (board.getBoard()[i][j].equalsIgnoreCase("")) {
                    return false;
                }

            }
        }
        return true;
    }



    //toDo czesc 5



}