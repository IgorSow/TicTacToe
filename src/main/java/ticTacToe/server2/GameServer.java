package ticTacToe.server2;

import ticTacToe.game.*;

import java.util.Scanner;

public class GameServer {

    private Participant player1;
    private Participant player2;
    private Game game;
    private Logic logic;
    private Board board;


    public GameServer() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Game(player1, player2);
        this.logic = new Logic();
        this.board = new Board();
    }


    public String handleMessage(String receivedMessage) {


        String[] splitMessage = receivedMessage.split(" ");

        switch (splitMessage[0]) {


            case "hello":
                return setPlayersName(splitMessage);

            case "board":
                return PrintBoard.printBoardNetwork(board);

            case "move X":
                return board.betFieldNetwork(Integer.parseInt(splitMessage[1]), Integer.parseInt(splitMessage[2]), player1.getSign());

            case "move Y":
                return board.betFieldNetwork(Integer.parseInt(splitMessage[1]), Integer.parseInt(splitMessage[2]), player2.getSign());
            default:
                return PrintBoard.printBoardNetwork(board);
        }

    }

    private String setPlayersName(String[] splitMessage) {
        if (player1.getName() == null) {
            player1.setName(splitMessage[1]);
            player1.setSign("X");
            return "Welcome " + "@" + player1.getName() + "you have sign: " + player1.getSign();

        } else if (player2.getName() == null) {
            player2.setName(splitMessage[1]);
            player2.setSign("Y");
            return "Welcome " + "@" + player2.getName() + "you have sign: " + player2.getSign();
        } else {
            return "Game is full. On TicTacToe can play only two players";
        }

    }

//    public String autenticate(String rawMessageFromClient) {
//
//        String[] splitedMessage = rawMessageFromClient.split(" ");
//        String acces = splitedMessage[0];
//        String name = splitedMessage[1];
//
//        if (acces.equalsIgnoreCase("hello")) {
//            if (player1.getName() == null) {
//                player1.setName(name);
//                player1.setSign("X");
//            }
//            if (player2.getName() == null) {
//                player2.setName(name);
//                player2.setName("Y");
//            } else {
//                return "Game is full on TicTacToe can play only two players";
//            }
//        }
//
//
//        return splitedMessage;
//    }
}
