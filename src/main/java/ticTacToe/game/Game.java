package ticTacToe.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Logic logic;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.logic = new Logic();
        this.board = new Board();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Board getBoard() {
        return board;
    }

    public boolean playerBetField(int row, int col, Player player) {

        String playerSign = player.getSign();

        if (board.betField(row, col, playerSign) == true) {

            log.info("Player " + player.getName() + " added move row " + row + " and col " + col);
            return true;
        } else
            System.out.println(" DUPA U PLAYERA");
            return false;

    }


    public String playUntilWinner(Game game) {

        Board boardToCheck = game.getBoard();


        return logic.isWinGame(boardToCheck);
    }
}
