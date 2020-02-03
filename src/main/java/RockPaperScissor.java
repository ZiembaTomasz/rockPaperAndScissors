import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? How many rounds?");
        String name = sc.next();
        int rounds = sc.nextInt();
        Boolean end = false;
        int playerWin = 0;
        int computerWin = 0;
        Random randomGenerator = new Random();
        System.out.println("Hello  " + name + "\nkey 1 - play \"Rock\",\n" +
                "key 2 - zagranie \"paper\",\n" +
                "key 3 - zagranie \"scissor\",\n" +
                "key x - end of the game, preceded by a question \"Do you really want to end the game?\",\n" +
                "key n - Do you want to start again?, preceded by a question \"Are you sure you want to end the current game?\",");
        while(!end){
            System.out.println("Make a move");
            int playerMove = sc.nextInt();
            int computerMove = randomGenerator.nextInt(3) + 1;
            if(playerMove == 1 && computerMove == 2){
                computerWin ++;
                System.out.println("Computer beat the player with a paper and won!!");
            }
            else if(playerMove == 1 && computerMove == 3){
                playerWin ++;
                System.out.println("Player beat the computer with a stone and won!!");
            }
            else if(playerMove == 2 && computerMove == 1){
                playerWin ++;
                System.out.println("Player beat the computer with a paper and won!!");
            }
            else if(playerMove == 2 && computerMove == 3){
                computerWin ++;
                System.out.println("Computer beat the player with a scissors and won!!");
            }
            else if(playerMove == 3 && computerMove == 2){
                playerWin++;
                System.out.println("Player beat the computer with a scissor and won!!");
            }
            else if(playerMove == 3 && computerMove == 1){
                computerWin++;
                System.out.println("Computer beat the player with rock and won!!");
            }
            else if(playerMove > 3){
                System.out.println("Wrong number");
            }
            else{
                System.out.println("Tie");
            }
            if(playerWin == rounds || computerWin == rounds){
                end = true;
            }

        }
        System.out.println("Players scores " + playerWin);
        System.out.println("Computers scores " + computerWin);
    }
}
