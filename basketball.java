public class basketball {

// instance variables for each player's info
private String player;
private String position;
private int age;
private double avgLe;

  
// constructor to set up a basketball object
  public basketball(String player, String position, int age, double avgLe) {
    this.player = player;
    this.position = position;
    this.age = age;
    this.avgLe = avgLe;
  }
//returns Player name
  public String getPlayer() {
    return player;
  }
// returns player's position
  public String getPosition() {
    return position;
  }
  // returns player's age
  public int getAge() { 
    return age;
  }
  // returns players league average
  public double getAvgLe(){
    return avgLe;
  }

  // formats all of the info as a string.  
  public String toString() {
    return "Name: " + player + " - Position: " + position + " - Age: " + age + " - Average Points: " + avgLe;
  }
  
}