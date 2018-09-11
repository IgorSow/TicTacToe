package ticTacToe.mutliPlayerGame.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class AppClient {


    public static void main(String[] args) throws IOException {

        String resultOfTheGame = null;
        Socket registeringSocket = new Socket("localhost", 8085);
        GameClientLogic gameClientLogic = new GameClientLogic();

        gameClientLogic.registerPlayer(registeringSocket);

        boolean isFinish = false;
        while (!isFinish) {

            Socket socket = new Socket("localhost", 8085);

            gameClientLogic.playUntilWin(socket);
            socket.close();
            while (isFinish){

                Socket checkWinner = new Socket("localhost",8085);

                resultOfTheGame = gameClientLogic.gameEnded(checkWinner);

                isFinish = Boolean.parseBoolean(resultOfTheGame);

                if (isFinish == false){
                    Socket resultOfGame = new Socket("localhost",8085);

                    resultOfTheGame = gameClientLogic.checkWinner(resultOfGame);
                }




            }

//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("napisz wiadomosc :");
//
//            String writeMsgToServer = scanner.nextLine();
//            sendMesgToServer(socket, writeMsgToServer);
//
//            String messageFromServer = gerMessageFromServer(socket);
//
//
//            printMessageFromServer(messageFromServer);

//
        }
        System.out.println("Result of the game is: " + resultOfTheGame);
    }

    private static void printMessageFromServer(String messageFromServer) {
        String[] splittedMessage = messageFromServer.split("@");

        for (String message : splittedMessage) {

            System.out.println(message);
        }
    }

    private static String gerMessageFromServer(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        Scanner receiveMessage = new Scanner(inputStream);

        String ret = receiveMessage.nextLine();
        return ret;
    }

    private static void sendMesgToServer(Socket socket, String msgToServer) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter sendMessage = new PrintWriter(outputStream);

        sendMessage.println(msgToServer);
        sendMessage.flush();
    }


}
