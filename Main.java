/*
 * Program Title: 
 * Author: 
 * Date: 
 * Purpose: 
 */

class Main {
  public static void main(String[] args) {
    System.out.println("\n--- PART 2 ---\n");

    String message = "Hello World!";

    System.out.println(message.substring(1, 5));
    System.out.println(message.substring(7, 11));


    System.out.println("\n--- PART 3 ---\n");
    
    String firstName = "Fred";
    String middleName = "Edward";
    String lastName = "Smith";

    String fullName = firstName + middleName + lastName;

    System.out.println(fullName);


    System.out.println("\n--- PART 4 ---\n");

    int numLetters = fullName.length();

    System.out.println(numLetters);


    System.out.println("\n--- PART 5 ---\n");

    String row1 = "id\tfirst\tlast";
    String row2 = "1\tRose\tTyler";
    String row3 = "2\tAmy\t\tPond";
    String row4 = "3\tClara\tOswald";

    System.out.println(row1);
    System.out.println(row2);
    System.out.println(row3);
    System.out.println(row4);


    System.out.println("\n--- PART 6 ---\n");

    System.out.println(row1);
    System.out.println(row2);
    System.out.println(row3);
    System.out.println(row4);
  }
}
