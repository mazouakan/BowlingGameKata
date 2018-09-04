package service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BowlingGame game = new BowlingGame();
		
		game.roll2("14 45 6/ 5/ X 01 7/ 6/ X 2/6");
		System.out.println(game.getScore());
		
		game.roll(5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5);
		System.out.println(game.getScore());

	}

}
