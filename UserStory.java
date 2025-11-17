import java.util.Scanner;

public class UserStory {
// array that stores all info in basketball object
private basketball[] basketball;

  // reads data from files and builds basketball array
  public UserStory(String playerFile, String positionFile, String ageFile, String avgLeFile) {
    String[] player = FileReader.toStringArray(playerFile);
    String[] position = FileReader.toStringArray(positionFile);
    int[] ages = FileReader.toIntArray(ageFile);
    double[] avgLe = FileReader.toDoubleArray(avgLeFile);
// creates array of basketball objects
    basketball[] basketballArray = new basketball[player.length];
    for (int i = 0; i < player.length; i++) {
      basketballArray[i] = new basketball(player[i], position[i],ages[i],avgLe[i]);
    }
    //stores array in the field
    basketball = basketballArray;
  }
//counts how many players are in each position
 public int countPosition() {
    int number = 0;

    Scanner scanner = new Scanner(System.in);
//asks user for position choice
    System.out.println("Which position do you want to count?\n1) Point Guard\n2) Shooting Guard\n3) Small Forward\n4) Power Forward\n5) Center\nChoose a number 1-5: ");
    int userInput = scanner.nextInt(); // gets user's choice
// For each choice, loop through players and count matches
    if (userInput == 1){
     for (basketball positionValue : basketball){
       // checks if position equals PG
        if (positionValue.getPosition().equals("PG")){
          number++;
        }
      }
    }

    if (userInput == 2){
      for (basketball positionValue : basketball){
        // checks if position equals SG
        if (positionValue.getPosition().equals("SG")){
          number++;
        }
      }
    }

    if (userInput == 3){
      for (basketball positionValue : basketball){
        // checks if position equals SF
        if (positionValue.getPosition().equals("SF")){
          number++;
        }
      }
    }

    if (userInput == 4){
      for (basketball positionValue : basketball){
        // checks if position equals PF
        if (positionValue.getPosition().equals("PF")){
          number++;
        }
      }
    }

    if (userInput == 5){
      for (basketball positionValue : basketball){
        // checks if position equals C
        if (positionValue.getPosition().equals("C")){
          number++;
        }
      }
    }
// prints based on position and number found
    System.out.println();
    System.out.println("Number of players in that position: " + number);
    System.out.println();

    return number; // returns count
}
// calculate the average age of all players. 
  public double averageAge() {
    int totalAge = 0; // adds all the ages
    // adds each player to the total
    for (basketball player : basketball) {
        totalAge += player.getAge();
    }
    // finds average by dividing total age by number of players
    double avgAge = (double) totalAge / basketball.length;

    // prints result
    System.out.println();
     System.out.println("The average age of the NBA players is: " + avgAge);
    System.out.println();

    return avgAge; // returns average age of all players
}
  // Calculates the average points per game for all players
  public double averagePoints() {
    double totalPoints = 0; // stores total of player's points
// adds each player's scoring average
    for (basketball player : basketball) {
        totalPoints += player.getAvgLe(); 
    }
// finds averaage points by dividing the total by length
    double average = totalPoints /basketball.length;
// prints result
    System.out.println();
System.out.println("The average points of all players is: " + average);
   System.out.println();

      return average; // returns average of all players
}
  // toString method is used to convert everything in basketball to readable string
   public String toString(){
    String result = ""; // holds info
    for (basketball player : basketball){
      // adds new line for each player
      result+=player+"\n";
    }
// returns full list
    return result; 
  }
  }
 
  






  