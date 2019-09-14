public class GameBoard
{
    private static int[][] array;
    private static int[][] coveredArray = new int[10][10]; // could be in a constructor but this makes it so the grid consists of 0s
    public GameBoard() // default constructor
    {
        int[][] ar = new int[10][10];
        array = ar;
    }

    public static int[][] getArray()
    {
        return array;
    }

    public static int[][] getCoveredArray()
    {
        return coveredArray;
    }

    public void layout()
    {
        for(int ro = 0; ro<array.length; ro++) // prints the guiding numbers at the top of the array
        {
            if(ro == 0) // if the first num is 0 add another set of spaces to make formatting look nice
                System.out.print("   " + ro + "  ");
            else // add spaces between guiding numbers
                System.out.print(ro + "  ");
        }
        System.out.println();

        for(int row = 0; row<array.length; row++)
        {

            for(int col = 0; col<array[row].length; col++)
            {
                if(col == 0) // if the loop is at the beginning of each row
                {
                    System.out.print((char)(row + 65) + "  "); // prints guiding letters on the left side of the array
                }

                System.out.print(getCoveredArray()[row][col] + "  "); // prints covered array of 0s
            }
            System.out.print("\n");
        }
    }

}