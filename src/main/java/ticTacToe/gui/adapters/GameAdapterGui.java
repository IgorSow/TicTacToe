package ticTacToe.gui.adapters;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.game.Game;
import ticTacToe.game.Logic;
import ticTacToe.game.Player;
import ticTacToe.gui.myButton.MyButton;
import ticTacToe.gui.myButton.OnClickEvent;
import ticTacToe.gui.sample.Controller;

import java.awt.*;

@Slf4j
public class GameAdapterGui {
    Logic logic = new Logic();

    public void runGameGui() {


        Player player1 = new Player("Jurek", "X");
        Player player2 = new Player("Staszek", "O");
        final Player[] playerChose = {new Player()};
        playerChose[0] = player1;
        Game game = new Game(player1, player2);
        System.out.println("Gra juz dziala");

        //WYBIERAMY KTÓRY GRACZ BEDZIE ZAGRYWAŁ

        Controller.instance.getBUTTON_PLAYER1().setOnAction(event -> {
            playerChose[0] = player1;
        });

        Controller.instance.getBUTTON_PLAYER2().setOnAction(event -> {
            playerChose[0] = player2;
        });
        checkButton(playerChose, game);


    }

    private void checkButton(Player[] playerChose, Game game) {
        // ROW 0
        Controller.instance.getBUTTON_00().setOnAction(event -> {
            if (Controller.instance.getBUTTON_00().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 0, playerChose[0]);
                Controller.instance.getBUTTON_00().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });

        Controller.instance.getBUTTON_01().setOnAction(event -> {
            if (Controller.instance.getBUTTON_01().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 1, playerChose[0]);
                Controller.instance.getBUTTON_01().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });

        Controller.instance.getBUTTON_02().setOnAction(event -> {
            if (Controller.instance.getBUTTON_02().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 2, playerChose[0]);
                Controller.instance.getBUTTON_02().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });


        //ROW 1
        Controller.instance.getBUTTON_10().setOnAction(event -> {
            if (Controller.instance.getBUTTON_10().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 0, playerChose[0]);
                Controller.instance.getBUTTON_10().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });

        Controller.instance.getBUTTON_11().setOnAction(event -> {
            if (Controller.instance.getBUTTON_11().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 1, playerChose[0]);
                Controller.instance.getBUTTON_11().setText(playerChose[0].getSign());
                checkWinner(game);

            }

        });

        Controller.instance.getBUTTON_12().setOnAction(event -> {
            if (Controller.instance.getBUTTON_12().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 2, playerChose[0]);
                Controller.instance.getBUTTON_12().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });


        //ROW 2
        Controller.instance.getBUTTON_20().setOnAction(event -> {
            if (Controller.instance.getBUTTON_20().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 0, playerChose[0]);
                Controller.instance.getBUTTON_20().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });
        Controller.instance.getBUTTON_21().setOnAction(event -> {
            if (Controller.instance.getBUTTON_21().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 1, playerChose[0]);
                Controller.instance.getBUTTON_21().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });
        Controller.instance.getBUTTON_22().setOnAction(event -> {
            if (Controller.instance.getBUTTON_22().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 2, playerChose[0]);
                Controller.instance.getBUTTON_22().setText(playerChose[0].getSign());
                checkWinner(game);
            }

        });
    }

    private void checkWinner(Game game) {
        Controller.instance.getTEXT_WINNER()
                .setText("The winner is :  \n\b" + logic.isWinGame(game.getBoard()));
    }


}


/*
//        MyButton button_00 = new MyButton(Controller.getInstance().getBUTTON_00(), 0, 0);
//        MyButton button_01 = new MyButton(BUTTON_01, 0, 1);
//        MyButton button_02 = new MyButton(BUTTON_02, 0, 2);
//
//        MyButton button_10 = new MyButton(BUTTON_10, 1, 0);
//        MyButton button_11 = new MyButton(BUTTON_11, 1, 1);
//        MyButton button_12 = new MyButton(BUTTON_12, 1, 2);
//
//        MyButton button_20 = new MyButton(BUTTON_20, 2, 0);
//        MyButton button_21 = new MyButton(BUTTON_21, 2, 1);
//        MyButton button_22 = new MyButton(BUTTON_22, 2, 2);
// button_00.onClick((x,y)-> System.out.println(x +" "+ y));
//
        Player player1 = new Player("Jurek","X");
        Player player2 = new Player("Staszek","O");

        Game game = new Game(player1,player2);
*/