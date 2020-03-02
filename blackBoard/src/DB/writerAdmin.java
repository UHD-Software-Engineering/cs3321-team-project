/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import person.admin;
import person.users;

/**
 *
 * @author Jose Silva
 */
public class writerAdmin {
        public void addAdmin() {
        int ID = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Admin first name: ");
        String firstName = input.next();
        System.out.print("Admin last name: ");
        String lastName = input.next();
        System.out.print("Admin username: ");
        String username = input.next();
        System.out.print("Admin password: ");
        int password = input.nextInt();

        ID = ID + 1;

        admin ad = new admin(firstName, lastName, username, ID, password);
        try {
            boolean exists = new File("userList.txt").exists();
            FileOutputStream fos = new FileOutputStream("userList.txt", true);
            ObjectOutputStream oos = exists
                    ? new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fos);
            oos.writeObject(ad);
            oos.flush();
            oos.close();
        } catch (IOException e) {
        }
    }
}
