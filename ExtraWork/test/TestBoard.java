import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.Board;

import static org.junit.jupiter.api.Assertions.*;

public class TestBoard {
    private Board game;

    @BeforeEach
    void setUp() {
        game = new Board();
    }
    @Test
    public void iCanMakeAMove() {
        assertTrue(game.makeMove(0,0,'X'));
    }

    @Test
    public void whenITryToMoveToSamePositionThatIHaveMovedToBefore() {
        game.makeMove(0,0,'X');
        assertThrows(IllegalArgumentException.class, () -> game.makeMove(0,0,'O'),
                "This Position has been occupied by player X");
    }

    @Test
    public void whenSameSymbolIsOnARowReturnThePlayerOfTheSymbolTheWinner() {
        game.makeMove(0, 0, 'X');
        game.makeMove(0, 1, 'X');
        game.makeMove(0, 2, 'X');
        String winner ="Player X wins!";
        assertEquals(winner, game.checkWinner());
    }

    @Test
    public void whenSameSymbolIsOnAColumnReturnThePlayerOfTheSymbolTheWinner() {
        game.makeMove(0, 0, 'X');
        game.makeMove(1, 0, 'X');
        game.makeMove(2, 0, 'X');
        String winner ="Player X wins!";
        assertEquals(winner, game.checkWinner());
    }

    @Test
    public void whenSameSymbolAreDiagonallyEqualReturnThePlayerOfTheSymbolTheWinner() {
        game.makeMove(0, 0, 'X');
        game.makeMove(1, 1, 'X');
        game.makeMove(2, 2, 'X');
        String winner ="Player X wins!";
        assertEquals(winner, game.checkWinner());
    }

    @Test
    public void whenSameSymbolAreDiagonallyEqualOnTheOtherSideReturnThePlayerOfTheSymbolTheWinner(){
        game.makeMove(0, 2, 'X');
        game.makeMove(1, 1, 'X');
        game.makeMove(2, 0, 'X');
        String winner ="Player X wins!";
        assertEquals(winner, game.checkWinner());
    }

    @Test
    public void whenBoardIsFullReturnDrawNoWinner() {
        game.makeMove(0, 0, 'X');
        game.makeMove(1, 0, 'O');
        game.makeMove(2, 0, 'X');
        game.makeMove(1, 1, 'O');
        game.makeMove(1, 2, 'X');
        game.makeMove(2, 1, 'O');
        game.makeMove(0,1,'X');
        game.makeMove(0,2,'O');
        game.makeMove(2,2,'X');
        String winner ="The game is over!" + " Draw!!!";
        assertEquals(winner, game.checkWinner());
    }
}
