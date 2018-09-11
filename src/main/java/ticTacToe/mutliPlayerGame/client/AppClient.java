package ticTacToe.mutliPlayerGame.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class AppClient {


    public static void main(String[] args , String host) throws IOException {

        String resultOfTheGame = null;
        GameClientLogic gameClientLogic = new GameClientLogic(host,8085);

        gameClientLogic.registerPlayer();

        boolean isFinish = false;
        while (!isFinish) {


            gameClientLogic.playUntilWin();

            resultOfTheGame = gameClientLogic.checkWinner();
            System.out.println(resultOfTheGame);
            if("X".equalsIgnoreCase(resultOfTheGame) || "Y".equalsIgnoreCase(resultOfTheGame)){
                isFinish = true;
            }else{

            String gameEnded = gameClientLogic.gameEnded();
            System.out.println(gameEnded);
            isFinish = Boolean.parseBoolean(gameEnded);
            }



        }
        System.out.println("Result of the game is: " + resultOfTheGame);
    }
//
//    private static void printMessageFromServer(String messageFromServer) {
//        String[] splittedMessage = messageFromServer.split("@");
//
//        for (String message : splittedMessage) {
//
//            System.out.println(message);
//        }
//    }
//
//    private static String gerMessageFromServer(Socket socket) throws IOException {
//        InputStream inputStream = socket.getInputStream();
//        Scanner receiveMessage = new Scanner(inputStream);
//
//        String ret = receiveMessage.nextLine();
//        return ret;
//    }
//
//    private static void sendMesgToServer(Socket socket, String msgToServer) throws IOException {
//        OutputStream outputStream = socket.getOutputStream();
//        PrintWriter sendMessage = new PrintWriter(outputStream);
//
//        sendMessage.println(msgToServer);
//        sendMessage.flush();
//    }


}
