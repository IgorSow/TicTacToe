package ticTacToe.server2;

import ticTacToe.game.Game;
import ticTacToe.game.Participant;
import ticTacToe.game.Player;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);
        GameServer gameServer = new GameServer();


        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            Scanner receivedMessage = new Scanner(inputStream);

            String rawMessageFromClient = receivedMessage.nextLine();

            String messageToResponse = gameServer.handleMessage(rawMessageFromClient);


            sendMsgToClient(socket, messageToResponse);


//                OutputStream outputStream = socket.getOutputStream();
//                PrintWriter sentMessage = new PrintWriter(outputStream);
//
//            String[] msgToClient = messageToResponse.split("@");
//            for(int i =0; i < msgToClient.length; i++) {
//
//                sentMessage.println(msgToClient[i]);
//            }
//                sentMessage.flush();
//            socket.close();
        }


    }

    private static void sendMsgToClient(Socket socket, String messageTohandle) throws IOException {
        OutputStream outputStream = socket.getOutputStream();

        PrintWriter sendMessage = new PrintWriter(outputStream);

        sendMessage.println(messageTohandle);
        sendMessage.flush();
    }


}
