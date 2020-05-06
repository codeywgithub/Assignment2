import java.util.Scanner;				// Scanner required for player input

/**
 * The main class for the game Tic-Tac-Toe.
 * Controls the flow of the game, allowing each player to enter an option until the game ends.
 */

public class GameMain {
	private static Scanner scanner = new Scanner(System.in);  // Scanner for input
	
	private Grid grid;					// The game board
	private boolean gameOver;			// Whether game is playing or over
	private Player winner;				// Winner of the game
	private Player currentPlayer;		// Current player (enum)
 
   /**
    * Constructor
    * Sets up the game. Creates the grid and sets the values of the variables before calling the play method.
    */
	public GameMain() {
		   // Create the grid
		   
		   // TODO: Create a new instance of the "Grid"class
		   
		grid = new Grid();
		
		
		   // Reset the game variables to their defaults
		   
		   // TODO: Assign the default values for currentPlayer (Player.X), gameOver (false), and winner (null)

			currentPlayer = Player.X;
			gameOver = false;
			winner = null;
		
		   // Begin playing the game
		   
		   // TODO: Call the "play()" method
				play();
		
	   }
   
   /**
    * Controls the game play, rotates between player turns until a winner is decided.
    */
   public void play() {
	   do {
	         playerMove(currentPlayer);			// Have the player perform their move
	         grid.display();					// Display the current game board
	         checkForWinner(currentPlayer);		// Checks if the game has been won
	         
	         // Display results if game is over
	         if(gameOver) {
	        	 if(winner == Player.X) {
		        	 System.out.println("Player X wins!");
		         }
	        	 
	        	 // TODO: Display result if player O wins
	        	 
	        	 // TODO: Display result if it was a draw
	         }
	         
	         // Switch turn to the next player
	         if(currentPlayer == Player.X) {
	        	 currentPlayer = Player.O;
	         } else {
	        	 currentPlayer = Player.X;
	         }
	         
	      } while (!gameOver);  // repeat until game-over
   }
 
   /** 
    * Handles the player making their move, checks if the move is valid before making it.
    */
   public void playerMove(Player turnPlayer) {
	   
      boolean validInput = false;
      
      do {
    	  
    	  // Display instructions to the player
         if (turnPlayer == Player.X) {
            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
         } else {
            
        	 // TODO: Inform Player 'O' to enter their move
        	 System.out.println("Player '0', enter your move (row[1-3] column[1-3]): ");
        	 
         }
         
         // Obtains input from the player for both row and column
         int row = scanner.nextInt();
         int col = scanner.nextInt();
         
         // Decrease the value entered by 1 to compensate for the array index starting at 0
         row--;
         col--;
         
         // Verify the values the player entered are valid (position is valid and empty)
         if (row >= 0 && row < Grid.ROWS && col >= 0 && col < Grid.COLUMNS && grid.board[row][col].content == Player.EMPTY) {
        	 grid.board[row][col].content = turnPlayer;
        	 grid.currentRow = row;
        	 grid.currentCol = col;
        	 validInput = true;
         } else {
        	 
        	 // TODO: Display an error message that the move was not valid.
        	 System.out.println("That move was not valid!");
         }
         
      } while (!validInput);   // Repeat until input is valid
   }
 
   /**
    * Checks if the game has ended
    */
   public void checkForWinner(Player turnPlayer) {
      if (grid.hasWon(turnPlayer)) {
    	  
    	  // TODO: Set gameOver and winner appropriately
    	  gameOver = true;
    	  winner = currentPlayer;

      } else if (grid.isDraw()) {

    	  // TODO: Set gameOver and winner appropriately
    	  gameOver = true;
    	  // ============================================ need to add a winner here
      }
   }
 
 //------------------------------- Main class --------------------------------------------
   
   
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   boolean status = true;
	   int selectionMenu = 0;
	   boolean isNumber = true;
	 //------------------------------- Displays menu to user --------------------------------------------
	   while (status) {
	   System.out.println("                                             "); //create space
		System.out.println("Main Menu - Enter an option below between 1-2");
		System.out.println("----------------------------------------------");
		System.out.println("Press '1' to start a new game ");
		System.out.println("Press '2' to Exit ");
		System.out.println("----------------------------------------------");
		
		//------------------------------- Displays menu to user --------------------------------------------
	   
		//------------------------------- Error input checking --------------------------------------------
		
		do {
			if (scanner.hasNextInt()) { //if statement checks what the user types in to see if it is an integer. Will = true if int is entered.
				
				selectionMenu = scanner.nextInt(); //user input to selectionMenu
				
				isNumber=true; //user entered an int so we want to exit loop.
				
			} else {
				System.out.println("Incorrect input, enter 1 or 2"); //incorrect input message
				isNumber=false; 
				scanner.next(); //removes contents of Scanner to prevent an infinite loop.
			}
		} while (!(isNumber)); //flips isNumber to activate while statement
		
		//------------------------------- Error input checking --------------------------------------------
		
		
		//------------------------------- Selection choice --------------------------------------------
		
		switch(selectionMenu) {
		
		case 1: { //Display student marks
			new GameMain();
			status=false;
			break;

		}
		case 2: { //Display student grades
			System.out.println("Closing the program...");
			status=false;
			
			
			break;
			
		}
		
		default: {
			System.out.println("Invalid input");
			
			continue;
			
		}
		
		
	   }
		
		//------------------------------- Selection choice --------------------------------------------
	   
	   // TODO: Add a loop to restart the game once it has finished
	  
	  
	   // TODO: Then update the loop to ask the player if they want to play again, exit if they do not
	   
	
   }
   
}
   
}