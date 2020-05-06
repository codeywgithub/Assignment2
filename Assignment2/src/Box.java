

/**
 * The Box class models each individual box of the Grid
 */
public class Box {

   public Player content;			// The move this box holds (Empty, X, or O)
   public int row, col; 			// Row and column of this box (Not currently used but possibly useful in future updates)
 
   /****************** Constructor ********************/
   public Box(int row, int col) {
	   
	   // 2. TODO: Initialise the variables row, col, and content
	   
	   row=0;
	   col=0;
	   content = Player.EMPTY;
	   
  
   }
   
   /****************** Constructor ********************/
 
   
   
   /**
    * Clear the box content to EMPTY
    */
   public void clear() {
	   
      // TODO: Set the value of content to EMPTY (Remember this is an enum)
	   
	   content = Player.EMPTY;
	   
   }
 
   /**
    * Display the content of the box
    */
   public void display() {
	   
	   // TODO: Print the content of this box (" X " if it Player.X, " O " for Player.O and "   " for Player.Empty)
	   // Hint: Can use an if-else or switch statement
	   if (content == Player.X) {
		   System.out.println("X");
	   } else if (content == Player.O) {
		   System.out.println("O");
	   } else if (content == Player.EMPTY) {
		   System.out.println("   ");
	   }
	  
	   
   }
}