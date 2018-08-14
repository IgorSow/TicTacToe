package ticTacToeTest;


import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;
import ticTacToe.game.Player;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ticTacToe.game.Board;
import ticTacToe.game.Game;
import ticTacToe.game.Player;


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
        System.out.println(gameBeforeMove.getBoard().getField(1, 1));

        //then

        assertThat(boardNewGame).isNotEqualTo(boardGameBeforeMove);
    }

    @Test  //case 5c
    public void shouldCheckMovePlayerByPlayer() throws Exception {
        //given

//        Player mockplayer1 = mock(Player("NAME","O")).class;
//        Player mockplayer2 = new Player("Grazyna", "O");
//
//        Game newGame = new Game(player1, player2);
//
//        //then
//
//       newGame.playUntilWinner(player1,player2);
    }

    @Test // case 5d
    public void shouldCheckEndAskingForMoveIfGameIsOver(){

    }

    @Test // case 5e
    public void shouldCheckReturnCoordinatesOfPlayerOnBoard(){

    }

    @Test // case 5f
    public void shouldCheckCorrectSignOfPlayer() {

    }

    @Test // case 5g
    public  void shouldCheckAfterMoveIsWin(){

    }

    @Test //case 5h
    public void shouldWhetherIsWinner(){

    }

    @Test //case 5i
    public void shouldCheckGameIsEndByDraw(){

    }

    @Test //case 5j
    public void shouldCheckGameIsDoped(){

    }

}
