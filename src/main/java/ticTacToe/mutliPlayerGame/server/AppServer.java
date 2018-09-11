package ticTacToe.mutliPlayerGame.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class AppServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);
        GameServerLogic gameServerLogic = new GameServerLogic();


        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            Scanner receivedMessage = new Scanner(inputStream);

            String rawMessageFromClient = receivedMessage.nextLine();

            String messageToResponse = gameServerLogic.handleMessage(rawMessageFromClient);


            sendMsgToClient(socket, messageToResponse);


            socket.close();
        }


    }

    private static void sendMsgToClient(Socket socket, String messageTohandle) throws IOException {
        OutputStream outputStream = socket.getOutputStream();

        PrintWriter sendMessage = new PrintWriter(outputStream);

        sendMessage.println(messageTohandle);
        sendMessage.flush();
    }


}
