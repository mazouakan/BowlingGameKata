package test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import service.BowlingGame;

public class BowlingGameTest {
	
	private BowlingGame game;
	
	@Before
	public void setUp() {
		game = new BowlingGame();
	}
	
	@Test
	public void canScoreGutterGame() {
		game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertTrue("expected 0 but found " + game.getScore(),game.getScore()== 0);
	}
	
	@Test
	public void canScoreOne() {
		game.roll(1,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertTrue("expected 1 but found " + game.getScore(),game.getScore()== 1);
	}
	
	@Test
	public void canScoreSpareFollowedByThree() {
		game.roll(4,6, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertTrue("expected 16 but found " + game.getScore(),game.getScore()== 16);
	}
	
	@Test
	public void canScoreSpareFollowedBySpareFollowedByFour() {
		game.roll(0,0, 0,0, 0,0, 8,2, 5,5, 4,0, 0,0, 0,0, 0,0, 0,0);
		assertTrue("expected 33 but found " + game.getScore(),game.getScore()== 33);
	}
	
	@Test
	public void canScoreStrikeFollowedByTwoAndOne() {
		game.roll(0,0, 0,0, 0,0, 10, 3,1, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertTrue("expected 18 but found " + game.getScore(),game.getScore()== 18);
	}
	
	@Test
	public void canScorePerfectGame() {
		game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertTrue("expected 300 but found " + game.getScore(),game.getScore()== 300);
	}
	
	@Test
	public void canScoreAll9() {
		game.roll(9,0, 9,0, 9,0, 9,0, 9,0, 9,0, 9,0, 9,0, 9,0, 9,0);
		assertTrue("expected 90 but found " + game.getScore(),game.getScore()== 90);
	}
	
	@Test
	public void canScoreAllFive() {
		game.roll(5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5);
		assertTrue("expected 150 but found " + game.getScore(),game.getScore()== 150);
	}
}
