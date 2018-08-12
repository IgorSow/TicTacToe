package ticTacToe.game.menuConsole;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.game.Game;
import ticTacToe.game.Player;

import java.util.Scanner;

@Slf4j
public class MenuPlayerVsPlayer {

    public static void menuPlayerVsPlayerConsole(GameStatistic gameStatistic) {
        Scanner scanner = new Scanner(System.in);

        log.info("You will starting new game Player vs Player");
        log.info("Please write name for players");
        log.info("X - Player name: ");
        String player1Name = scanner.nextLine();
        log.info("O - Player name: ");
        String player2Name = scanner.nextLine();


        Player player1 = new Player(player1Name, "X");
        Player player2 = new Player(player2Name, "O");

        Game game = new Game(player1, player2);

        gameStatistic.setNamePlayer1(player1Name);
        gameStatistic.setNamePlayer2(player2Name);


        while (true) {
            log.info("Let's get start !");
            log.info("1 - start!");
            log.info("2 - show statistic");
            log.info("3 - back to main menu");

            int chosenOption = scanner.nextInt();


            switch (chosenOption) {
                case 1:
                    String resultOfGame = game.playUntilWinner();
                    gameStatistic.addStatisticAfterWin(resultOfGame);
                    break;

                case 2:
                    gameStatistic.printStatistic();
                    break;
            }
        }
    }
}
