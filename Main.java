/*
 * Program Title: 
 * Author: 
 * Date: 
 * Purpose: 
 */

class Main {
  public static void main(String[] args) {
    System.out.println("\n--- PART 3 ---\n");

    String message = "Hello World!";

    System.out.println(message.substring(1, 5));
    System.out.println(message.substring(7, 11));


    System.out.println("\n--- PART 4 ---\n");
    
    String firstName = "Fred";
    String middleName = "Edward";
    String lastName = "Smith";

    String fullName = firstName + middleName + lastName;

    System.out.println(fullName);


    System.out.println("\n--- PART 5 ---\n");

    int numLetters = fullName.length();

    System.out.println(numLetters);


    System.out.println("\n--- PART 6 ---\n");

    String row1 = "id first last";
    String row2 = "1 Rose Tyler";
    String row3 = "2 Amy Pond";
    String row4 = "3 Clara Oswald";

    System.out.println(row1);
    System.out.println(row2);
    System.out.println(row3);
    System.out.println(row4);


    System.out.println("\n--- PART 7 ---\n");

    System.out.println(row1);
    System.out.println(row2);
    System.out.println(row3);
    System.out.println(row4);
  }
}
