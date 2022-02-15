import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  
  
  public static String pluralize(String word, int num){
    if (num > 1){
      return word + "s";
    }
    else if (num == 0){
      return word + "s";
    }
    else{
      return word;
    }
  }

   public static String flipNHeads(int n){
    int headsInARow = 0;
    int totalFlips = 0;
    Random myRandom = new Random();
    while (headsInARow < n){
      float myRandNum = myRandom.nextFloat();
      if (myRandNum > 0.5){
        System.out.println("Heads");
        totalFlips++;
        headsInARow++;
      }
      else {
        System.out.println("Tails");
        totalFlips++;
        headsInARow = 0;
      }
    }
    return "It took " + totalFlips + " flips to flip " + n + " heads in a row.";
  }

  public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    int second = now.getSecond();

    while (true){
      if (second != LocalDateTime.now().getSecond()){
        now = LocalDateTime.now();
        second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }
  }


  public static void main(String[] args) {
    String word = "turtle";
    int num = 3;

    System.out.println("I own " + num + " " + pluralize(word, num)+ ".");
    System.out.println(flipNHeads(1));
    clock();
  }

}
