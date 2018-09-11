package ticTacToe.mutliPlayerGame.server;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.mutliPlayerGame.client.AppClient;

import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class MenuNetvork {

    public static void menuNetwork(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        boolean currentMenu = true;
        while (currentMenu) {
            log.info("We will play at TicTacToGame");
            log.info("Version network");
            log.info("1 - Start server");
            log.info("2 - Run Client");


            int chosenOption = scanner.nextInt();

            switch (chosenOption) {
                case 1:
                    AppServer.main(args);
                    break;

                case 2:
                    log.info("Please write your server IP");
                    String host = scanner.next();
                    AppClient.main(args, host);
                    break;
                case 3:
                    currentMenu = false;
                    break;
            }
        }
    }
}