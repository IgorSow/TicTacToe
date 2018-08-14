package ticTacToe;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

import static ticTacToe.game.menuConsole.MenuConsoleMain.menuConsoleMain;
import static ticTacToe.gui.sample.Main.main;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        log.info("Wybiesz rodzaj gry : ");
        log.info("1. Wersja w wierszu poleceń");
        log.info("2. Wersja graficzna");

        int chooseGame = scanner.nextInt();

        if (chooseGame == 1){
            menuConsoleMain();
        }
        if (chooseGame == 2){
            ticTacToe.gui.sample.Main.main(args);

        }

    }

}
