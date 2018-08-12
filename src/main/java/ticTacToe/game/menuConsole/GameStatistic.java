package ticTacToe.game.menuConsole;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameStatistic {
    private String namePlayer1;
    private String namePlayer2;
    private int valuePlayer1 = 0;
    private int valuePlayer2 = 0;

    public GameStatistic() {
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    public int getValuePlayer1() {
        return valuePlayer1;
    }

    public void setValuePlayer1(int valuePlayer1) {
        this.valuePlayer1 = valuePlayer1;
    }

    public int getValuePlayer2() {
        return valuePlayer2;
    }

    public void setValuePlayer2(int valuePlayer2) {
        this.valuePlayer2 = valuePlayer2;
    }


    public void addStatisticAfterWin(String playerSign){
        if ("X".equalsIgnoreCase(playerSign)){
            valuePlayer1 += 1;
        }else if("O".equalsIgnoreCase(playerSign)) {
            valuePlayer2 += 1;
        }
    }

    public void printStatistic() {
        log.info(namePlayer1 + " win games: " + valuePlayer1);
        log.info(namePlayer2 + " win games: " + valuePlayer2);
    }
}
