package ticTacToe;

import lombok.extern.slf4j.Slf4j;
import ticTacToe.game.Game;
import ticTacToe.game.Logic;
import ticTacToe.game.Player;

@Slf4j
public class Main {

    public static void main(String[] args) {


        Player player1 = new Player("Janusz", "X");
        Player player2 = new Player("Grazyna", "O");

        Game newGame = new Game(player1, player2);


        newGame.playUntilWinner(player1,player2);


    }
}
