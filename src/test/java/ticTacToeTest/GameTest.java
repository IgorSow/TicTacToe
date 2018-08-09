package ticTacToeTest;


import org.junit.Test;
import ticTacToe.Board;
import ticTacToe.Player;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    @Test
    public void shouldCreateGame(){
        //given
        Board board = new Board();
        Player player1 = new Player("X");
        Player player2 = new Player("O");

        Game game = new Game(player1,player2,board);

        //then
        assertThat(game).isNotNull();

    }

    @Test void shouldCheckMovePlayerOnBoard(){
        //given
        Board board = new Board();
        Player player1 = new Player("X");
        Player player2 = new Player("O");

        Game game = new Game(player1,player2,board);

        //when
        game.playerBetField(player1);

        //then

        assertThat()

    }
}
