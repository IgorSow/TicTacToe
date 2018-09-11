package ticTacToe.gui.adapters;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.game.Game;
import ticTacToe.game.Logic;
import ticTacToe.game.Player;
import ticTacToe.gui.myButton.MyButton;
import ticTacToe.gui.myButton.OnClickEvent;
import ticTacToe.gui.sample.Controller;

import java.awt.*;
import java.util.Collection;
import java.util.Collections;

@Slf4j
public class GameAdapterGui {
    private Logic logic = new Logic();
    private final Player[] playerChose = {new Player()};
    private Player player1 = new Player("Name1", "X");
    private Player player2 = new Player("Name2", "O");

    public void runGameGui() {

        Controller.instance.getPANE_MAIN().getChildren().removeAll(
                Controller.instance.getROW_0(),
                Controller.instance.getROW_1(),
                Controller.instance.getROW_2(),

                Controller.instance.getCOL_0(),
                Controller.instance.getCOL_1(),
                Controller.instance.getCOL_2(),

                Controller.instance.getCROSS_1(),
                Controller.instance.getCROSS_2()
        );


        playerChose[0] = player1;
        Game game = new Game(player1, player2);
        System.out.println("Gra juz dziala");

        //WE ARE CHOOSING WHO WILL START

        Controller.instance.getBUTTON_PLAYER1().setOnAction(event -> {
            playerChose[0] = player1;
        });

        Controller.instance.getBUTTON_PLAYER2().setOnAction(event -> {
            playerChose[0] = player2;
        });

        checkButton(playerChose, game);
        printNameOnPane();


    }

    private void printNameOnPane() {
        Controller.instance.getBUTTON_ACCEPT_NAME().setOnAction(event -> {

            String takenPlayerName = Controller.instance.getTEXTFIELD_ENTER().getText();
            if ("Name1".equalsIgnoreCase(Controller.instance.getTEXT_GETNAME_PLAYER1().getText())) {
                player1.setName(takenPlayerName);
                Controller.instance.getTEXT_GETNAME_PLAYER1().setText(player1.getName());

            } else if ("Name2".equalsIgnoreCase(Controller.instance.getTEXT_GETNAME_PLAYER2().getText())) {
                player2.setName(takenPlayerName);
                Controller.instance.getTEXT_GETNAME_PLAYER2().setText(player2.getName());

            }

        });
    }

    private void checkButton(Player[] playerChose, Game game) {
        // ROW 0
        Controller.instance.getBUTTON_00().setOnAction(event -> {
            if (Controller.instance.getBUTTON_00().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 0, playerChose[0]);
                Controller.instance.getBUTTON_00().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });

        Controller.instance.getBUTTON_01().setOnAction(event -> {
            if (Controller.instance.getBUTTON_01().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 1, playerChose[0]);
                Controller.instance.getBUTTON_01().setText(playerChose[0].getSign());

                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });

        Controller.instance.getBUTTON_02().setOnAction(event -> {
            if (Controller.instance.getBUTTON_02().getText().equalsIgnoreCase("")) {
                game.playerBetField(0, 2, playerChose[0]);
                Controller.instance.getBUTTON_02().setText(playerChose[0].getSign());

                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });


        //ROW 1
        Controller.instance.getBUTTON_10().setOnAction(event -> {
            if (Controller.instance.getBUTTON_10().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 0, playerChose[0]);
                Controller.instance.getBUTTON_10().setText(playerChose[0].getSign());

                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });

        Controller.instance.getBUTTON_11().setOnAction(event -> {
            if (Controller.instance.getBUTTON_11().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 1, playerChose[0]);
                Controller.instance.getBUTTON_11().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();

            }

        });

        Controller.instance.getBUTTON_12().setOnAction(event -> {
            if (Controller.instance.getBUTTON_12().getText().equalsIgnoreCase("")) {
                game.playerBetField(1, 2, playerChose[0]);
                Controller.instance.getBUTTON_12().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });


        //ROW 2
        Controller.instance.getBUTTON_20().setOnAction(event -> {
            if (Controller.instance.getBUTTON_20().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 0, playerChose[0]);
                Controller.instance.getBUTTON_20().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });
        Controller.instance.getBUTTON_21().setOnAction(event -> {
            if (Controller.instance.getBUTTON_21().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 1, playerChose[0]);
                Controller.instance.getBUTTON_21().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });
        Controller.instance.getBUTTON_22().setOnAction(event -> {
            if (Controller.instance.getBUTTON_22().getText().equalsIgnoreCase("")) {
                game.playerBetField(2, 2, playerChose[0]);
                Controller.instance.getBUTTON_22().setText(playerChose[0].getSign());
                checkWinner(game);
                replacePlayerOnActualMove();
            }

        });
    }

    private void checkWinner(Game game) {


        String gameToCheck = logic.isWinGame(game.getBoard());

        Controller.instance.getTEXT_WINNER()
                .setText("The winner is :  \n" + gameToCheck);

        log.info(logic.getWinningLine());
        checkLine();
        turnOffButtonsAfterGameOver(gameToCheck);

    }

    private void turnOffButtonsAfterGameOver(String gameToCheck) {
        if (!("No winner").equalsIgnoreCase(gameToCheck)) {
            log.info("gra skonczona");

            Controller.instance.getBUTTON_00().setDisable(true);
            Controller.instance.getBUTTON_01().setDisable(true);
            Controller.instance.getBUTTON_02().setDisable(true);

            Controller.instance.getBUTTON_10().setDisable(true);
            Controller.instance.getBUTTON_11().setDisable(true);
            Controller.instance.getBUTTON_12().setDisable(true);


            Controller.instance.getBUTTON_20().setDisable(true);
            Controller.instance.getBUTTON_21().setDisable(true);
            Controller.instance.getBUTTON_22().setDisable(true);

        }
    }

    private void checkLine() {
        if (!logic.getWinningLine().equalsIgnoreCase("No Winner")) {

            if (logic.getWinningLine().equalsIgnoreCase("ROW_0")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getROW_0());
            }
            if (logic.getWinningLine().equalsIgnoreCase("ROW_1")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getROW_1());
            }
            if (logic.getWinningLine().equalsIgnoreCase("ROW_2")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getROW_2());
            }


            if (logic.getWinningLine().equalsIgnoreCase("COL_0")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getCOL_0());
            }
            if (logic.getWinningLine().equalsIgnoreCase("COL_1")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getCOL_1());
            }
            if (logic.getWinningLine().equalsIgnoreCase("COL_2")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getCOL_2());
            }


            if (logic.getWinningLine().equalsIgnoreCase("CROSS_1")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getCROSS_1());
            }
            if (logic.getWinningLine().equalsIgnoreCase("CROSS_2")) {
                Controller.instance.getPANE_MAIN().getChildren().add(
                        Controller.instance.getCROSS_2());
            }
        }

    }

    private void replacePlayerOnActualMove() {
        if (playerChose[0].getSign().equalsIgnoreCase("X")){
            playerChose[0] = player2;

        }
        else if (playerChose[0].getSign().equalsIgnoreCase("O")){
            playerChose[0] = player1;
        }
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