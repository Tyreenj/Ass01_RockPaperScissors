import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);

        //Strings for Player Input
        String playerA;
        String playerB;
        //String for would you like to play again?
        String playAgain;

        //Do while for play again
        boolean againBool = false;
        do {
            //Do while for Player A input error
            boolean aDone = false;
            do {
                System.out.print("What does player A play? Rock:R Paper:P or Scissors:S : "); //Player A move?
                playerA = in.nextLine();

                //if statement for checking if input is in correct format
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    aDone = true;

                    //Do while for Player B input error
                    boolean bDone = false;
                    do {
                        System.out.print("What does player B play? Rock:R Paper:P or Scissors:S : "); //Player B move?
                        playerB = in.nextLine();

                        //if statement for checking if input is in correct format
                        if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                        {
                            //if statement for if player A plays Rock
                            if (playerA.equalsIgnoreCase("R")) {
                                if (playerB.equalsIgnoreCase("R")) {    //Rock vs Rock
                                    System.out.println("It's a tie! R - R");
                                } else if (playerB.equalsIgnoreCase("P")) {     //Rock vs Paper
                                    System.out.println("Player B Wins! R - P");
                                } else {
                                    System.out.println("Player A Wins! R - S");     //Rock vs Scissors
                                }
                            } else if (playerA.equalsIgnoreCase("P")) { //if statement for if player A plays Paper
                                if (playerB.equalsIgnoreCase("P")) { //Paper vs Paper
                                    System.out.println("It's a tie! P - P");
                                } else if (playerB.equalsIgnoreCase("S")) { //Paper vs Scissors
                                    System.out.println("Player B Wins! P - S");
                                } else {    //Paper vs Rock
                                    System.out.println("Player A Wins! P - R");
                                }
                            } else //For if player A plays Scissors
                            {
                                if (playerB.equalsIgnoreCase("S"))      //Scissors vs Scissors
                                {
                                    System.out.println("It's a tie! S - S");
                                } else if (playerB.equalsIgnoreCase("R"))       //Scissors vs Rock
                                {
                                    System.out.println("Player B Wins! S - R");
                                } else      //Scissors vs Paper
                                {
                                    System.out.println("Player A Wins! S - P");
                                }
                            }
                            //End player B error checking
                            bDone = true;
                        } else {    //Player B error catch
                            System.out.println("That is not a valid move for Player B! " + playerB);
                        }
                    } while (!bDone);
                } else {    //Player A error checking
                    System.out.println("That is not a valid move for Player A! " + playerA);
                }
            } while (!aDone);
            System.out.print("Would you like to play again? Y/N: "); //Play again?
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("N"))    //if statement checks if player wants to play again
            {
                againBool = true;
            }
        } while(!againBool);
    }
}