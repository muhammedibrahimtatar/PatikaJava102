package main;
import game.*;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		game.selectChar();
		game.selectLocation();
	}
}
