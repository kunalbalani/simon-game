package edu.nyu.pqs.simon;
/**
 * Class Simon used to simulate the Game Simon.
 * @author Kunal Balani
 *
 */
public class Simon 
{
	/**
	 * Program execution begins here
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SimonGame game = new SimonGame();
		
		SimonGameUi ui = new SimonGameUi(game);
		ui.setLocation(100,100);
		game.registerObserver(ui);
		game.play();

		//to add multiple UI's for the same game
		//SimonGameUi ui2 = new SimonGameUi(game);
		//ui2.setLocation(x,y);
		//game.registerObserver(ui2);
		//game.play();
		
	}

}
