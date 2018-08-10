package ticTacToe.game;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

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

        return board.betField(row, col, playerSign);
    }


    public String playUntilWinner(Player player1, Player player2) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;

        do  {
            do {
                log.info(player1.getName() + " please give your move ");
                log.info("Please give a row : ");
                row = scanner.nextInt();
                log.info("Please give a col : ");
                col = scanner.nextInt();

            }
            while (playerBetField(row, col, player1) == false);

            do {
                log.info(player2.getName() + " please give your move ");
                log.info("Please give a row : ");
                row = scanner.nextInt();
                log.info("Please give a col: ");
                col = scanner.nextInt();

            }
            while (playerBetField(row, col, player2) == false);

        }while ((!logic.isWinGame(board).equals("X")
                || !logic.isWinGame(board).equals("0")
                || !logic.gameEnded(board)));
        return logic.isWinGame(board);
    }
}