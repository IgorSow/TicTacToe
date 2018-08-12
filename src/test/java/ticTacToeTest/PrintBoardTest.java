package ticTacToeTest;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import ticTacToe.game.Board;
import ticTacToe.game.PrintBoard;

@Slf4j
public class PrintBoardTest {

    @Test //case

    public void shouldPrintEmptyBoard(){
        //given
        Board board = new Board();

        //when and then

        PrintBoard.printBoard(board);
    }
    @Test
    public void shouldPrintBoardAfterOneMove() {

        //given
        Board board = new Board();

        //when

        board.betField(0,0,"X");


        //then
        PrintBoard.printBoard(board);
    }
    @Test
    public void shouldPrintBoardAfterMoveThanOne() {

        //given
        Board board = new Board();

        //when

        board.betField(0,0,"X");
        board.betField(1,1,"O");
        board.betField(2,2,"X");

        //then
        PrintBoard.printBoard(board);
    }
}
