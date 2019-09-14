public class Randomized
{
    // disclaimer: this only sometimes works...i thought of it last minute
    
    private static int count; // counts how many times the class/method was called 
    private static int[] firstH = new int[2]; // array that stores randomized numbers based on count and vertOrHoriz
    private static int[] firstV = new int[2]; // same
    private static int[] secondH = new int[2]; // same
    private static int[] secondV = new int[2]; // same
    private static int[] thirdH = new int[2]; // same
    private static int[] thirdV = new int[2]; // same
    private static int coun1; 
    private static int coun2;
    private static int coun3;
    
    public static int[][] random()
    {
        int first = (int)(Math.random() * 7); // goes up to 7 so not oob
        int second = (int)(Math.random() * 7);
        int vertOrHoriz = (int)(Math.random() * 2); // this num determines whether the ship is vertical or horizontal
 
        if(vertOrHoriz == 1) // horiz
        {
            GameBoard.getArray()[first][second] = 1;
            GameBoard.getArray()[first][second + 1] = 1;
            GameBoard.getArray()[first][second + 2] = 1;

        }
        else // vert
        {

            GameBoard.getArray()[first][second] = 1;
            GameBoard.getArray()[first+1][second] = 1;
            GameBoard.getArray()[first+2][second] = 1;

        }
        count++;
        if(count == 1 && vertOrHoriz == 1)
        {
            firstH[0] = first;
            firstH[1] = second;
        }
        
        else if(count == 1 && vertOrHoriz == 0)
        {
            firstV[0] = first;
            firstV[1] = second;
        }
        
        if(count == 2 && vertOrHoriz == 1)
        {
            secondH[0] = first;
            secondH[1] = second;
        }
        
        else if(count == 2 && vertOrHoriz == 0)
        {
            secondV[0] = first;
            secondV[1] = second;
        }
        
        if(count == 3 && vertOrHoriz == 1)
        {
            thirdH[0] = first;
            thirdH[1] = second;
        }
       
        else if(count == 3 && vertOrHoriz == 0)
        {
            thirdV[0] = first;
            thirdV[1] = second;
        }
//         System.out.print(firstV[0] + "  "+ firstV[1]);
//         System.out.print(secondV[0] + "  "+ secondV[1]);
//         System.out.print(thirdV[0] + "  "+ thirdV[1]);
        return GameBoard.getArray();
    }
    
    public static boolean firstAlive()
    {
//         System.out.print(firstH[0] + " " + firstH[1]);
//         System.out.print(firstV[0] + " " + firstV[1]);

        if(firstH[0] != 0 && firstH[1] != 0) // if the array is filled with randomized numbers
        {
            if(GameBoard.getArray()[firstH[0]][firstH[1]] == 5 && GameBoard.getArray()[firstH[0]][firstH[1]+1] == 5 && GameBoard.getArray()[firstH[0]][firstH[1]+2] == 5) // if the ship is sunk
            {
                coun1++; // this increments every time the program reaches here
                if(coun1 == 1) // only the first time the ship is sunk
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        
        else if(firstV[0] != 0 && firstV[1] != 0)
        {
            if(GameBoard.getArray()[firstV[0]][firstV[1]] == 5 && GameBoard.getArray()[firstV[0]+1][firstV[1]] == 5 && GameBoard.getArray()[firstV[0]+2][firstV[1]] == 5)
            {
                coun1++;
                if(coun1 == 1)
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        return true;
    }
    
    public static boolean secondAlive()
    {
//         System.out.print(secondH[0] + " " + secondH[1]);
//         System.out.print(secondV[0] + " " + secondV[1]);

        if(secondH[0] != 0 && secondH[1] != 0)
        {
            if(GameBoard.getArray()[secondH[0]][secondH[1]] == 5 && GameBoard.getArray()[secondH[0]][secondH[1]+1] == 5 && GameBoard.getArray()[secondH[0]][secondH[1]+2] == 5)
            {
                coun2++;
                if(coun2 == 1)
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        
        else if(secondV[0] != 0 && secondV[1] != 0)
        {
            if(GameBoard.getArray()[secondV[0]][secondV[1]] == 5 && GameBoard.getArray()[secondV[0]+1][secondV[1]] == 5 && GameBoard.getArray()[secondV[0]+2][secondV[1]] == 5)
            {
                coun2++;
                if(coun2 == 1)
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        return true;
    }
    
    public static boolean thirdAlive()
    {
//         System.out.print(thirdH[0] + " " + thirdH[1]);
//         System.out.print(thirdV[0] + " " + thirdV[1]);

        if(thirdH[0] != 0 && thirdH[1] != 0)
        {
            if(GameBoard.getArray()[thirdH[0]][thirdH[1]] == 5 && GameBoard.getArray()[thirdH[0]][thirdH[1]+1] == 5 && GameBoard.getArray()[thirdH[0]][thirdH[1]+2] == 5)
            {
                coun3++;
                if(coun3 == 1)
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        
        else if(thirdV[0] != 0 && thirdV[1] != 0)
        {
            if(GameBoard.getArray()[thirdV[0]][thirdV[1]] == 5 && GameBoard.getArray()[thirdV[0]+1][thirdV[1]] == 5 && GameBoard.getArray()[thirdV[0]+2][thirdV[1]] == 5)
            {
                coun3++;
                if(coun3 == 1)
                    System.out.println("sunkkkkkk");
                return false;
            }
        }
        return true;
    }
}