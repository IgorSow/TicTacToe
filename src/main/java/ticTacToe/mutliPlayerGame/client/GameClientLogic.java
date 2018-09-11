package ticTacToe.mutliPlayerGame.client;

import ticTacToe.game.Participant;
import ticTacToe.game.Player;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GameClientLogic {

    private Participant participant;
    private String host;
    private int port;

    public GameClientLogic(String host, int port) {
        this.host = host;
        this.port = port;
        this.participant = new Player();
    }

    public void registerPlayer() throws IOException {
        Socket socket = new Socket(host,port);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your name");
        String name = scanner.nextLine();

        String registerPlayer = "hello " + name;

        sendMessageToServer(socket, registerPlayer);


        String receiveFromServer = getMessageFromServer(socket);
        participant.setName(name);
        participant.setSign(receiveFromServer.substring(receiveFromServer.length()-1));

        breakIfGameIsFull(receiveFromServer);
        socket.close();
    }

    public void playUntilWin() throws IOException {
        Socket socket = new Socket(host,port);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write co-ordinates :");
        System.out.println("Number of rows are setting 0-2");
        String row = scanner.next();
        System.out.println("Please write column are setting 0-2");
        String col =scanner.next();

        String playerCoOrdinates =row + " " + col;
        String playerCommand = "move" + participant.getSign()+" "+playerCoOrdinates;

        System.out.println(playerCommand);
        sendMessageToServer(socket,playerCommand);


        String messageFromServer = getMessageFromServer(socket);

        System.out.println(messageFromServer);
        socket.close();
        printBoard();
    }

    private void printBoard() throws IOException {

        Socket socket = new Socket(host,port);
        sendMessageToServer(socket,"board");

        String boardFromServer = getMessageFromServer(socket);

        String[] splitedBoard = boardFromServer.split("@");

        for (String rowOfBoard : splitedBoard) {

            System.out.println(rowOfBoard);
        }
        socket.close();
    }










    private void breakIfGameIsFull(String receiveFromServer) {
        System.out.println(receiveFromServer);
        if ("game is full".equalsIgnoreCase(receiveFromServer)) {
            System.exit(600);
        }
    }

    private String getMessageFromServer(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        Scanner messageFromserver = new Scanner(inputStream);

        return messageFromserver.nextLine();
    }

    private void sendMessageToServer(Socket socket, String messageToServer) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        printWriter.println(messageToServer);
        printWriter.flush();
    }


    public String gameEnded() throws IOException {
        Socket socket = new Socket(host,port);

        sendMessageToServer(socket,"gameEnded");

        String responseFromServer = getMessageFromServer(socket);
        socket.close();

        return responseFromServer;
    }

    public String checkWinner() throws IOException {
        Socket socket = new Socket(host,port);
        sendMessageToServer(socket,"checkWinner");

        String responseFromServer = getMessageFromServer(socket);
        socket.close();

        return responseFromServer;
    }
}

