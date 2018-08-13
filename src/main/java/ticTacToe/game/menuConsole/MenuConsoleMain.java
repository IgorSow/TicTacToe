package ticTacToe.game.menuConsole;


import lombok.extern.slf4j.Slf4j;
import ticTacToe.gui.sample.Controller;

import java.util.Scanner;

import static ticTacToe.game.menuConsole.MenuPlayerVsComputer.menuPlayerVsComputer;
import static ticTacToe.game.menuConsole.MenuPlayerVsPlayer.menuPlayerVsPlayerConsole;

@Slf4j
public class MenuConsoleMain {

    public static void menuConsoleMain() {
        Scanner scanner = new Scanner(System.in);
        GameStatistic gameStatistic = new GameStatistic();

        log.info("We will play at TicTacToGame");
        log.info("Please select option who will play");
        log.info("1 - Player vs Player");
        log.info("2 - Player vs Computer");


        Controller.instance.getBUTTON_00().setOnAction(event -> {

            System.out.println("TEST BUTTON");
        });

        int chosenOption = scanner.nextInt();

//        while (false)
//        switch (chosenOption) {
//            case 1:
//                menuPlayerVsPlayerConsole(gameStatistic);
//                break;
//
//            case 2:
//                menuPlayerVsComputer();
//        }

    }




}
