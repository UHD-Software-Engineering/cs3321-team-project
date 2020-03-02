/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.*;
import java.util.*;
import person.users;

/**
 *
 * @author Jose Silva
 */
public class writerUser {
    public void addStudent() {
        int ID = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Student first name: ");
        String firstName = input.next();
        System.out.print("Student last name: ");
        String lastName = input.next();
        System.out.print("Student username: ");
        String username = input.next();
        System.out.print("Student password: ");
        int password = input.nextInt();

        ID = ID + 1;

        users Student = new users(firstName, lastName, username, ID, password);
        try {
            boolean exists = new File("userList.txt").exists();
            FileOutputStream fos = new FileOutputStream("userList.txt", true);
            ObjectOutputStream oos = exists
                    ? new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fos);
            oos.writeObject(Student);
            oos.flush();
            oos.close();
        } catch (IOException e) {
        }
    }
    
}
