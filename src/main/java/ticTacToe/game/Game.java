package ticTacToe.game;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.gui.sample.Controller;

import java.awt.*;
import java.util.Scanner;

@Slf4j
public class Game {
    private Participant player1;
    private Participant player2;
    private Board board;
    private Logic logic;

    public Game(Participant player1, Participant player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.logic = new Logic();
        this.board = new Board();
    }

    public Participant getPlayer1() {
        return player1;
    }

    public Participant getPlayer2() {
        return player2;
    }

    public Board getBoard() {
        return board;
    }

    public boolean playerBetField(int row, int col, Participant player) {

        String playerSign = player.getSign();

        return board.betField(row, col, playerSign);
    }


    public String playUntilWinner() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int row2;
        int col2;

        boolean ret = true;
        while (ret) {
            do {

                log.info(player1.getName() + " please give your move ");
                log.info("Please give a row : ");
                row = scanner.nextInt();
                log.info("Please give a col : ");
                col = scanner.nextInt();


            }
            while (playerBetField(row, col, player1) == false);
            PrintBoard.printBoard(board);
            if ((logic.isWinGame(board).equalsIgnoreCase("X")
                    || logic.gameEnded(board))) {

                break;
            }

            do {
                log.info(player2.getName() + " please give your move ");
                log.info("Please give a row : ");
                row2 = scanner.nextInt();
                log.info("Please give a col: ");
                col2 = scanner.nextInt();

            }
            while (playerBetField(row2, col2, player2) == false);
            PrintBoard.printBoard(board);
            if (logic.isWinGame(board).equalsIgnoreCase("o")
                    || logic.gameEnded(board)) {

                break;
            }

        }
        log.info("Result : " + logic.isWinGame(board));
        return logic.isWinGame(board);
    }
}