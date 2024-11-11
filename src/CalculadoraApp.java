import java.util.Scanner;

public class CalculadoraApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("****Calculator App****");
    //Show menu

    //check or validate that the options are within those mentioned

    int operation;
    do {
      System.out.println("""
                  1.Add
                  2.Subtraction
                  3.Multiplication
                  4.Division
                  5.Exit
              """);
      System.out.print("The operation to be carried out is? ");

      try {
        operation = Integer.parseInt(scanner.nextLine());

        if (operation >= 1 && operation <= 4) {
          System.out.print("Enter the first value: ");
          var num1 = Integer.parseInt(scanner.nextLine());
          System.out.print("Enter the second value: ");
          var num2 = Integer.parseInt(scanner.nextLine());

          int result;
          switch (operation) {
            case 1 -> { //Add
              result = num1 + num2;
              System.out.println("The sum is equal to: " + result);
            }
            case 2 -> { //Subtraction
              result = num1 - num2;
              System.out.println("The Subtraction is equal to: " + result);
            }
            case 3 -> { //Multiplication
              result = num1 * num2;
              System.out.println("The multiplication is equal to: " + result);
            }
            case 4 -> { //Division
              result = num1 / num2;
              System.out.println("The Division is equal to: " + result);
            }
          }
        } else if (operation == 5) {
          System.out.println("Exit successful.");
          break;
        } else {
          System.out.println("Invalid option. Please try again.");
        }

        System.out.println("**********************************************");
      } catch (Exception e) {
        System.out.println("Error: Operation failed: " + e.getMessage());
      }
    } while (true);


    scanner.close();
  }
}