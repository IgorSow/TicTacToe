package ticTacToeTest;


import org.junit.Test;
import ticTacToe.game.Board;
import ticTacToe.game.Game;
import ticTacToe.game.Player;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    @Test // case 5a
    public void shouldCreateGame() {
        //given

        Player player1 = new Player("Janusz", "X");
        Player player2 = new Player("Grazyna", "O");

        Game game = new Game(player1, player2);

        //then
        assertThat(game).isNotNull();

    }

    @Test //case 5b
    public void shouldCheckMovePlayerOnBoard() throws Exception {
        //given

        Player player1 = new Player("Janusz", "X");
        Player player2 = new Player("Grazyna", "O");

        Game newGame = new Game(player1, player2);
        Game gameBeforeMove = new Game(player1, player2);

        //when

        gameBeforeMove.playerBetField(1, 1, player1);
        gameBeforeMove.playerBetField(1, 1, player2);

        Board boardNewGame = newGame.getBoard();
        Board boardGameBeforeMove = gameBeforeMove.getBoard();
        System.out.println(gameBeforeMove.getBoard().getField(1,1));

        //then

        assertThat(boardNewGame).isNotEqualTo(boardGameBeforeMove);
    }

    @Test
    public void shouldCheckMovePlayerByPlayer(){
        //given

        Player player1 = new Player("Janusz", "x");
        Player player2 = new Player("Grazyna", "O");

        Game newGame = new Game(player1, player2);

        //then

        System.out.println(newGame.playUntilWinner(newGame));


    }
}
