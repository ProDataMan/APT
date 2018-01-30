package unit;

import static org.junit.Assert.*;
import org.junit.Test;
import apt.dice.before.DiceGame;

public class DiceGameBeforeTest {
	@Test
	public void throwDice() {
		DiceGame game = new DiceGame();
		int score = game.getScore();
		assertTrue(2 <= score && score <= 12);
	}
}
