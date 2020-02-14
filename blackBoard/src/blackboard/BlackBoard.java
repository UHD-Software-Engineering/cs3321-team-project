/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard;

import person.admin;
import java.util.*;

/**
 *
 * @author Jose Silva
 */
public class BlackBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        String flag2 = "y";
        admin test = new admin();
        do {
            test.addStudents();
            System.out.println("This is the student name: " + test.getFirstName() + " " + test.getLastName() + " and it's ID:  " + test.getID());
            System.out.println("Would you like to add another student?");
            flag2 = in.next();
            if (flag2 == "y" || flag2 == "Y") {
                flag = true;
            }
            else if (flag2=="n" || flag2=="N"){
                flag = false;
            }
        } while (flag != false);
    }

}
