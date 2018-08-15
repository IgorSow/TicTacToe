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


        boolean currentMenu = true;
        while (currentMenu) {
            log.info("We will play at TicTacToGame");
            log.info("Please select option who will play");
            log.info("1 - Player vs Player");
            log.info("2 - Player vs Computer");
            log.info("3 - Back to main menu");


            int chosenOption = scanner.nextInt();

            switch (chosenOption) {
                case 1:
                    menuPlayerVsPlayerConsole();
                    break;

                case 2:
                    menuPlayerVsComputer();
                    break;
                case 3:
                    currentMenu = false;
                    break;
            }

        }


    }

}
