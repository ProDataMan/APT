package unit;

import static org.junit.Assert.*;
import org.junit.Test;
import apt.dice.after.DiceGame;

public class DiceGameAfterTest {
	@Test
	public void rollDice() {
		DiceGame game = new DiceGame();
		int score = game.throwDice();
		assertTrue(2 <= score && score <= 12);
	}
}
