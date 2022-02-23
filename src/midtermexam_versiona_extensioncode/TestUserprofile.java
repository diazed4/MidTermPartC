/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class TestUserprofile {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Please enter a name: ");
         String userName = input.nextLine();
         
         System.out.println("Of the genres Comedy, Drama, Action or Mystery which is your favourite?");
         String genre = input.nextLine();
         
         
         UserProfile user = new UserProfile(userName, genre);
         System.out.print("Congrats "+ user.getUserID() + " your profile was successfully made.");
         
     }
}
