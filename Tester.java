import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        GameBoard newGame = new GameBoard();
        System.out.println("Welcome to Battleship!");
        System.out.println("Instructions are self-explanatory");
        System.out.println("Legend: \n     \"0\" = untested waters\n     \"8\" = miss\n     \"5\" = hit");
        System.out.println();
        
        Randomized.random(); // three ships that may overlap but overlapped parts will only be counted once
        Randomized.random();
        Randomized.random();

        
       
        while(ShipsPresent.present() != 0) // while there are 1s in the real array
        {
            newGame.layout();
            Randomized.firstAlive();
            Randomized.secondAlive();
            Randomized.thirdAlive();

            Scanner input = new Scanner(System.in);
            System.out.print("input a row letter (A-J): ");
            String letter = input.next();
            System.out.print("input a column number (0-9): ");
            input.nextLine(); // takes in white space
            String number = input.next();
            String capLetter = letter.toUpperCase(); // uppercase or lowercase input
            char charLet = capLetter.charAt(0); // this and next line changes from a string to a char to an int
            int rowrow = (int)(charLet)-65;
            int colcol = Integer.parseInt(number);
            System.out.println(Checker.check(rowrow, colcol));
        }
        System.out.println("Congrats! You completed the game!"); // if reach this point then no more ships
    }
}