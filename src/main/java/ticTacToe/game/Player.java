package ticTacToe.game;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Player implements Participant{

    private String name;
    private String sign;

    public Player(){

    }


    public Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    @Override
    public String getSign() {
        return sign;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String[] returnCordinates(){

        String[] ret = new String[2];

        Scanner scanner = new Scanner(System.in);
        log.debug("Pleace give row: ");
        ret[0] = scanner.nextLine();

        log.debug("Please give a col");
        ret[0] = scanner.nextLine();

        return ret;
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int[] parseInput(String positions) {
        String[] resultS = positions.split(",");
        return new int[]{Integer.parseInt(resultS[0]),
                Integer.parseInt(resultS[1])};
    }
}
