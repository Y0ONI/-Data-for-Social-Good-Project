import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    // creates UserStory object and loads player data from files
    UserStory basketballPlayers = new UserStory("player.txt","position.txt","age.txt","avgLe.txt");
    // prints all players and their information
      System.out.print(basketballPlayers);
   // Lets user choose a position and counts how many players match it
    basketballPlayers.countPosition();
    // Calculates and prints the average age of all players
    basketballPlayers.averageAge();
   // Calculates and prints the average points per game of all players
    basketballPlayers.averagePoints();



    


    
    
    
  }
}