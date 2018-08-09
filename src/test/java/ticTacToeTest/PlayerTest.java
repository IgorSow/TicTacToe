package ticTacToeTest;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;
import ticTacToe.game.Player;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@Slf4j
public class PlayerTest {

    @Test // case 3 a:
    public void shouldCheckIsItPosibleToCreateNewPlayer() {


        //given
        Player player1 = new Player("Grazyna","X");

        //when //then
        assertThat(player1).isNotNull();
        assertThat(player1.getSign()).isEqualToIgnoringCase("X");
    }

    @Test //case 3 b:
    public void shouldReturnPositionFromInput() {
        //given
        Player mockPlayer = mock(Player.class);
        when(mockPlayer
                .getInput()).thenReturn("1,1");
        when(mockPlayer
                .parseInput(Mockito.any(String.class)))
                .thenCallRealMethod();
        //when
        String readInputFormConsole = mockPlayer.getInput();
        int[] positions = mockPlayer.parseInput(readInputFormConsole);

        //then
        Assertions.assertThat(positions).containsExactly(1, 1);
    }
}
