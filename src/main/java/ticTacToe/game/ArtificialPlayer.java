package ticTacToe.game;

import java.util.Random;

public class ArtificialPlayer implements Participant {
    private String name;
    private String sign;

    public ArtificialPlayer(){

    }

    public ArtificialPlayer(String sign) {
        this.name = "Computer";
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
}
