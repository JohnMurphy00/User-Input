
package user.input;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //Creates Scanner, name "sc"
    System.out.println("Please enter the details below.");
    System.out.print("First Name: ");
    String answer = sc.nextLine();
    //Uses scanner to detect input
    System.out.print("Last Name: ");
    String LastName = sc.nextLine();
    System.out.print("Class Year: ");
    String Class = sc.nextLine();
    System.out.print("Login Name: ");
    String Log = sc.nextLine();
    System.out.print("Predicted Grade: ");
    String Grade = sc.nextLine();
    
    //Next prints out the information given in the code
    System.out.println("");
    System.out.println("Your Information; ");
    System.out.println("        First Name: " +answer);
    System.out.println("        Last Name: " +LastName);
    System.out.println("        Class Year: " +Class);
    System.out.println("        Login Name: " +Log);
    System.out.println("        Predicted Grade " +Grade);
    
    
    
    
   
    
    
        
    }
    
}
