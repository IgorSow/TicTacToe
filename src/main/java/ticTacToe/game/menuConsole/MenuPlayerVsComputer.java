package ticTacToe.game.menuConsole;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.game.ArtificialPlayer;
import ticTacToe.game.Game;
import ticTacToe.game.Participant;
import ticTacToe.game.Player;

import java.util.Scanner;

@Slf4j
public class MenuPlayerVsComputer {
    private static String playerName;
    private static String chooseOfComputerSign;
    private static String chooseOfPlayerSign;

    public static void menuPlayerVsComputer() {
        Scanner scanner = new Scanner(System.in);
        GameStatistic gameStatistic = new GameStatistic();

        log.info("You will starting new game Player vs Computer");
        log.info("Please write name your name");
        playerName = scanner.nextLine();

        log.info("Please choose what sign you want to play");
        log.info("Please using UPPERCASE");
        chooseOfPlayerSign = scanner.nextLine();


        establishSigns();


        Participant player1 = new Player(playerName, chooseOfPlayerSign);
        Participant computer = new ArtificialPlayer(chooseOfComputerSign);

        boolean currentMenu = true;
        while (currentMenu) {


            Game game = new Game(player1, computer);

            gameStatistic.setNamePlayer1(player1.getName());
            gameStatistic.setSignPlayer1(player1.getSign());


            gameStatistic.setNamePlayer2(computer.getName());
            gameStatistic.setSignPlayer2(computer.getSign());

            log.info("Let's get start !");
            log.info("1 - start!");
            log.info("2 - show statistic");
            log.info("3 - back to main menu");

            int chosenOption = scanner.nextInt();


            switch (chosenOption) {
                case 1:
                    String resultOfGame = game.playUntilWinnerVsComputer();
                    gameStatistic.addStatisticAfterWin(resultOfGame);
                    break;

                case 2:
                    gameStatistic.printStatistic();
                    break;
            }
        }

    }

    private static void establishSigns() {
        if (chooseOfPlayerSign.equalsIgnoreCase("X")) {
            chooseOfComputerSign = "O";
        } else {
            chooseOfComputerSign = "X";
        }
    }
}
