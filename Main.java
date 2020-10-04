import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int number;
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to exit.");
      number = input.nextInt();
    }
    while(number > 0);
    System.out.println("All done");
    }
  }

