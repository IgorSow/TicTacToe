package ticTacToeTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import ticTacToe.game.ArtificialPlayer;
import ticTacToe.game.Game;
import ticTacToe.game.Participant;
import ticTacToe.game.Player;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Slf4j
public class ArtificialPlayerTest {

    @Test
    public void shouldCheckItIsPossibleToCreateNewArtificialPlayer(){
        //given
        Participant computer1 = new ArtificialPlayer("O");

        assertThat(computer1).isNotNull();
    }


    @Test
     public void  shouldCheckItIsPossibleToInputPlayerAndArtificialPlayerInTheSameGame(){
        //given
        Participant player2 = new Player("Janusz","X");
        Participant computer = new ArtificialPlayer("O");

        Game game = new Game(computer,player2);


        log.info(game.getPlayer1().getName());
        log.info(game.getPlayer2().getName());

        log.info(game.getPlayer1().getSign());
        log.info(game.getPlayer2().getSign());
        //then

    }


}