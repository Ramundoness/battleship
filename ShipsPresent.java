public class ShipsPresent
{
    
    public static int present() // checks if there are still ships remaining
    {
        int counter = 0;
        for(int rows = 0; rows<GameBoard.getArray().length; rows++)
        {
            for(int col = 0; col<GameBoard.getArray()[rows].length; col++)
            {
                if(GameBoard.getArray()[rows][col] == 1 ) 
                    counter++;
            }

        }
        return counter;
    }
}