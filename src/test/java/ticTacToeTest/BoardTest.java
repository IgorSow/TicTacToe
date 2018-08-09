package ticTacToeTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import ticTacToe.game.Board;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



@Slf4j
public class BoardTest {

    @Test // case 1 : a
    public void shouldCreateBoard() {

        //given
        Board board = new Board();

        //when
        //we create default table 3 x 3

        //then

        assertThat(board).isNotNull();
    }

    @Test // case 1 : b
    public void shouldCheckIfBoardIsEmpty() {

        //given
        Board board = new Board();
        String[][] expect = new String[3][3];
        for (int i = 0; i < expect.length; i++)
            for (int j = 0; j < expect.length; j++)
                expect[i][j] = "";

        //when

        //we create default table 3 x 3

        //then
        assertThat(expect).isEqualTo(board.getBoard());
    }

    @Test // case 1 : c
    public void shouldAddCorrectMove() {

        //given
        Board board = new Board();

        //then

        board.betField(1, 1, "X");

        //then

        assertThat(board.getBoard()[1][1]).isEqualTo("X");


    }

    @Test // case 1 : d
    public void shouldNTMoveTheSamePlace() {
        //given
        Board board = new Board();

        //when

        boolean firstTryToBet = board.betField(1, 1, "X");
        boolean secondTryToBet = board.betField(1, 1, "X");

        //then
        assertThat(firstTryToBet).isTrue();
        assertThat(secondTryToBet).isFalse();
    }

    @Test // case 1: e
    public void shouldCheckInCorrectMove() {
        //given
        Board board = new Board();

        //when

        boolean tryToInncorectBet1 = board.betField(1, 1, "t");
        boolean tryToInncorectBet2 = board.betField(5, 8, "X");
        //then

        assertThat(tryToInncorectBet1).isFalse();
        assertThat(tryToInncorectBet2).isFalse();

    }

    @Test // case 1: f
    public void shouldCheckCorrectPlace() throws Exception {
        //given
        Board board = new Board();

        //when

        String tryToInncorectField = board.getField(2, 2);

        //then

        assertThat(tryToInncorectField).isEqualToIgnoringCase("");


    }

    @Test // case 1: g
    public void shouldCheckInCorrectPlace() throws Exception {
        //given
        Board board = new Board();

        //when
        String tryToInncorectField = board.getField(66, 66);

        //then

        assertThat(tryToInncorectField)
                .isNotEqualTo("X")
                .isNotEqualTo("O");
    }
}
