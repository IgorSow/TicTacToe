package ticTacToeTest;

import org.junit.Test;
import ticTacToe.game.Board;
import ticTacToe.game.Logic;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LogicTest {

    @Test // case 2: a
    public void shouldReturnNoWinnerInEmptyBoard() {
        //given
        Logic logic = new Logic();
        Board board = new Board();

        //when

        String noWinner = logic.isWinGame(board);

        //then
        assertThat(noWinner).isEqualToIgnoringCase("No winner");

    }

    @Test // case 2: b
    public void shouldReturnNoWinnersSignInRow() {
        //given
        Logic logic = new Logic();
        Board board = new Board();

        //when
        board.betField(0, 0, "O");
        board.betField(0, 1, "O");
        board.betField(0, 2, "O");

        String winner = logic.isWinGame(board);

        //then
        assertThat(winner).isEqualToIgnoringCase("O");
    }

    @Test // case 2: c
    public void shouldReturnNoWinnersSignInCol() {
        //given
        Logic logic = new Logic();
        Board board = new Board();

        //when
        board.betField(0, 0, "O");
        board.betField(1, 0, "O");
        board.betField(2, 0, "O");

        String winner = logic.isWinGame(board);

        //then
        assertThat(winner).isEqualToIgnoringCase("o");
    }

    @Test // case 2: d
    public void shouldReturnNoWinnersSignInCross() {
        //given
        Logic logic = new Logic();
        Board board = new Board();

        //when
        board.betField(0, 0, "O");
        board.betField(1, 1, "O");
        board.betField(2, 2, "O");

        String winner = logic.isWinGame(board);

        //then
        assertThat(winner).isEqualToIgnoringCase("O");
    }
}
