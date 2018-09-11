package ticTacToe.server2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8085);


        sendMesgToServer(socket,"hello kkk");

        String messageFromServer = gerMessageFromServer(socket);



        String[] splittedMessage = messageFromServer.split("@");

        for (String message : splittedMessage) {

        System.out.println(message);
        }


        socket.close();



    }

    private static String gerMessageFromServer(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        Scanner receiveMessage = new Scanner(inputStream);


        return receiveMessage.nextLine();
    }

    private static void sendMesgToServer(Socket socket, String msgToServer) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter sendMessage = new PrintWriter(outputStream);

        sendMessage.println(msgToServer);
        sendMessage.flush();
    }


}
