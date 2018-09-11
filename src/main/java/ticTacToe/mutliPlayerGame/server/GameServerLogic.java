package ticTacToe.mutliPlayerGame.server;

import ticTacToe.game.*;

public class GameServerLogic {

    private Participant player1;
    private Participant player2;
    private Game game;
    private Logic logic;
    private Board board;


    public GameServerLogic() {
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

            case "moveX":
                return board.betFieldNetwork(Integer.parseInt(splitMessage[2]), Integer.parseInt(splitMessage[3]), player1.getSign());


            case "moveY":
                return board.betFieldNetwork(Integer.parseInt(splitMessage[2]), Integer.parseInt(splitMessage[3]), player2.getSign());
            case "checkWinner":
                return game.playUntilWinnerNetwork();

            case "gameEnded":
                return String.valueOf(game.gameEnded());
            default:
                return PrintBoard.printBoardNetwork(board);
        }

    }

    private String setPlayersName(String[] splitMessage) {
        if (player1.getName() == null) {
            player1.setName(splitMessage[1]);
            player1.setSign("X");
            return "Welcome " + player1.getName() + " you have sign: " + player1.getSign();

        } else if (player2.getName() == null) {
            player2.setName(splitMessage[1]);
            player2.setSign("Y");
            return "Welcome " + player2.getName() + " you have sign: " + player2.getSign();
        } else {
            return "Game is full. On TicTacToe can play only two players";
        }

    }


}