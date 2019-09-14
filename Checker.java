public class Checker
{
    private static int numOfHits;

    public static String check(int row, int column)
    {
        String result = "miss";

        if((row>-1 && row <10) && (column>-1 && column<10)) // make sure that correct numbers/ letters are inputted
        {
            for(int rows = 0; rows<GameBoard.getArray().length; rows++)
            {
                for(int col = 0; col<GameBoard.getArray()[rows].length; col++)
                {
                    if(GameBoard.getArray()[row][column] == 0)
                    {
                        GameBoard.getArray()[row][column] = 8;
                        GameBoard.getCoveredArray()[row][column] = 8;
                    }

                    if(GameBoard.getArray()[row][column] == 1)
                    {
                        numOfHits++;
                        result = "hit";
                        GameBoard.getArray()[row][column] = 5; 
                        GameBoard.getCoveredArray()[row][column] = 5;
                        break;
                    }

                }
            }
        }
        else
        {
            result = "input the right numbers foo";
        }
        return result;
    }

}