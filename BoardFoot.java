import java.util.Scanner;
/**
 * The function that calculates the length of a board foot.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-11-05
 */

class BoardFoot {
  static double calculate(double width, double height) {
    final int area = 144;
    final double lengthAnswer;
    final double lengthDouble;

    lengthAnswer = area / width / height;
    lengthDouble = Math.round(lengthAnswer * 100.0) / 100.0;
    return lengthDouble;
  }

  public static void main(String[] args) {
    final String widthString;
    final String heightString;
    final double width;
    final double height;
    double length = -1;

    Scanner myobj = new Scanner(System.in);
    System.out.println("This program figures out the length of a wooden board that is 1"
                    + " board foot in dimension. (1 board foot is 144 inches³" 
                    + " of wood.");
    System.out.print("Enter the width(inch): ");
    widthString = myobj.next();
    System.out.print("Enter the height(inch): ");
    heightString = myobj.next();

    width = Double.parseDouble(widthString);
    height = Double.parseDouble(heightString);
    try {
      if (width <= 0 || height <= 0) {
        System.out.println("\nPlease enter a positive number!");
      } else {
        length = calculate(width, height);
      }
      System.out.println("\nThe wood should be " + length + " inches long.");
    } catch (Exception e) {
      System.out.println("\nInvalid number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
